package com.app.ebarter.feature_profile.dialog.profile;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.app.ebarter.R;
import com.app.ebarter.StartApplication;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileWorker;", "Landroidx/work/rxjava3/RxWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "filePathUri", "", "name", "notificationManager", "Landroid/app/NotificationManager;", "post", "Landroidx/core/app/NotificationCompat$Builder;", "updateProfileRepository", "Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileRepository;", "getUpdateProfileRepository", "()Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileRepository;", "setUpdateProfileRepository", "(Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileRepository;)V", "createWork", "Lio/reactivex/rxjava3/core/Single;", "Landroidx/work/ListenableWorker$Result;", "getNotificationBuilder", "Companion", "app_debug"})
@androidx.hilt.work.HiltWorker
public final class UpdateProfileWorker extends androidx.work.rxjava3.RxWorker {
    @javax.inject.Inject
    public com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository updateProfileRepository;
    @org.jetbrains.annotations.NotNull
    private final androidx.core.app.NotificationCompat.Builder post = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String filePathUri = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "NAME";
    private static final int POST_ID = 4;
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.feature_profile.dialog.profile.UpdateProfileWorker.Companion Companion = null;
    
    @dagger.assisted.AssistedInject
    public UpdateProfileWorker(@dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @dagger.assisted.Assisted
    @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository getUpdateProfileRepository() {
        return null;
    }
    
    public final void setUpdateProfileRepository(@org.jetbrains.annotations.NotNull
    com.app.ebarter.feature_profile.dialog.profile.UpdateProfileRepository p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Single<androidx.work.ListenableWorker.Result> createWork() {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder getNotificationBuilder(android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileWorker$Companion;", "", "()V", "NAME", "", "POST_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}