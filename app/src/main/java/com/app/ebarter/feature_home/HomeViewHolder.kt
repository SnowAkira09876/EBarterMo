package com.app.ebarter.feature_home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.ItemHomeBinding
import com.app.ebarter.pojos.ProductModel

class HomeViewHolder(private val binding: ItemHomeBinding) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bind(
        model: ProductModel, listener: (model : ProductModel?, view : View?) -> Unit
    ) {
        binding.model = model
        binding.btnRequest.setOnClickListener { listener.invoke(model, binding.btnRequest) }
    }
}