package com.app.ebarter.feature_signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class SignInViewModel : ViewModel() {
    private val signInRepository = SignInRepository()
    private val signInMutableLiveData = MutableLiveData<String>()
    private val disposables: CompositeDisposable = CompositeDisposable()

    val signInLiveData: LiveData<String> get() = signInMutableLiveData

    fun signIn(email: String, password: String) {
        signInRepository
            .signIn(email, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                object : SingleObserver<Unit> {
                    override fun onSubscribe(d: Disposable) {
                        disposables.add(d)
                    }

                    override fun onSuccess(result: Unit) {
                        signInMutableLiveData.postValue(String())
                    }

                    override fun onError(e: Throwable) {
                        signInMutableLiveData.postValue(e.message)
                    }
                })
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}