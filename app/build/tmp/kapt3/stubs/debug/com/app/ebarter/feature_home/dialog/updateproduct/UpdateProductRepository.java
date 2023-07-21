package com.app.ebarter.feature_home.dialog.updateproduct;

import android.net.Uri;
import com.app.ebarter.core.StorageData;
import com.app.ebarter.pojos.ProductModel;
import com.app.ebarter.utils.ImageFactory;
import com.google.firebase.firestore.FirebaseFirestore;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductRepository;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "imageFactory", "Lcom/app/ebarter/utils/ImageFactory;", "getImageFactory", "()Lcom/app/ebarter/utils/ImageFactory;", "setImageFactory", "(Lcom/app/ebarter/utils/ImageFactory;)V", "storage", "Lcom/app/ebarter/core/StorageData;", "getStorage", "()Lcom/app/ebarter/core/StorageData;", "setStorage", "(Lcom/app/ebarter/core/StorageData;)V", "updateProduct", "Lio/reactivex/rxjava3/core/Observable;", "", "model", "Lcom/app/ebarter/pojos/ProductModel;", "app_debug"})
public final class UpdateProductRepository {
    @javax.inject.Inject
    public com.app.ebarter.core.StorageData storage;
    @javax.inject.Inject
    public com.app.ebarter.utils.ImageFactory imageFactory;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    @javax.inject.Inject
    public UpdateProductRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.core.StorageData getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull
    com.app.ebarter.core.StorageData p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.utils.ImageFactory getImageFactory() {
        return null;
    }
    
    public final void setImageFactory(@org.jetbrains.annotations.NotNull
    com.app.ebarter.utils.ImageFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<java.lang.Integer> updateProduct(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
        return null;
    }
}