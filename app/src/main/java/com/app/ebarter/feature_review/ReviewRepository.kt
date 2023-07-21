package com.app.ebarter.feature_review

import com.app.ebarter.pojos.ProductModel
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Single

class ReviewRepository {
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun deleteReview(model: ProductModel): Single<String> {
        return Single.create { emitter ->
            db.collection("review")
                .document(model.requestId!!)
                .delete()
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        emitter.onSuccess("Review has been deleted successfully")
                    }
                }
                .addOnFailureListener {
                    emitter.onError(it)
                }
        }
    }
}