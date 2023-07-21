package com.app.ebarter.feature_review;

import com.app.ebarter.pojos.ProductModel;
import com.google.firebase.firestore.FirebaseFirestore;
import io.reactivex.rxjava3.core.Single;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/app/ebarter/feature_review/ReviewRepository;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "deleteReview", "Lio/reactivex/rxjava3/core/Single;", "", "model", "Lcom/app/ebarter/pojos/ProductModel;", "app_debug"})
public final class ReviewRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    public ReviewRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<java.lang.String> deleteReview(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
        return null;
    }
}