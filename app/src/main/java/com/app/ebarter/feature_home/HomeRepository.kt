package com.app.ebarter.feature_home

import com.app.ebarter.core.StorageData
import com.app.ebarter.pojos.ProductModel
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Single

class HomeRepository(private val storageData: StorageData){
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun deleteProduct(model: ProductModel): Single<String> {
        return Single.create { emitter ->
            db.collection("product")
                .document(model.id!!)
                .delete()
                .continueWithTask { task ->
                    if (task.isSuccessful) {
                        return@continueWithTask storageData.delete(model.storagePath!!)
                    } else throw task.exception!!
                }
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        emitter.onSuccess("Post has been deleted successfully")
                    }
                }
                .addOnFailureListener {
                    emitter.onError(it)
                }
        }
    }
}