package com.app.ebarter.feature_signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.app.ebarter.MainActivity
import com.app.ebarter.databinding.ActivitySignUpBinding
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.disposables.CompositeDisposable

@AndroidEntryPoint
class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var tlFullName: TextInputLayout
    private lateinit var tlEmail: TextInputLayout
    private lateinit var tlLocation: TextInputLayout
    private lateinit var tlPassword: TextInputLayout
    private lateinit var tlConfirm: TextInputLayout
    private lateinit var teFullName: TextInputEditText
    private lateinit var teEmail: TextInputEditText
    private lateinit var teLocation: TextInputEditText
    private lateinit var tePassword: TextInputEditText
    private lateinit var teConfirm: TextInputEditText
    private lateinit var btnNext: Button
    private lateinit var viewModel: SignUpViewModel
    private lateinit var disposables: CompositeDisposable
    private lateinit var progress: LinearProgressIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[SignUpViewModel::class.java]
        disposables = CompositeDisposable()
        onsetViewBinding()
        onsetViews()
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }

    private fun onsetViewBinding() {
        tlFullName = binding.tlFullName
        tlEmail = binding.tlEmail
        tlLocation = binding.tlLocation
        tlPassword = binding.tlPassword
        tlConfirm = binding.tlConfirmPassword
        teFullName = binding.teFullName
        teEmail = binding.teEmail
        teLocation = binding.teLocation
        tePassword = binding.tePassword
        teConfirm = binding.teConfirmPassword
        btnNext = binding.btnNext
        progress = binding.lpb
    }

    private fun onsetViews() {
        setContentView(binding.root)
        btnNext.setOnClickListener {
            val name = teFullName.text.toString().trim()
            val email = teEmail.text.toString().trim()
            val location = teLocation.text.toString().trim()
            val password = tePassword.text.toString().trim()
            val confirm = teConfirm.text.toString().trim()
            if (name.isEmpty()) tlFullName.error = "Name is empty"
            if (email.isEmpty()) tlEmail.error = "Email is empty"
            if (location.isEmpty()) tlLocation.error = "Location is empty"
            if (password.isEmpty()) tlPassword.error = "Password is empty"
            if (confirm.isEmpty()) tlConfirm.error = "Confirm password is empty"
            if (password != confirm) {
                tlPassword.error = "Passwords not matched"
                tlConfirm.error = "Passwords not matched"
            }

            if ((name.isNotEmpty()
                        && email.isNotEmpty()
                        && location.isNotEmpty()
                        && password.isNotEmpty()
                        && confirm.isNotEmpty()) && password == confirm
            ) {
                progress.visibility = View.VISIBLE
                viewModel
                    .signUp(name, email, password)
            }
        }

        viewModel.signUpLiveData.observe(this) {
            if (it.isNotEmpty()) {
                progress.visibility = View.GONE

                Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
                return@observe
            }

            startActivity(Intent(this@SignUpActivity, MainActivity::class.java))
            finish()
            println(it)
        }
    }
}