package com.app.ebarter.feature_home.dialog.addproduct

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

class AddProductRepository  @Inject constructor(){
    @Inject
    lateinit var storage: StorageData
    @Inject
    lateinit var imageFactory: ImageFactory

    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun addProduct(model: ProductModel): Observable<Int> {
        return Observable.create { emitter: ObservableEmitter<Int> ->
            db.collection("product")
                .add(model)
                .addOnCompleteListener { task: Task<DocumentReference> ->
                    if (task.isSuccessful) {
                        val documentRef = task.result
                        val documentId = documentRef.id
                        documentRef.update("id", documentId)
                        storage.insert(
                            "product",
                            documentId,
                            imageFactory.compressImage(Uri.parse(model.filePathUri)),
                            object : StorageData.StorageConsumer {
                                override fun onProgress(progress: Int) {
                                    emitter.onNext(progress)
                                }

                                override fun onSuccess(
                                    link: String, storagePath: String
                                ) {
                                    documentRef.update("imageLink", link)
                                    documentRef.update(
                                        "storagePath", storagePath
                                    )
                                    documentRef.update("requestStatus", "Pending")
                                }

                                override fun onError(e: Throwable?) {
                                    emitter.onError(e!!)
                                }
                            })
                    }
                }
                .addOnFailureListener { error: Exception? -> emitter.onError(error!!) }
        }
    }
}