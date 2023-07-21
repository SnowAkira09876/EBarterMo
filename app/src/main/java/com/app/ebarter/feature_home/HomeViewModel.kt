package com.app.ebarter.feature_home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.ebarter.core.StorageData
import com.app.ebarter.pojos.ProductModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val storageData: StorageData
) : ViewModel() {

    private val deleteProductMutableLiveData = MutableLiveData<String>()
    private val disposables: CompositeDisposable = CompositeDisposable()
    private var homeRepository: HomeRepository = HomeRepository(storageData)

    val deleteProductLiveData: LiveData<String> get() = deleteProductMutableLiveData

    fun deleteProduct(model: ProductModel) {
        homeRepository.deleteProduct(model).subscribeOn(
            Schedulers.io()
        )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<String> {
                override fun onSubscribe(d: Disposable) {
                    disposables.add(d)
                }

                override fun onError(e: Throwable) {
                }

                override fun onSuccess(t: String) {
                    deleteProductMutableLiveData.postValue(t)
                }

            })
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}