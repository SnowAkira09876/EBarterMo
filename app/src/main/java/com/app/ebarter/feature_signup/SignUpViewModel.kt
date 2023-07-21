package com.app.ebarter.feature_signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class SignUpViewModel : ViewModel() {
    private val signUpRepository = SignUpRepository()
    private val signUpMutableLiveData = MutableLiveData<String>()
    private val disposables: CompositeDisposable = CompositeDisposable()

    val signUpLiveData: LiveData<String> get() = signUpMutableLiveData

    fun signUp(name: String, email: String, password: String) {
        signUpRepository
            .signUp(name, email, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                object : SingleObserver<Unit> {
                    override fun onSubscribe(d: Disposable) {
                        disposables.add(d)
                    }

                    override fun onSuccess(s: Unit) {
                        signUpMutableLiveData.postValue(String())
                    }

                    override fun onError(e: Throwable) {
                        signUpMutableLiveData.postValue(e.message)
                    }
                })
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}