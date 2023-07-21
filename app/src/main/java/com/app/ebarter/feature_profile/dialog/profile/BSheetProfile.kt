package com.app.ebarter.feature_profile.dialog.profile

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
import com.app.ebarter.R
import com.app.ebarter.databinding.BottomSheetProfileBinding
import com.app.ebarter.feature_home.common.HomeConstants.FILEPATHURI
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso

class BSheetProfile : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetProfileBinding
    private lateinit var tlName: TextInputLayout
    private lateinit var teName: TextInputEditText
    private lateinit var btnSave: Button
    private lateinit var btnCancel: Button
    private var filePathUri: String? = null
    private lateinit var ivProfile: ShapeableImageView
    private lateinit var workManager: WorkManager
    private lateinit var request: OneTimeWorkRequest

    private val cameraActivityResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            filePathUri = (ivProfile.tag as Uri).toString()
            Picasso.get().load(ivProfile.tag as Uri).into(ivProfile)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        workManager = WorkManager.getInstance(requireActivity())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetProfileBinding.inflate(inflater, container, false)
        onsetViewBinding()
        onsetViews()
        return binding.root
    }

    private fun onsetViewBinding() {
        tlName = binding.tlFullName
        teName = binding.teFullName
        btnSave = binding.btnSave
        btnCancel = binding.btnCancel
        ivProfile = binding.ivProfile
    }

    private fun onsetViews() {
        val user = FirebaseAuth.getInstance().currentUser
        teName.setText(user?.displayName)
        tlName.hint = user?.email
        Picasso.get().load(user?.photoUrl).placeholder(R.drawable.ic_placeholder).into(ivProfile)

        btnSave.setOnClickListener {
            val name = teName.text.toString().trim()

            if (name.isEmpty()) tlName.error = "Full Name is empty"

            if (filePathUri == null) {
                Toast.makeText(
                    requireActivity(),
                    "Please select a new image",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }

            if (name.isNotEmpty()
                && filePathUri != null
            ) {
                val data = Data.Builder()
                    .putString(UpdateProfileWorker.NAME, name)
                    .putString(FILEPATHURI, filePathUri)
                    .build()

                request =
                    OneTimeWorkRequest.Builder(UpdateProfileWorker::class.java)
                        .setInputData(data)
                        .build()

                workManager.enqueueUniqueWork(
                    POST_WORK_TAG, ExistingWorkPolicy.REPLACE, request
                )

                dismiss()
            }

        }

        ivProfile.setOnClickListener {
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
            ivProfile.tag = imageUri
        }

        btnCancel.setOnClickListener {
            dismiss()
        }
    }

    companion object {
        private const val POST_WORK_TAG = "ProfileWork"
    }
}