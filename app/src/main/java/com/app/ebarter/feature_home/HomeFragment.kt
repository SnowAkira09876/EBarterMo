package com.app.ebarter.feature_home

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.graphics.drawable.InsetDrawable
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.R
import com.app.ebarter.databinding.FragmentHomeBinding
import com.app.ebarter.feature_home.dialog.addoffer.BSheetAddOffer
import com.app.ebarter.feature_home.dialog.updateproduct.BSheetUpdateProduct
import com.app.ebarter.pojos.ProductModel
import com.app.ebarter.pojos.SearchEvent
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var rv: RecyclerView
    private lateinit var adapter: HomeAdapter
    private lateinit var viewModel: HomeViewModel
    private lateinit var options: FirestoreRecyclerOptions.Builder<ProductModel>
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]

        val user = FirebaseAuth.getInstance().currentUser
        val query = db.collection("product")
            .orderBy("date", Query.Direction.DESCENDING)
            .whereEqualTo("requestStatus", "Pending")

        options = FirestoreRecyclerOptions.Builder<ProductModel>()
            .setQuery(query, ProductModel::class.java)

        adapter = HomeAdapter(
            options.build()
        ) { model, view ->
            showMenu(view, model, !user?.uid.equals(model?.ownerId))
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, parent, false)
        onsetViewBinding()
        onsetViews()
        adapter.startListening()
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onSearchEvent(event: SearchEvent) {
        val query = db.collection("product")
            .orderBy("date", Query.Direction.DESCENDING)
            .whereEqualTo("requestStatus", "Pending")
            .whereEqualTo("category", event.search)

        options = FirestoreRecyclerOptions.Builder<ProductModel>()
            .setQuery(query, ProductModel::class.java)
        adapter.updateOptions(options.build())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        adapter.stopListening()
    }

    private fun onsetViewBinding() {
        rv = binding.rv
    }

    private fun onsetViews() {
        rv.adapter = adapter
        rv.itemAnimator = null

        viewModel.deleteProductLiveData.observe(viewLifecycleOwner) {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
        }
    }

    @SuppressLint("RestrictedApi")
    private fun showMenu(v: View?, model: ProductModel?, request: Boolean) {
        val popupMenu = PopupMenu(requireContext(), v!!)
        popupMenu.menuInflater.inflate(R.menu.menu_product, popupMenu.menu)

        val menuBuilder = popupMenu.menu as MenuBuilder
        menuBuilder.setOptionalIconsVisible(true)
        menuBuilder.visibleItems.forEach {
            val iconMarginPx = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                10.0F, resources.displayMetrics
            ).toInt()

            if (it.icon != null) {
                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
                    it.icon = InsetDrawable(it.icon, iconMarginPx, 0, iconMarginPx, 0)

                } else {
                    it.icon =
                        object : InsetDrawable(it.icon, iconMarginPx, 0, iconMarginPx, 0) {
                            override fun getIntrinsicWidth(): Int {
                                return intrinsicHeight + iconMarginPx + iconMarginPx
                            }
                        }
                }
            }
        }

        if (request) {
            popupMenu.menu.findItem(R.id.menu_product_request).isEnabled = true
            popupMenu.menu.findItem(R.id.menu_product_edit).isEnabled = false
            popupMenu.menu.findItem(R.id.menu_product_delete).isEnabled = false
        } else {
            popupMenu.menu.findItem(R.id.menu_product_request).isEnabled = false
            popupMenu.menu.findItem(R.id.menu_product_edit).isEnabled = true
            popupMenu.menu.findItem(R.id.menu_product_delete).isEnabled = true
        }

        popupMenu.setOnMenuItemClickListener()
        {
            when (it.itemId) {
                R.id.menu_product_request -> {
                    val dialog = BSheetAddOffer()
                    val bundle = Bundle()
                    bundle.putParcelable("model", model!!)
                    dialog.arguments = bundle
                    dialog.show(childFragmentManager, null)

                    return@setOnMenuItemClickListener true
                }

                R.id.menu_product_edit -> {
                    val dialog = BSheetUpdateProduct()
                    val bundle = Bundle()
                    bundle.putParcelable("model", model!!)
                    dialog.arguments = bundle
                    dialog.show(childFragmentManager, null)
                    return@setOnMenuItemClickListener true
                }

                R.id.menu_product_delete -> {
                    MaterialAlertDialogBuilder(requireActivity())
                        .setTitle("Delete Post")
                        .setMessage("Are you sure you want to delete ${model?.description}?")
                        .setPositiveButton(
                            "Delete"
                        ) { _: DialogInterface?, _: Int ->
                            viewModel.deleteProduct(model!!)
                        }
                        .setNegativeButton("Cancel") { _: DialogInterface?, _: Int -> }
                        .create()
                        .show()
                    return@setOnMenuItemClickListener true
                }
            }

            return@setOnMenuItemClickListener false
        }

        popupMenu.show()
    }
}