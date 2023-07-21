package com.app.ebarter

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.app.ebarter.databinding.ActivityMainBinding
import com.app.ebarter.feature_home.HomeFragment
import com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct
import com.app.ebarter.feature_profile.ProfileFragment
import com.app.ebarter.feature_profile.dialog.profile.BSheetProfile
import com.app.ebarter.feature_request.RequestFragment
import com.app.ebarter.feature_review.ReviewFragment
import com.app.ebarter.feature_signin.SignInActivity
import com.app.ebarter.pojos.SearchEvent
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.elevation.SurfaceColors
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var tabLayoutMediator: TabLayoutMediator
    private lateinit var fab: FloatingActionButton
    private lateinit var toolbar: MaterialToolbar
    private lateinit var searchView: SearchView
    private lateinit var searchViewMenuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen: SplashScreen = installSplashScreen()
        window.navigationBarColor = SurfaceColors.SURFACE_2.getColor(this)
        super.onCreate(savedInstanceState)
        val user = FirebaseAuth.getInstance().currentUser
        if (user == null) {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        } else {
            binding = ActivityMainBinding.inflate(layoutInflater)
            onsetViewBinding()
            onsetViews()
        }
    }

    override fun onStart() {
        super.onStart()
        tabLayoutMediator.attach()
    }

    override fun onStop() {
        super.onStop()
        tabLayoutMediator.detach()
    }

    private fun onsetViewBinding() {
        viewPager = binding.pager
        tabLayout = binding.tabLayout
        fab = binding.fab
        toolbar = binding.toolbar
        searchViewMenuItem = toolbar.menu.findItem(R.id.menu_main_search)
        searchView = searchViewMenuItem.actionView as SearchView
    }

    private fun onsetViews() {
        setContentView(binding.root)
        val pagerAdapter = ScreenSlidePagerAdapter()
        viewPager.adapter = pagerAdapter

        tabLayoutMediator = TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 ->
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_home)

                1 ->
                    tab.icon =
                        ContextCompat.getDrawable(this, R.drawable.ic_notification)

                2 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_review)

                3 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_profile)
            }
        }

        if (VERSION_CODES.M <= Build.VERSION.SDK_INT && checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(arrayOf(Manifest.permission.CAMERA), 1)
        }

        fab.setOnClickListener {
            BSheetAddProduct().show(
                supportFragmentManager, null
            )
        }

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab?.position == 0) {
                    searchViewMenuItem.isVisible = true
                    fab.show()

                } else {
                    searchViewMenuItem.apply {
                        isVisible = false
                        if (isActionViewExpanded) collapseActionView()
                    }
                    fab.hide()
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_main_sign_out -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Sign Out")
                        .setMessage("Are you sure you want to sign out your account?")
                        .setPositiveButton(
                            "Okay"
                        ) { _: DialogInterface?, _: Int ->
                            FirebaseAuth.getInstance().signOut()
                            startActivity(Intent(this, SignInActivity::class.java))
                            finish()
                        }
                        .setNegativeButton("Cancel") { _: DialogInterface?, _: Int -> }
                        .create()
                        .show()
                    return@setOnMenuItemClickListener true
                }

                R.id.menu_main_edit -> BSheetProfile().show(supportFragmentManager, null)

                R.id.menu_main_search -> {
                    it.expandActionView()
                    return@setOnMenuItemClickListener true
                }
            }

            return@setOnMenuItemClickListener false
        }
        searchView.queryHint = "Search Category"
        searchView.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String): Boolean {
                    EventBus.getDefault().post(SearchEvent(query))
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    return true
                }
            })

        FirebaseAuth.getInstance().currentUser?.reload()?.addOnSuccessListener {
            FirebaseAuth.getInstance().currentUser?.apply {
                if (!isEmailVerified) {
                    val builder = MaterialAlertDialogBuilder(this@MainActivity)
                    builder.apply {
                        setTitle("Verify Email")
                        setCancelable(false)
                        setMessage("We have sent you an email. Kindly verify your account so you can continue using our service.")
                            .setPositiveButton("Verify") { dialog, which ->
                                sendEmailVerification()
                            }
                    }
                    builder.create().show()
                }
            }
        }
    }

    private inner class ScreenSlidePagerAdapter :
        FragmentStateAdapter(supportFragmentManager, lifecycle) {
        override fun getItemCount(): Int = 4

        override fun createFragment(position: Int): Fragment {

            return when (position) {
                0 -> HomeFragment()
                1 -> RequestFragment()
                2 -> ReviewFragment()
                3 -> ProfileFragment()
                else -> null
            } ?: throw NullPointerException("Fragment is null")
        }
    }
}