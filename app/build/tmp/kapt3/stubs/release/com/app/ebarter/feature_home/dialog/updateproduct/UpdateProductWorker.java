package com.app.ebarter.feature_home.dialog.updateproduct;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.app.ebarter.R;
import com.app.ebarter.StartApplication;
import com.app.ebarter.feature_home.common.HomeConstants;
import com.app.ebarter.pojos.ProductModel;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductWorker;", "Landroidx/work/rxjava3/RxWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "notificationManager", "Landroid/app/NotificationManager;", "post", "Landroidx/core/app/NotificationCompat$Builder;", "updateProductRepository", "Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductRepository;", "getUpdateProductRepository", "()Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductRepository;", "setUpdateProductRepository", "(Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductRepository;)V", "createWork", "Lio/reactivex/rxjava3/core/Single;", "Landroidx/work/ListenableWorker$Result;", "getNotificationBuilder", "Companion", "app_release"})
@androidx.hilt.work.HiltWorker
public final class UpdateProductWorker extends androidx.work.rxjava3.RxWorker {
    @javax.inject.Inject
    public com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository updateProductRepository;
    @org.jetbrains.annotations.NotNull
    private final androidx.core.app.NotificationCompat.Builder post = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.NotificationManager notificationManager = null;
    private static final int POST_ID = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductWorker.Companion Companion = null;
    
    @dagger.assisted.AssistedInject
    public UpdateProductWorker(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository getUpdateProductRepository() {
        return null;
    }
    
    public final void setUpdateProductRepository(@org.jetbrains.annotations.NotNull
    com.app.ebarter.feature_home.dialog.updateproduct.UpdateProductRepository p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Single<androidx.work.ListenableWorker.Result> createWork() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder getNotificationBuilder(android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/updateproduct/UpdateProductWorker$Companion;", "", "()V", "POST_ID", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}