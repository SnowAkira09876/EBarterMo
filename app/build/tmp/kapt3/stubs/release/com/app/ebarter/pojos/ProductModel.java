package com.app.ebarter.pojos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.firestore.ServerTimestamp;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010]\u001a\u00020^H\u0016J\u0018\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020^H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001c\u00100\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR\u001c\u00103\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR\u001c\u00106\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR\u001c\u00109\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010\u000bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u000bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010\u000bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u000bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\t\"\u0004\bV\u0010\u000bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\t\"\u0004\bY\u0010\u000bR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\t\"\u0004\b\\\u0010\u000b\u00a8\u0006d"}, d2 = {"Lcom/app/ebarter/pojos/ProductModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "description", "getDescription", "setDescription", "details", "getDetails", "setDetails", "filePathUri", "getFilePathUri", "setFilePathUri", "id", "getId", "setId", "imageLink", "getImageLink", "setImageLink", "location", "getLocation", "setLocation", "ownerId", "getOwnerId", "setOwnerId", "ownerUserName", "getOwnerUserName", "setOwnerUserName", "payment", "getPayment", "setPayment", "phone", "getPhone", "setPhone", "profileLink", "getProfileLink", "setProfileLink", "reason", "getReason", "setReason", "requestDescription", "getRequestDescription", "setRequestDescription", "requestDetails", "getRequestDetails", "setRequestDetails", "requestFilePathUri", "getRequestFilePathUri", "setRequestFilePathUri", "requestId", "getRequestId", "setRequestId", "requestImageLink", "getRequestImageLink", "setRequestImageLink", "requestProfileLink", "getRequestProfileLink", "setRequestProfileLink", "requestStatus", "getRequestStatus", "setRequestStatus", "requestStoragePath", "getRequestStoragePath", "setRequestStoragePath", "requestUserContact", "getRequestUserContact", "setRequestUserContact", "requestUserId", "getRequestUserId", "setRequestUserId", "requestUserLocation", "getRequestUserLocation", "setRequestUserLocation", "requestUserName", "getRequestUserName", "setRequestUserName", "storagePath", "getStoragePath", "setStoragePath", "describeContents", "", "writeToParcel", "", "dest", "flag", "Companion", "app_release"})
public final class ProductModel implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ownerId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ownerUserName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable
    private java.lang.String category;
    @org.jetbrains.annotations.Nullable
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable
    private java.lang.String location;
    @org.jetbrains.annotations.Nullable
    private java.lang.String reason;
    @org.jetbrains.annotations.Nullable
    private java.lang.String details;
    @org.jetbrains.annotations.Nullable
    private java.lang.String payment;
    @org.jetbrains.annotations.Nullable
    private java.lang.String imageLink;
    @org.jetbrains.annotations.Nullable
    private java.lang.String storagePath;
    @org.jetbrains.annotations.Nullable
    private java.lang.String profileLink;
    @org.jetbrains.annotations.Nullable
    private java.lang.String filePathUri;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestProfileLink;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestUserId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestUserName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestUserLocation;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestUserContact;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestDescription;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestDetails;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestImageLink;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestFilePathUri;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestStoragePath;
    @com.google.firebase.firestore.ServerTimestamp
    @org.jetbrains.annotations.Nullable
    private java.util.Date date;
    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.app.ebarter.pojos.ProductModel> CREATOR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.pojos.ProductModel.Companion Companion = null;
    
    public ProductModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOwnerId() {
        return null;
    }
    
    public final void setOwnerId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOwnerUserName() {
        return null;
    }
    
    public final void setOwnerUserName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPayment() {
        return null;
    }
    
    public final void setPayment(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImageLink() {
        return null;
    }
    
    public final void setImageLink(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStoragePath() {
        return null;
    }
    
    public final void setStoragePath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfileLink() {
        return null;
    }
    
    public final void setProfileLink(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFilePathUri() {
        return null;
    }
    
    public final void setFilePathUri(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestId() {
        return null;
    }
    
    public final void setRequestId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestProfileLink() {
        return null;
    }
    
    public final void setRequestProfileLink(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestUserId() {
        return null;
    }
    
    public final void setRequestUserId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestUserName() {
        return null;
    }
    
    public final void setRequestUserName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestUserLocation() {
        return null;
    }
    
    public final void setRequestUserLocation(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestUserContact() {
        return null;
    }
    
    public final void setRequestUserContact(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestDescription() {
        return null;
    }
    
    public final void setRequestDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestDetails() {
        return null;
    }
    
    public final void setRequestDetails(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestStatus() {
        return null;
    }
    
    public final void setRequestStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestImageLink() {
        return null;
    }
    
    public final void setRequestImageLink(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestFilePathUri() {
        return null;
    }
    
    public final void setRequestFilePathUri(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestStoragePath() {
        return null;
    }
    
    public final void setRequestStoragePath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
    
    private ProductModel(android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel dest, int flag) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/app/ebarter/pojos/ProductModel$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/app/ebarter/pojos/ProductModel;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}