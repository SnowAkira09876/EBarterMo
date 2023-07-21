package com.app.ebarter.feature_home;

import com.app.ebarter.core.StorageData;
import com.app.ebarter.pojos.ProductModel;
import com.google.firebase.firestore.FirebaseFirestore;
import io.reactivex.rxjava3.core.Single;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/ebarter/feature_home/HomeRepository;", "", "storageData", "Lcom/app/ebarter/core/StorageData;", "(Lcom/app/ebarter/core/StorageData;)V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "deleteProduct", "Lio/reactivex/rxjava3/core/Single;", "", "model", "Lcom/app/ebarter/pojos/ProductModel;", "app_release"})
public final class HomeRepository {
    @org.jetbrains.annotations.NotNull
    private final com.app.ebarter.core.StorageData storageData = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    public HomeRepository(@org.jetbrains.annotations.NotNull
    com.app.ebarter.core.StorageData storageData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<java.lang.String> deleteProduct(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
        return null;
    }
}