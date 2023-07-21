package com.app.ebarter.feature_home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.ebarter.databinding.ItemHomeBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class HomeAdapter(
    options: FirestoreRecyclerOptions<ProductModel?>,
    private val listener: (model : ProductModel?, view : View?) -> Unit

) : FirestoreRecyclerAdapter<ProductModel, HomeViewHolder>(options) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    public override fun onBindViewHolder(
        holder: HomeViewHolder,
        position: Int,
        model: ProductModel
    ) {
        holder.bind(model, listener)
    }
}