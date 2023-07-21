package com.app.ebarter.feature_request.dialog.viewoffer

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
class ViewOfferViewModel @Inject constructor(private val storageData: StorageData) : ViewModel() {
    private val viewOfferRepository = ViewOfferRepository(storageData)
    private val acceptMutableLiveData = MutableLiveData<String>()
    private val deleteMutableLiveData = MutableLiveData<String>()
    private val disposables: CompositeDisposable = CompositeDisposable()

    val acceptLiveData: LiveData<String> get() = acceptMutableLiveData
    val deleteLiveData: LiveData<String> get() = deleteMutableLiveData

    fun acceptRequest(model: ProductModel) {
        viewOfferRepository
            .acceptRequest(model)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<Unit> {
                override fun onSubscribe(d: Disposable) {
                    disposables.add(d)
                }

                override fun onSuccess(u: Unit) {
                    acceptMutableLiveData.postValue(String())
                }

                override fun onError(e: Throwable) {
                    acceptMutableLiveData.postValue(e.message)
                }
            }
            )
    }

    fun deleteRequest(model: ProductModel) {
        viewOfferRepository
            .deleteRequest(model)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<Unit> {
                override fun onSubscribe(d: Disposable) {
                    disposables.add(d)
                }

                override fun onSuccess(u: Unit) {
                    deleteMutableLiveData.postValue(String())
                }

                override fun onError(e: Throwable) {
                    deleteMutableLiveData.postValue(e.message)
                }
            }
            )
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}