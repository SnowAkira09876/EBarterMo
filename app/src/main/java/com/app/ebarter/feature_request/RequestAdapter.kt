package com.app.ebarter.feature_request

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.ebarter.databinding.ItemRequestBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class RequestAdapter(
    options: FirestoreRecyclerOptions<ProductModel?>?, private val listener: (model : ProductModel) -> Unit
) : FirestoreRecyclerAdapter<ProductModel, RequestViewHolder>(options!!) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestViewHolder {
        return RequestViewHolder(
            ItemRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    public override fun onBindViewHolder(
        holder: RequestViewHolder,
        position: Int,
        model: ProductModel
    ) {
        holder.bind(model, listener)
    }
}