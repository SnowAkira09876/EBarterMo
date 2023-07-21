package com.app.ebarter.feature_home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.app.ebarter.core.StorageData;
import com.app.ebarter.pojos.ProductModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/app/ebarter/feature_home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "storageData", "Lcom/app/ebarter/core/StorageData;", "(Lcom/app/ebarter/core/StorageData;)V", "deleteProductLiveData", "Landroidx/lifecycle/LiveData;", "", "getDeleteProductLiveData", "()Landroidx/lifecycle/LiveData;", "deleteProductMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "homeRepository", "Lcom/app/ebarter/feature_home/HomeRepository;", "deleteProduct", "", "model", "Lcom/app/ebarter/pojos/ProductModel;", "onCleared", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.ebarter.core.StorageData storageData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> deleteProductMutableLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull
    private com.app.ebarter.feature_home.HomeRepository homeRepository;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.app.ebarter.core.StorageData storageData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getDeleteProductLiveData() {
        return null;
    }
    
    public final void deleteProduct(@org.jetbrains.annotations.NotNull
    com.app.ebarter.pojos.ProductModel model) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}