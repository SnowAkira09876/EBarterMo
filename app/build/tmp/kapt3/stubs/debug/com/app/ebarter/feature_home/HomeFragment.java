package com.app.ebarter.feature_home;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.app.ebarter.R;
import com.app.ebarter.databinding.FragmentHomeBinding;
import com.app.ebarter.feature_home.dialog.addoffer.BSheetAddOffer;
import com.app.ebarter.feature_home.dialog.updateproduct.BSheetUpdateProduct;
import com.app.ebarter.pojos.ProductModel;
import com.app.ebarter.pojos.SearchEvent;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J$\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\'H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/app/ebarter/feature_home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/app/ebarter/feature_home/HomeAdapter;", "binding", "Lcom/app/ebarter/databinding/FragmentHomeBinding;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions$Builder;", "Lcom/app/ebarter/pojos/ProductModel;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/app/ebarter/feature_home/HomeViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "bundle", "onDestroyView", "onSearchEvent", "event", "Lcom/app/ebarter/pojos/SearchEvent;", "onStart", "onStop", "onsetViewBinding", "onsetViews", "showMenu", "v", "model", "request", "", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.app.ebarter.databinding.FragmentHomeBinding binding;
    private androidx.recyclerview.widget.RecyclerView rv;
    private com.app.ebarter.feature_home.HomeAdapter adapter;
    private com.app.ebarter.feature_home.HomeViewModel viewModel;
    private com.firebase.ui.firestore.FirestoreRecyclerOptions.Builder<com.app.ebarter.pojos.ProductModel> options;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle) {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onSearchEvent(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.SearchEvent event) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void onsetViewBinding() {
    }
    
    private final void onsetViews() {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showMenu(android.view.View v, com.app.ebarter.pojos.ProductModel model, boolean request) {
    }
}