package com.app.ebarter;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.work.Configuration;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;

@dagger.hilt.android.HiltAndroidApp
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/app/ebarter/StartApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "createNotificationChannel", "", "id", "", "name", "description", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "onCreate", "Companion", "app_debug"})
public final class StartApplication extends android.app.Application implements androidx.work.Configuration.Provider {
    @javax.inject.Inject
    public androidx.hilt.work.HiltWorkerFactory workerFactory;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String POST = "Post";
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.StartApplication.Companion Companion = null;
    
    public StartApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.hilt.work.HiltWorkerFactory getWorkerFactory() {
        return null;
    }
    
    public final void setWorkerFactory(@org.jetbrains.annotations.NotNull
    androidx.hilt.work.HiltWorkerFactory p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void createNotificationChannel(java.lang.String id, java.lang.String name, java.lang.String description) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/ebarter/StartApplication$Companion;", "", "()V", "POST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}