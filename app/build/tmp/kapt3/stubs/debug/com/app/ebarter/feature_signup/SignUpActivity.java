package com.app.ebarter.feature_signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.app.ebarter.MainActivity;
import com.app.ebarter.databinding.ActivitySignUpBinding;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/app/ebarter/feature_signup/SignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/app/ebarter/databinding/ActivitySignUpBinding;", "btnNext", "Landroid/widget/Button;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "progress", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "teConfirm", "Lcom/google/android/material/textfield/TextInputEditText;", "teEmail", "teFullName", "teLocation", "tePassword", "tlConfirm", "Lcom/google/android/material/textfield/TextInputLayout;", "tlEmail", "tlFullName", "tlLocation", "tlPassword", "viewModel", "Lcom/app/ebarter/feature_signup/SignUpViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onsetViewBinding", "onsetViews", "app_debug"})
public final class SignUpActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.app.ebarter.databinding.ActivitySignUpBinding binding;
    private com.google.android.material.textfield.TextInputLayout tlFullName;
    private com.google.android.material.textfield.TextInputLayout tlEmail;
    private com.google.android.material.textfield.TextInputLayout tlLocation;
    private com.google.android.material.textfield.TextInputLayout tlPassword;
    private com.google.android.material.textfield.TextInputLayout tlConfirm;
    private com.google.android.material.textfield.TextInputEditText teFullName;
    private com.google.android.material.textfield.TextInputEditText teEmail;
    private com.google.android.material.textfield.TextInputEditText teLocation;
    private com.google.android.material.textfield.TextInputEditText tePassword;
    private com.google.android.material.textfield.TextInputEditText teConfirm;
    private android.widget.Button btnNext;
    private com.app.ebarter.feature_signup.SignUpViewModel viewModel;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposables;
    private com.google.android.material.progressindicator.LinearProgressIndicator progress;
    
    public SignUpActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void onsetViewBinding() {
    }
    
    private final void onsetViews() {
    }
}