package com.app.ebarter.feature_home.dialog.updateproduct

import android.net.Uri
import com.app.ebarter.core.StorageData
import com.app.ebarter.pojos.ProductModel
import com.app.ebarter.utils.ImageFactory
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import javax.inject.Inject

class UpdateProductRepository  @Inject constructor(){
    @Inject
    lateinit var storage: StorageData
    @Inject
    lateinit var imageFactory: ImageFactory
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun updateProduct(model: ProductModel): Observable<Int> {
        return Observable.create { emitter: ObservableEmitter<Int> ->
            val map = HashMap<String, Any>()
            map["id"] = model.id!!
            map["ownerId"] = model.ownerId!!
            map["ownerUserName"] = model.ownerUserName!!
            map["title"] = model.description!!
            map["phone"] = model.phone!!
            map["location"] = model.location!!
            map["category"] = model.reason!!
            map["message"] = model.details!!
            map["filePathUri"] = model.filePathUri!!
            map["requestStatus"] = model.requestStatus!!
            map["profileLink"] = model.profileLink!!

            db.collection("product")
                .document(model.id!!)
                .update(map)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        storage.insert(
                            "product",
                            model.id!!,
                            imageFactory.compressImage(Uri.parse(model.filePathUri)),
                            object : StorageData.StorageConsumer {
                                override fun onProgress(progress: Int) {
                                    emitter.onNext(progress)
                                }

                                override fun onSuccess(
                                    link: String, storagePath: String
                                ) {
                                    val mapImage = HashMap<String, Any>()
                                    map["imageLink"] = link
                                    map["storagePath"] = storagePath

                                    db.collection("product")
                                        .document(model.id!!)
                                        .update(mapImage)
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