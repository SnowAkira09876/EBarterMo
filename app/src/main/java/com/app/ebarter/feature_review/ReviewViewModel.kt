package com.app.ebarter.feature_review

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.ebarter.pojos.ProductModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class ReviewViewModel : ViewModel() {
    private var reviewRepository = ReviewRepository()
    private val deleteReviewMutableLiveData = MutableLiveData<String>()
    private val disposables: CompositeDisposable = CompositeDisposable()

    val deleteReviewLiveData: LiveData<String> get() = deleteReviewMutableLiveData

    fun deleteReview(model: ProductModel) {
        reviewRepository.deleteReview(model).subscribeOn(
            Schedulers.io()
        )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<String> {
                override fun onSubscribe(d: Disposable) {
                    disposables.add(d)
                }

                override fun onError(e: Throwable) {
                    deleteReviewMutableLiveData.postValue(e.message)
                }

                override fun onSuccess(t: String) {
                    deleteReviewMutableLiveData.postValue(t)
                }

            })
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }

}