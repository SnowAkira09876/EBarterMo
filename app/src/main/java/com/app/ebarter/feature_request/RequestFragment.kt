package com.app.ebarter.feature_request

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app.ebarter.databinding.FragmentRequestBinding
import com.app.ebarter.feature_request.dialog.viewoffer.BSheetViewOffer
import com.app.ebarter.pojos.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class RequestFragment : Fragment() {
    private lateinit var binding: FragmentRequestBinding
    private lateinit var rv: RecyclerView
    private lateinit var adapter: RequestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db: FirebaseFirestore = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser
        val query = db.collection("request")
            .orderBy("date", Query.Direction.DESCENDING)
            .whereEqualTo("ownerId", user?.uid!!)

        val options = FirestoreRecyclerOptions.Builder<ProductModel>()
            .setQuery(
                query,
                ProductModel::class.java
            )
            .build()

        adapter = RequestAdapter(
            options
        ) { model ->
            if (model.requestStatus.equals("Pending")) {
                val dialog = BSheetViewOffer().apply {
                    val bundle = Bundle()
                    bundle.putParcelable("model", model)
                    arguments = bundle
                }

                dialog.show(childFragmentManager, null)
            } else {
                Snackbar.make(
                    binding.root,
                    "Item is already ${model.requestStatus}",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        bundle: Bundle?
    ): View {
        binding = FragmentRequestBinding.inflate(inflater, parent, false)
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