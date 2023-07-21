package com.app.ebarter.feature_profile

import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.ItemProfileBinding
import com.app.ebarter.pojos.ProductModel

class ProfileViewHolder(private val binding: ItemProfileBinding) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bind(
        model: ProductModel
    ) {
        binding.model = model
    }
}