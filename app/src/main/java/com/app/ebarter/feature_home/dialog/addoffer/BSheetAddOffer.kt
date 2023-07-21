package com.app.ebarter.feature_home.dialog.addoffer

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Build
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
import com.app.ebarter.databinding.BottomSheetAddOfferBinding
import com.app.ebarter.feature_home.common.HomeConstants.DESCRIPTION
import com.app.ebarter.feature_home.common.HomeConstants.DETAILS
import com.app.ebarter.feature_home.common.HomeConstants.FILEPATHURI
import com.app.ebarter.feature_home.common.HomeConstants.ID
import com.app.ebarter.feature_home.common.HomeConstants.IMAGELINK
import com.app.ebarter.feature_home.common.HomeConstants.LOCATION
import com.app.ebarter.feature_home.common.HomeConstants.PAYMENT
import com.app.ebarter.feature_home.common.HomeConstants.PHONE
import com.app.ebarter.feature_home.common.HomeConstants.PROFILELINK
import com.app.ebarter.feature_home.common.HomeConstants.REASON
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTCONTACT
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTDESCRIPTION
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTDETAILS
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTFILEPATHURI
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTLOCATION
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTPROFILELINK
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTUSERID
import com.app.ebarter.feature_home.common.HomeConstants.REQUESTUSERNAME
import com.app.ebarter.feature_home.common.HomeConstants.STORAGEPATH
import com.app.ebarter.feature_home.common.HomeConstants.USERID
import com.app.ebarter.feature_home.common.HomeConstants.USERNAME
import com.app.ebarter.pojos.ProductModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso

@Suppress("DEPRECATION")
class BSheetAddOffer : BottomSheetDialogFragment() {
    private lateinit var ivProduct: ShapeableImageView
    private lateinit var binding: BottomSheetAddOfferBinding

    private lateinit var tlDescription: TextInputLayout
    private lateinit var tlNumber: TextInputLayout
    private lateinit var tlLocation: TextInputLayout
    private lateinit var tlDetails: TextInputLayout

    private lateinit var teDescription: TextInputEditText
    private lateinit var tePhoneNumber: TextInputEditText
    private lateinit var teLocation: TextInputEditText
    private lateinit var teDetails: TextInputEditText

    private lateinit var btnSend: Button
    private lateinit var btnCancel: Button
    private var requestFilePathUri: String? = null
    private lateinit var workManager: WorkManager
    private lateinit var request: OneTimeWorkRequest
    private lateinit var model: ProductModel

    private val cameraActivityResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            requestFilePathUri = (ivProduct.tag as Uri).toString()
            Picasso.get().load(ivProduct.tag as Uri).into(ivProduct)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        workManager = WorkManager.getInstance(requireActivity())

        model =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) requireArguments().getParcelable(
                "model",
                ProductModel::class.java
            )!! else requireArguments().getParcelable("model")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = BottomSheetAddOfferBinding.inflate(inflater, parent, false)
        onsetViewBinding()
        onsetViews()
        return binding.root
    }

    private fun onsetViewBinding() {
        tlDescription = binding.tlDescription
        tlNumber = binding.tlPhoneNumber
        tlLocation = binding.tlLocation
        tlDetails = binding.tlDetails

        teDescription = binding.teDescription
        tePhoneNumber = binding.tePhoneNumber
        teLocation = binding.teLocation
        teDetails = binding.teDetails

        btnSend = binding.btnSendOffer
        btnCancel = binding.btnCancel
        ivProduct = binding.ivProduct
    }

    private fun onsetViews() {
        btnSend.setOnClickListener {
            val user = FirebaseAuth.getInstance().currentUser

            val description =
                teDescription.text.toString().trim()

            val contact =
                tePhoneNumber.text.toString().trim()

            val location =
                teLocation.text.toString().trim()

            val details =
                teDetails.text.toString().trim()

            if (requestFilePathUri == null) {
                Toast.makeText(
                    requireActivity(),
                    "Please select an image",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }

            if (description.isEmpty()) tlDescription.error = "Description is empty"
            if (contact.length < 11) tlNumber.error = "Number must be 11 digits"
            if (location.isEmpty()) tlLocation.error = "Location is empty"
            if (details.isEmpty()) tlDetails.error = "Details is empty"

            if (description.isNotEmpty()
                && location.isNotEmpty()
                && details.isNotEmpty()
                && contact.length == 11
                && requestFilePathUri != null
                && user != null) {

                val data = Data.Builder()
                    .putString(ID, model.id)
                    .putString(USERID, model.ownerId)
                    .putString(USERNAME, model.ownerUserName)
                    .putString(DESCRIPTION, model.description)
                    .putString(PHONE, model.phone)
                    .putString(DETAILS, model.details)
                    .putString(LOCATION, model.location)
                    .putString(REASON, model.reason)
                    .putString(PAYMENT, model.payment)
                    .putString(IMAGELINK, model.imageLink)
                    .putString(FILEPATHURI, model.filePathUri)
                    .putString(STORAGEPATH, model.storagePath)
                    .putString(PROFILELINK, model.profileLink)

                    .putString(REQUESTPROFILELINK, user.photoUrl.toString())
                    .putString(REQUESTLOCATION, location)
                    .putString(REQUESTFILEPATHURI, requestFilePathUri)
                    .putString(REQUESTCONTACT, contact)
                    .putString(REQUESTUSERID, user.uid)
                    .putString(REQUESTUSERNAME, user.displayName)
                    .putString(REQUESTDESCRIPTION, description)
                    .putString(REQUESTDETAILS, details)
                    .build()
                request =
                    OneTimeWorkRequest.Builder(AddOfferWorker::class.java)
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
        private const val POST_WORK_TAG = "RequestWork"
    }
}