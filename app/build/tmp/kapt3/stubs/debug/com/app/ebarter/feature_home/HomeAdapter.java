package com.app.ebarter.feature_home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.ebarter.databinding.ItemHomeBinding;
import com.app.ebarter.pojos.ProductModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/ebarter/feature_home/HomeAdapter;", "Lcom/firebase/ui/firestore/FirestoreRecyclerAdapter;", "Lcom/app/ebarter/pojos/ProductModel;", "Lcom/app/ebarter/feature_home/HomeViewHolder;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "model", "Landroid/view/View;", "view", "", "(Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class HomeAdapter extends com.firebase.ui.firestore.FirestoreRecyclerAdapter<com.app.ebarter.pojos.ProductModel, com.app.ebarter.feature_home.HomeViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<com.app.ebarter.pojos.ProductModel, android.view.View, kotlin.Unit> listener = null;
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull
    com.firebase.ui.firestore.FirestoreRecyclerOptions<com.app.ebarter.pojos.ProductModel> options, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.app.ebarter.pojos.ProductModel, ? super android.view.View, kotlin.Unit> listener) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.app.ebarter.feature_home.HomeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.app.ebarter.feature_home.HomeViewHolder holder, int position, @org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
    }
}