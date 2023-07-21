package com.app.ebarter.feature_review;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.app.ebarter.pojos.ProductModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/app/ebarter/feature_review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "deleteReviewLiveData", "Landroidx/lifecycle/LiveData;", "", "getDeleteReviewLiveData", "()Landroidx/lifecycle/LiveData;", "deleteReviewMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "reviewRepository", "Lcom/app/ebarter/feature_review/ReviewRepository;", "deleteReview", "", "model", "Lcom/app/ebarter/pojos/ProductModel;", "onCleared", "app_release"})
public final class ReviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.app.ebarter.feature_review.ReviewRepository reviewRepository;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> deleteReviewMutableLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public ReviewViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getDeleteReviewLiveData() {
        return null;
    }
    
    public final void deleteReview(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}