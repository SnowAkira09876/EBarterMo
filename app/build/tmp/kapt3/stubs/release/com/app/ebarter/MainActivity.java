package com.app.ebarter;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.app.ebarter.databinding.ActivityMainBinding;
import com.app.ebarter.feature_home.HomeFragment;
import com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct;
import com.app.ebarter.feature_profile.ProfileFragment;
import com.app.ebarter.feature_profile.dialog.profile.BSheetProfile;
import com.app.ebarter.feature_request.RequestFragment;
import com.app.ebarter.feature_review.ReviewFragment;
import com.app.ebarter.feature_signin.SignInActivity;
import com.app.ebarter.pojos.SearchEvent;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.elevation.SurfaceColors;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/app/ebarter/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/app/ebarter/databinding/ActivityMainBinding;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "searchView", "Landroidx/appcompat/widget/SearchView;", "searchViewMenuItem", "Landroid/view/MenuItem;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabLayoutMediator", "Lcom/google/android/material/tabs/TabLayoutMediator;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onsetViewBinding", "onsetViews", "ScreenSlidePagerAdapter", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.app.ebarter.databinding.ActivityMainBinding binding;
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private com.google.android.material.tabs.TabLayoutMediator tabLayoutMediator;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private androidx.appcompat.widget.SearchView searchView;
    private android.view.MenuItem searchViewMenuItem;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    private final void onsetViewBinding() {
    }
    
    private final void onsetViews() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/app/ebarter/MainActivity$ScreenSlidePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "(Lcom/app/ebarter/MainActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_release"})
    final class ScreenSlidePagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public ScreenSlidePagerAdapter() {
            super(null);
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}