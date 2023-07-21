package com.app.ebarter.feature_review

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.FragmentReviewBinding
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReviewFragment : Fragment() {
    private lateinit var binding: FragmentReviewBinding
    private lateinit var rv: RecyclerView
    private lateinit var adapter: ReviewAdapter
    private lateinit var viewModel: ReviewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser
        viewModel = ViewModelProvider(requireActivity())[ReviewViewModel::class.java]

        val query = db.collection("review")
            .orderBy("date", Query.Direction.DESCENDING)
            .whereEqualTo("requestUserId", (user?.uid))

        val options = FirestoreRecyclerOptions.Builder<ProductModel>()
            .setQuery(
                query,
                ProductModel::class.java
            )
            .build()
        adapter = ReviewAdapter(options) {
            val builder = MaterialAlertDialogBuilder(requireActivity())
            builder.apply {
                setTitle("Delete Review")
                setMessage("Are you sure you want to delete ${it.description}?")
                    .setPositiveButton("Delete") { dialog, which ->
                        viewModel.deleteReview(it)
                    }
                    .setNegativeButton("Cancel") { dialog, which ->
                    }
            }
            builder.create().show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = FragmentReviewBinding.inflate(inflater, parent, false)
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

        viewModel.deleteReviewLiveData.observe(viewLifecycleOwner) {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
        }
    }
}