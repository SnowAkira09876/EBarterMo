package com.app.ebarter.feature_review

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.ebarter.databinding.ItemReviewBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class ReviewAdapter(
    options: FirestoreRecyclerOptions<ProductModel>,
    val listener : (model: ProductModel) -> Unit
) : FirestoreRecyclerAdapter<ProductModel, ReviewViewHolder>(
    options
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        return ReviewViewHolder(
            ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    public override fun onBindViewHolder(
        holder: ReviewViewHolder,
        position: Int,
        model: ProductModel
    ) {
        holder.bind(model, listener)
    }
}