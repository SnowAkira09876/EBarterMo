package com.app.ebarter.feature_signin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.app.ebarter.MainActivity
import com.app.ebarter.databinding.ActivitySignInBinding
import com.app.ebarter.feature_signup.SignUpActivity
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var btnNext: Button
    private lateinit var btnCreateAccount: Button
    private lateinit var btnForgot: Button
    private lateinit var viewModel: SignInViewModel
    private lateinit var tlEmail: TextInputLayout
    private lateinit var tlPassword: TextInputLayout
    private lateinit var teEmail: TextInputEditText
    private lateinit var tePassword: TextInputEditText
    private lateinit var progress: LinearProgressIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[SignInViewModel::class.java]
        onsetViewBinding()
        onsetViews()
    }

    private fun onsetViewBinding() {
        btnNext = binding.btnNext
        btnCreateAccount = binding.btnCreateAccount
        btnForgot = binding.btnForgot
        tlEmail = binding.tlEmail
        tlPassword = binding.tlPassword
        teEmail = binding.teEmail
        tePassword = binding.tePassword
        progress = binding.lpb
    }

    private fun onsetViews() {
        setContentView(binding.root)
        btnCreateAccount.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }
        btnNext.setOnClickListener {
            val email = teEmail.text.toString().trim()
            val password = tePassword.text.toString().trim()
            if (email.isEmpty()) tlEmail.error = "Email is empty"
            if (password.isEmpty()) tlPassword.error = "Password is empty"
            if (email.isNotEmpty() && password.isNotEmpty()) {
                progress.visibility = View.VISIBLE
                viewModel.signIn(email, password)
            }
        }
        btnForgot.setOnClickListener {
            val email = teEmail.text.toString().trim()
            if (email.isEmpty()) tlEmail.error = "Email is empty"
            else {
                Snackbar.make(
                    binding.root,
                    "Kindly check your email for reset instructions",
                    Snackbar.LENGTH_INDEFINITE
                )
                    .setTextMaxLines(4)
                    .setAction("Okay") { }
                    .show()
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
            }
        }

        viewModel.signInLiveData.observe(this) {
            if (it.isNotEmpty()) {
                progress.visibility = View.GONE

                Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
                return@observe
            }

            startActivity(Intent(this@SignInActivity, MainActivity::class.java))
            finish()
        }
    }
}