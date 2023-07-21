package com.app.ebarter.feature_home.dialog.addoffer;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.app.ebarter.databinding.BottomSheetAddOfferBinding;
import com.app.ebarter.pojos.ProductModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010#H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/app/ebarter/feature_home/dialog/addoffer/BSheetAddOffer;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/app/ebarter/databinding/BottomSheetAddOfferBinding;", "btnCancel", "Landroid/widget/Button;", "btnSend", "cameraActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "ivProduct", "Lcom/google/android/material/imageview/ShapeableImageView;", "model", "Lcom/app/ebarter/pojos/ProductModel;", "request", "Landroidx/work/OneTimeWorkRequest;", "requestFilePathUri", "", "teDescription", "Lcom/google/android/material/textfield/TextInputEditText;", "teDetails", "teLocation", "tePhoneNumber", "tlDescription", "Lcom/google/android/material/textfield/TextInputLayout;", "tlDetails", "tlLocation", "tlNumber", "workManager", "Landroidx/work/WorkManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "bundle", "onsetViewBinding", "onsetViews", "Companion", "app_release"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class BSheetAddOffer extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.google.android.material.imageview.ShapeableImageView ivProduct;
    private com.app.ebarter.databinding.BottomSheetAddOfferBinding binding;
    private com.google.android.material.textfield.TextInputLayout tlDescription;
    private com.google.android.material.textfield.TextInputLayout tlNumber;
    private com.google.android.material.textfield.TextInputLayout tlLocation;
    private com.google.android.material.textfield.TextInputLayout tlDetails;
    private com.google.android.material.textfield.TextInputEditText teDescription;
    private com.google.android.material.textfield.TextInputEditText tePhoneNumber;
    private com.google.android.material.textfield.TextInputEditText teLocation;
    private com.google.android.material.textfield.TextInputEditText teDetails;
    private android.widget.Button btnSend;
    private android.widget.Button btnCancel;
    @org.jetbrains.annotations.Nullable
    private java.lang.String requestFilePathUri;
    private androidx.work.WorkManager workManager;
    private androidx.work.OneTimeWorkRequest request;
    private com.app.ebarter.pojos.ProductModel model;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraActivityResultLauncher = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String POST_WORK_TAG = "RequestWork";
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.feature_home.dialog.addoffer.BSheetAddOffer.Companion Companion = null;
    
    public BSheetAddOffer() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle) {
        return null;
    }
    
    private final void onsetViewBinding() {
    }
    
    private final void onsetViews() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/addoffer/BSheetAddOffer$Companion;", "", "()V", "POST_WORK_TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}