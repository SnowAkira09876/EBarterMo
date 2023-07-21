package com.app.ebarter.feature_signup

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleEmitter

class SignUpRepository {
    fun signUp(name: String, email: String, password: String): Single<Unit> {
        return Single.create { emitter: SingleEmitter<Unit> ->
            val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
            mAuth.createUserWithEmailAndPassword(
                email, password
            )
                .addOnSuccessListener {

                    val user = FirebaseAuth.getInstance().currentUser
                    val request = UserProfileChangeRequest.Builder()
                        .setDisplayName(name)
                        .build()
                    user?.updateProfile(request)
                    emitter.onSuccess(Unit)
                }
                .addOnFailureListener { emitter.onError(it) }
        }
    }
}