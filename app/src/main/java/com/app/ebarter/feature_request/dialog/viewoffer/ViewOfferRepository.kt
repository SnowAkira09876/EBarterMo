package com.app.ebarter.feature_request.dialog.viewoffer

import com.app.ebarter.core.StorageData
import com.app.ebarter.pojos.ProductModel
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleEmitter

class ViewOfferRepository(private val storageData: StorageData) {
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun deleteRequest(model: ProductModel): Single<Unit> {
        return Single.create { emitter: SingleEmitter<Unit> ->

            db.collection("request")
                .document(model.requestId!!)
                .delete()
                .continueWithTask { task ->
                    println(task.result)
                    if (task.isSuccessful) {
                        return@continueWithTask storageData.delete(model.requestStoragePath!!)
                    } else throw task.exception!!
                }
                .continueWithTask { task: Task<Void> ->
                    println(task.result)
                    val map: MutableMap<String, Any> = HashMap()
                    map["requestStatus"] = "Cancelled"

                    if (task.isSuccessful) return@continueWithTask db.collection("review")
                        .document(model.requestId!!)
                        .update(map) else throw task.exception!!
                }
                .addOnCompleteListener { task: Task<Void?> ->
                    println(task.result)
                    if (task.isSuccessful) emitter.onSuccess(
                        Unit
                    )
                }
                .addOnFailureListener { t: Exception? -> emitter.onError(t!!) }
        }
    }

    fun acceptRequest(model: ProductModel): Single<Unit> {
        return Single.create { emitter: SingleEmitter<Unit> ->
            val map: MutableMap<String, Any> = HashMap()
            map["requestStatus"] = "Accepted"

            db.collection("product")
                .document(model.id!!)
                .update(map)
                .continueWithTask { task: Task<Void?> ->
                    if (task.isSuccessful) return@continueWithTask db.collection("request")
                        .document(model.requestId!!)
                        .update(map) else throw task.exception!!
                }
                .continueWithTask { task: Task<Void> ->
                    if (task.isSuccessful) return@continueWithTask db.collection("review")
                        .document(model.requestId!!)
                        .update(map) else throw task.exception!!
                }
                .addOnCompleteListener { task: Task<Void> ->
                    if (task.isSuccessful) emitter.onSuccess(
                        Unit
                    )
                }
                .addOnFailureListener { t: Exception? -> emitter.onError(t!!) }

        }
    }
}