package com.app.ebarter.feature_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.FragmentProfileBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var rv: RecyclerView
    private lateinit var adapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db: FirebaseFirestore = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser
        val query =  db.collection("product")
            .orderBy("date", Query.Direction.DESCENDING)
            .whereEqualTo("ownerId", user?.uid)

        val options = FirestoreRecyclerOptions.Builder<ProductModel>()
            .setQuery(
               query,
                ProductModel::class.java
            )
            .build()
        adapter = ProfileAdapter(options)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, parent, false)
        onsetViewBinding()
        onsetViews()
        adapter.startListening()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        adapter.stopListening()
    }

    private fun onsetViewBinding() {
        rv = binding.rv
    }

    private fun onsetViews() {
        rv.adapter = adapter
    }
}