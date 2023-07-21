package com.app.ebarter.feature_profile.dialog.profile;

import android.net.Uri;
import com.app.ebarter.core.StorageData;
import com.app.ebarter.utils.ImageFactory;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/app/ebarter/feature_profile/dialog/profile/UpdateProfileRepository;", "", "()V", "imageFactory", "Lcom/app/ebarter/utils/ImageFactory;", "getImageFactory", "()Lcom/app/ebarter/utils/ImageFactory;", "setImageFactory", "(Lcom/app/ebarter/utils/ImageFactory;)V", "storage", "Lcom/app/ebarter/core/StorageData;", "getStorage", "()Lcom/app/ebarter/core/StorageData;", "setStorage", "(Lcom/app/ebarter/core/StorageData;)V", "update", "Lio/reactivex/rxjava3/core/Observable;", "", "name", "", "filePathUri", "app_debug"})
public final class UpdateProfileRepository {
    @javax.inject.Inject
    public com.app.ebarter.core.StorageData storage;
    @javax.inject.Inject
    public com.app.ebarter.utils.ImageFactory imageFactory;
    
    @javax.inject.Inject
    public UpdateProfileRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.core.StorageData getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull
    com.app.ebarter.core.StorageData p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.utils.ImageFactory getImageFactory() {
        return null;
    }
    
    public final void setImageFactory(@org.jetbrains.annotations.NotNull
    com.app.ebarter.utils.ImageFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Observable<java.lang.Integer> update(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String filePathUri) {
        return null;
    }
}