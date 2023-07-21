package com.app.ebarter.feature_home.dialog.addproduct;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
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
import com.app.ebarter.databinding.BottomSheetAddProductBinding;
import com.app.ebarter.utils.ImageFactory;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u00010-H\u0016J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/addproduct/BSheetAddProduct;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/app/ebarter/databinding/BottomSheetAddProductBinding;", "btnCancel", "Landroid/widget/Button;", "btnPost", "cameraActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "filePathUri", "", "imageFactory", "Lcom/app/ebarter/utils/ImageFactory;", "getImageFactory", "()Lcom/app/ebarter/utils/ImageFactory;", "setImageFactory", "(Lcom/app/ebarter/utils/ImageFactory;)V", "ivProduct", "Lcom/google/android/material/imageview/ShapeableImageView;", "request", "Landroidx/work/OneTimeWorkRequest;", "teCategory", "Lcom/google/android/material/textfield/TextInputEditText;", "teDescription", "teDetails", "teLocation", "teNumber", "tePayment", "teReason", "tlCategory", "Lcom/google/android/material/textfield/TextInputLayout;", "tlDescription", "tlDetails", "tlLocation", "tlNumber", "tlPayment", "tlReason", "workManager", "Landroidx/work/WorkManager;", "onCreate", "", "saveInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "bundle", "onsetViewBinding", "onsetViews", "Companion", "app_debug"})
public final class BSheetAddProduct extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @javax.inject.Inject
    public com.app.ebarter.utils.ImageFactory imageFactory;
    private com.app.ebarter.databinding.BottomSheetAddProductBinding binding;
    private com.google.android.material.imageview.ShapeableImageView ivProduct;
    private com.google.android.material.textfield.TextInputLayout tlDescription;
    private com.google.android.material.textfield.TextInputLayout tlCategory;
    private com.google.android.material.textfield.TextInputLayout tlNumber;
    private com.google.android.material.textfield.TextInputLayout tlLocation;
    private com.google.android.material.textfield.TextInputLayout tlReason;
    private com.google.android.material.textfield.TextInputLayout tlDetails;
    private com.google.android.material.textfield.TextInputLayout tlPayment;
    private com.google.android.material.textfield.TextInputEditText teDescription;
    private com.google.android.material.textfield.TextInputEditText teCategory;
    private com.google.android.material.textfield.TextInputEditText teNumber;
    private com.google.android.material.textfield.TextInputEditText teLocation;
    private com.google.android.material.textfield.TextInputEditText teReason;
    private com.google.android.material.textfield.TextInputEditText teDetails;
    private com.google.android.material.textfield.TextInputEditText tePayment;
    private android.widget.Button btnPost;
    private android.widget.Button btnCancel;
    private androidx.work.WorkManager workManager;
    private androidx.work.OneTimeWorkRequest request;
    @org.jetbrains.annotations.Nullable
    private java.lang.String filePathUri;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraActivityResultLauncher = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String POST_WORK_TAG = "AddProductWork";
    @org.jetbrains.annotations.NotNull
    public static final com.app.ebarter.feature_home.dialog.addproduct.BSheetAddProduct.Companion Companion = null;
    
    public BSheetAddProduct() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.ebarter.utils.ImageFactory getImageFactory() {
        return null;
    }
    
    public final void setImageFactory(@org.jetbrains.annotations.NotNull
    com.app.ebarter.utils.ImageFactory p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle saveInstanceState) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/ebarter/feature_home/dialog/addproduct/BSheetAddProduct$Companion;", "", "()V", "POST_WORK_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}