package com.app.ebarter.core;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/app/ebarter/core/StorageData;", "", "()V", "mStorageRef", "Lcom/google/firebase/storage/StorageReference;", "delete", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "path", "", "insert", "", "child", "id", "imageByteArray", "", "consumer", "Lcom/app/ebarter/core/StorageData$StorageConsumer;", "StorageConsumer", "app_debug"})
public final class StorageData {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.storage.StorageReference mStorageRef = null;
    
    @javax.inject.Inject
    public StorageData() {
        super();
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    java.lang.String child, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    byte[] imageByteArray, @org.jetbrains.annotations.NotNull
    com.app.ebarter.core.StorageData.StorageConsumer consumer) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.tasks.Task<java.lang.Void> delete(@org.jetbrains.annotations.NotNull
    java.lang.String path) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/app/ebarter/core/StorageData$StorageConsumer;", "", "onError", "", "e", "", "onProgress", "progress", "", "onSuccess", "link", "", "storagePath", "app_debug"})
    public static abstract interface StorageConsumer {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull
        java.lang.String link, @org.jetbrains.annotations.NotNull
        java.lang.String storagePath);
        
        public abstract void onProgress(int progress);
        
        public abstract void onError(@org.jetbrains.annotations.Nullable
        java.lang.Throwable e);
    }
}