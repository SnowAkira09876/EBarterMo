package com.app.ebarter.feature_home.dialog.addproduct

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.work.Data
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.app.ebarter.databinding.BottomSheetAddProductBinding
import com.app.ebarter.feature_home.common.HomeConstants.CATEGORY
import com.app.ebarter.feature_home.common.HomeConstants.DESCRIPTION
import com.app.ebarter.feature_home.common.HomeConstants.DETAILS
import com.app.ebarter.feature_home.common.HomeConstants.FILEPATHURI
import com.app.ebarter.feature_home.common.HomeConstants.LOCATION
import com.app.ebarter.feature_home.common.HomeConstants.PAYMENT
import com.app.ebarter.feature_home.common.HomeConstants.PHONE
import com.app.ebarter.feature_home.common.HomeConstants.PROFILELINK
import com.app.ebarter.feature_home.common.HomeConstants.REASON
import com.app.ebarter.feature_home.common.HomeConstants.USERID
import com.app.ebarter.feature_home.common.HomeConstants.USERNAME
import com.app.ebarter.utils.ImageFactory
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BSheetAddProduct : BottomSheetDialogFragment() {
    @Inject
    lateinit var imageFactory: ImageFactory
    private lateinit var binding: BottomSheetAddProductBinding
    private lateinit var ivProduct: ShapeableImageView

    private lateinit var tlDescription: TextInputLayout
    private lateinit var tlCategory: TextInputLayout
    private lateinit var tlNumber: TextInputLayout
    private lateinit var tlLocation: TextInputLayout
    private lateinit var tlReason: TextInputLayout
    private lateinit var tlDetails: TextInputLayout
    private lateinit var tlPayment: TextInputLayout

    private lateinit var teDescription: TextInputEditText
    private lateinit var teCategory: TextInputEditText
    private lateinit var teNumber: TextInputEditText
    private lateinit var teLocation: TextInputEditText
    private lateinit var teReason: TextInputEditText
    private lateinit var teDetails: TextInputEditText
    private lateinit var tePayment: TextInputEditText

    private lateinit var btnPost: Button
    private lateinit var btnCancel: Button

    private lateinit var workManager: WorkManager
    private lateinit var request: OneTimeWorkRequest
    private var filePathUri: String? = null

    private val cameraActivityResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            filePathUri = (ivProduct.tag as Uri).toString()
            Picasso.get().load(ivProduct.tag as Uri).into(ivProduct)
        }
    }

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        workManager = WorkManager.getInstance(requireActivity())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = BottomSheetAddProductBinding.inflate(inflater, parent, false)
        onsetViewBinding()
        onsetViews()
        return binding.root
    }

    private fun onsetViewBinding() {
        ivProduct = binding.ivProduct

        tlDescription = binding.tlDescription
        tlCategory = binding.tlCategory
        tlNumber = binding.tlPhoneNumber
        tlLocation = binding.tlLocation
        tlReason = binding.tlReason
        tlDetails = binding.tlDetails
        tlPayment = binding.tlPayment

        teDescription = binding.teDescription
        teCategory = binding.teCategory
        teNumber = binding.tePhoneNumber
        teLocation = binding.teLocation
        teReason = binding.teReason
        teDetails = binding.teDetails
        tePayment = binding.tePayment

        btnPost = binding.btnPost
        btnCancel = binding.btnCancel
    }

    private fun onsetViews() {
        btnPost.setOnClickListener {
            val user = FirebaseAuth.getInstance().currentUser
            val description = teDescription.text.toString().trim()
            val category = teCategory.text.toString().trim()
            val number = teNumber.text.toString().trim()
            val location = teLocation.text.toString().trim()
            val reason = teReason.text.toString().trim()
            val details = teDetails.text.toString().trim()
            val payment = tePayment.text.toString().trim()

            if (description.isEmpty()) {
                tlDescription.isErrorEnabled = true
                tlDescription.error = "Title is empty"
            }
            if (category.isEmpty()) {
                tlCategory.isErrorEnabled = true
                tlCategory.error = "Category is empty"
            }
            if (number.isEmpty()) {
                tlNumber.isErrorEnabled = true
                tlNumber.error = "Number is empty"
            }
            if (location.isEmpty()) {
                tlLocation.isErrorEnabled = true
                tlLocation.error = "Location is empty"
            }
            if (reason.isEmpty()) {
                tlReason.isErrorEnabled = true
                tlReason.error = "Reason is empty"
            }
            if (details.isEmpty()) {
                tlDetails.isErrorEnabled = true
                tlDetails.error = "Details is empty"
            }
            if (payment.isEmpty()) {
                tlPayment.isErrorEnabled = true
                tlPayment.error = "Payment is empty"
            }

            if (filePathUri == null) {
                Toast.makeText(
                    requireActivity(),
                    "Please select an image",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
            if (description.isNotEmpty()
                && category.isNotEmpty()
                && number.length == 11
                && location.isNotEmpty()
                && reason.isNotEmpty()
                && details.isNotEmpty()
                && payment.isNotEmpty()
                && filePathUri != null
                && user != null
            ) {
                val data = Data.Builder()
                    .putString(USERID, user.uid)
                    .putString(USERNAME, user.displayName)
                    .putString(CATEGORY, category)
                    .putString(DESCRIPTION, description)
                    .putString(PHONE, number)
                    .putString(LOCATION, location)
                    .putString(REASON, reason)
                    .putString(DETAILS, details)
                    .putString(PAYMENT, payment)

                    .putString(FILEPATHURI, filePathUri)
                    .putString(PROFILELINK, user.photoUrl.toString())
                    .build()

                request =
                    OneTimeWorkRequest.Builder(AddProductWorker::class.java)
                        .setInputData(data)
                        .build()

                workManager.enqueueUniqueWork(
                    POST_WORK_TAG, ExistingWorkPolicy.REPLACE, request
                )
                dismiss()
            }
        }

        btnCancel.setOnClickListener { dismiss() }
        ivProduct.setOnClickListener {
            val values = ContentValues()
            values.put(MediaStore.Images.Media.TITLE, "New Picture")
            values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")
            val imageUri = requireContext().contentResolver.insert(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                values
            )
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
            cameraActivityResultLauncher.launch(cameraIntent)
            ivProduct.tag = imageUri
        }
    }

    companion object {
        private const val POST_WORK_TAG = "AddProductWork"
    }
}