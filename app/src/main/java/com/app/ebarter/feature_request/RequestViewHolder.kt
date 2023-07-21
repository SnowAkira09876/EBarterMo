package com.app.ebarter.feature_request

import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.ItemRequestBinding
import com.app.ebarter.pojos.ProductModel

class RequestViewHolder(private val binding: ItemRequestBinding) :
    RecyclerView.ViewHolder(
        binding.root
    ) {
    fun bind(model: ProductModel?, listener: (model : ProductModel) -> Unit) {
        binding.model = model
        itemView.setOnClickListener { listener.invoke(model!!) }
    }
}