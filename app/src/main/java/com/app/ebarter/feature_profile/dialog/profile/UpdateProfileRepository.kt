package com.app.ebarter.feature_profile.dialog.profile

import android.net.Uri
import com.app.ebarter.core.StorageData
import com.app.ebarter.utils.ImageFactory
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import javax.inject.Inject

class UpdateProfileRepository @Inject constructor() {
    @Inject
    lateinit var storage: StorageData
    @Inject
    lateinit var imageFactory: ImageFactory

    fun update(
        name: String,
        filePathUri: String
    ): Observable<Int> {
        return Observable.create { emitter: ObservableEmitter<Int> ->
            val user = FirebaseAuth.getInstance().currentUser

            storage.insert(
                "profile",
                user?.uid!!,
                imageFactory.compressImage(Uri.parse(filePathUri)),
                object : StorageData.StorageConsumer {
                    override fun onProgress(progress: Int) {
                        emitter.onNext(progress)
                    }

                    override fun onSuccess(
                        link: String, storagePath: String
                    ) {
                        val request = UserProfileChangeRequest.Builder()
                            .setDisplayName(name)
                            .setPhotoUri(Uri.parse(link))
                            .build()
                        user.updateProfile(request)
                    }

                    override fun onError(e: Throwable?) {
                        emitter.onError(e!!)
                    }
                })
        }
    }
}