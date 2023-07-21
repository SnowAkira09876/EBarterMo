package com.app.ebarter.feature_signin

import com.google.firebase.auth.FirebaseAuth
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleEmitter

class SignInRepository {
    fun signIn(email: String, password: String): Single<Unit> {
        return Single.create { emitter: SingleEmitter<Unit> ->
            val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
            mAuth.signInWithEmailAndPassword(
                email, password
            ).addOnSuccessListener {
                emitter.onSuccess(Unit)
            }
                .addOnFailureListener { emitter.onError(it) }
        }
    }
}