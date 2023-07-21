package com.app.ebarter.feature_review

import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.ItemReviewBinding
import com.app.ebarter.pojos.ProductModel

class ReviewViewHolder(private val binding: ItemReviewBinding) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bind(model: ProductModel, listener : (model : ProductModel) -> Unit) {
        binding.model = model
        itemView.setOnClickListener{
            listener.invoke(model)
        }
    }
}