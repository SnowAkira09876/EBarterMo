package com.app.ebarter.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.app.ebarter.R
import com.squareup.picasso.Picasso

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("imageProductUri")
    fun loadProductImage(imageView: ImageView?, uri: String?) {
        Picasso.get()
            .load(uri)
            .placeholder(R.drawable.ic_placeholder)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("imageNotificationUri")
    fun loadNotificationImage(imageView: ImageView?, uri: String?) {
        Picasso.get()
            .load(uri)
            .placeholder(R.drawable.ic_placeholder)
            .fit()
            .centerCrop()
            .into(imageView)
    }
}