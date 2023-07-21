package com.app.ebarter.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.ByteArrayOutputStream
import javax.inject.Inject

class ImageFactory @Inject constructor(@ApplicationContext val context : Context){

    fun compressImage(imageUri: Uri) :ByteArray{
        val options = BitmapFactory.Options()
        val bitmap = BitmapFactory.decodeStream(context.contentResolver.openInputStream(imageUri), null, options)
        val outputStream = ByteArrayOutputStream()
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 80, outputStream)
        val imageBytes = outputStream.toByteArray()
        outputStream.close()
        return imageBytes
    }
}