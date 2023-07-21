package com.app.ebarter.feature_profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.ebarter.databinding.ItemProfileBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class ProfileAdapter(
    options: FirestoreRecyclerOptions<ProductModel>

) : FirestoreRecyclerAdapter<ProductModel, ProfileViewHolder>(options) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(
            ItemProfileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    public override fun onBindViewHolder(
        holder: ProfileViewHolder,
        position: Int,
        model: ProductModel
    ) {
        holder.bind(model)
    }
}