package com.app.ebarter.feature_signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.app.ebarter.MainActivity;
import com.app.ebarter.databinding.ActivitySignInBinding;
import com.app.ebarter.feature_signup.SignUpActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/app/ebarter/feature_signin/SignInActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/app/ebarter/databinding/ActivitySignInBinding;", "btnCreateAccount", "Landroid/widget/Button;", "btnForgot", "btnNext", "progress", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "teEmail", "Lcom/google/android/material/textfield/TextInputEditText;", "tePassword", "tlEmail", "Lcom/google/android/material/textfield/TextInputLayout;", "tlPassword", "viewModel", "Lcom/app/ebarter/feature_signin/SignInViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onsetViewBinding", "onsetViews", "app_debug"})
public final class SignInActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.app.ebarter.databinding.ActivitySignInBinding binding;
    private android.widget.Button btnNext;
    private android.widget.Button btnCreateAccount;
    private android.widget.Button btnForgot;
    private com.app.ebarter.feature_signin.SignInViewModel viewModel;
    private com.google.android.material.textfield.TextInputLayout tlEmail;
    private com.google.android.material.textfield.TextInputLayout tlPassword;
    private com.google.android.material.textfield.TextInputEditText teEmail;
    private com.google.android.material.textfield.TextInputEditText tePassword;
    private com.google.android.material.progressindicator.LinearProgressIndicator progress;
    
    public SignInActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onsetViewBinding() {
    }
    
    private final void onsetViews() {
    }
}