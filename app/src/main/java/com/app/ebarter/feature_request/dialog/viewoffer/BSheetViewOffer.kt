package com.app.ebarter.feature_request.dialog.viewoffer

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.app.ebarter.R
import com.app.ebarter.databinding.BottomSheetViewOfferBinding
import com.app.ebarter.pojos.ProductModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BSheetViewOffer : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetViewOfferBinding
    private lateinit var ivRequest: ShapeableImageView
    private lateinit var tvDetails: TextView
    private lateinit var model: ProductModel
    private lateinit var btnAccept: Button
    private lateinit var btnDecline: Button
    private lateinit var btnCall: Button
    private lateinit var viewModel: ViewOfferViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ViewOfferViewModel::class.java]

        model = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("model", ProductModel::class.java)!!
        } else {
            arguments?.getParcelable("model")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetViewOfferBinding.inflate(inflater, container, false)
        onsetViewBinding()
        onsetViews()
        return binding.root
    }

    private fun onsetViewBinding() {
        ivRequest = binding.ivRequest
        tvDetails = binding.tvDetails
        btnAccept = binding.btnAccept
        btnDecline = binding.btnDecline
        btnCall = binding.btnCall
    }

    private fun onsetViews() {
        Picasso.get().load(model.requestImageLink).placeholder(R.drawable.ic_placeholder)
            .into(ivRequest)
        tvDetails.text = "${model.requestDetails}"

        btnAccept.setOnClickListener {
            viewModel.acceptRequest(model)
        }
        btnDecline.setOnClickListener {
            viewModel.deleteRequest(model)
        }

        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + model.requestUserContact)
            startActivity(intent)
        }

        viewModel.acceptLiveData.observe(this) {
            if (it.isNullOrEmpty()) {
                dismiss()
            }
        }

        viewModel.deleteLiveData.observe(this) {
            if (it.isNullOrEmpty()) {
                dismiss()
            }
        }
    }

}