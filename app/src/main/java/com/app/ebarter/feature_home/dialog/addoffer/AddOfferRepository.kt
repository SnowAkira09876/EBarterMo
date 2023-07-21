package com.app.ebarter.feature_home.dialog.addoffer

import android.net.Uri
import com.app.ebarter.core.StorageData
import com.app.ebarter.pojos.ProductModel
import com.app.ebarter.utils.ImageFactory
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import javax.inject.Inject

class AddOfferRepository @Inject constructor(){
    @Inject
    lateinit var storage: StorageData
    @Inject
    lateinit var imageFactory: ImageFactory
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun addRequest(model: ProductModel): Observable<Int> {
        return Observable.create { emitter: ObservableEmitter<Int> ->
            db.collection("request")
                .add(model)
                .addOnCompleteListener { task: Task<DocumentReference> ->
                    if (task.isSuccessful) {
                        val documentRef = task.result
                        val documentId = documentRef.id
                        documentRef.update("requestId", documentId)
                        storage.insert(
                            "request",
                            documentId,
                            imageFactory.compressImage(Uri.parse(model.requestFilePathUri)),
                            object : StorageData.StorageConsumer {
                                override fun onProgress(progress: Int) {
                                    emitter.onNext(progress)
                                }

                                override fun onSuccess(
                                    link: String, storagePath: String
                                ) {
                                    documentRef.update("requestImageLink", link)
                                    documentRef.update(
                                        "requestStoragePath", storagePath
                                    )
                                    model.requestStoragePath = storagePath
                                }

                                override fun onError(e: Throwable?) {
                                    emitter.onError(e!!)
                                }
                            })
                    }
                }
                .continueWithTask { task: Task<DocumentReference> ->
                    if (task.isSuccessful) {
                        val documentRef = task.result
                        val requestId = documentRef.id
                        model.requestId = requestId
                        return@continueWithTask documentRef.update("requestId", requestId)
                    } else throw task.exception!!
                }
                .continueWithTask { task: Task<Void> ->
                    if (task.isSuccessful) return@continueWithTask db.collection("review")
                        .document(model.requestId!!)
                        .set(model) else throw task.exception!!
                }
        }
    }
}