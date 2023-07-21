package com.app.ebarter.utils;

import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.app.ebarter.R;
import com.squareup.picasso.Picasso;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/app/ebarter/utils/BindingAdapters;", "", "()V", "loadNotificationImage", "", "imageView", "Landroid/widget/ImageView;", "uri", "", "loadProductImage", "app_release"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.utils.BindingAdapters INSTANCE = null;
    
    private BindingAdapters() {
        super();
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"imageProductUri"})
    public static final void loadProductImage(@org.jetbrains.annotations.Nullable
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String uri) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"imageNotificationUri"})
    public static final void loadNotificationImage(@org.jetbrains.annotations.Nullable
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String uri) {
    }
}