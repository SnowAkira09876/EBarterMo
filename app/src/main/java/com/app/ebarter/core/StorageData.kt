package com.app.ebarter.core

import android.net.Uri
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import javax.inject.Inject

class StorageData @Inject constructor() {
    private val mStorageRef: StorageReference = FirebaseStorage.getInstance().reference

    fun insert(
        child: String,
        id: String,
        imageByteArray: ByteArray,
        consumer: StorageConsumer
    ) {
        val fileReference = mStorageRef
            .child(child)
            .child(id)
            .child("Image.jpeg")

        fileReference
            .putBytes(imageByteArray)
            .addOnProgressListener { taskSnapshot: UploadTask.TaskSnapshot ->
                val progress = (100 * taskSnapshot.bytesTransferred
                        / taskSnapshot.totalByteCount)
                consumer.onProgress(progress.toInt())
            }
            .addOnSuccessListener { taskSnapshot: UploadTask.TaskSnapshot ->
                val result =
                    taskSnapshot.metadata?.reference?.downloadUrl
                val path = taskSnapshot.metadata!!.reference!!.path
                result?.addOnSuccessListener { uri: Uri ->
                    consumer.onSuccess(
                        uri.toString(),
                        path
                    )
                }
            }
            .addOnFailureListener { e: Exception? -> consumer.onError(e) }
    }

    fun delete(path: String): Task<Void> {
        return mStorageRef.child(path).delete()
    }

    interface StorageConsumer {
        fun onSuccess(link: String, storagePath: String)
        fun onProgress(progress: Int)
        fun onError(e: Throwable?)
    }
}