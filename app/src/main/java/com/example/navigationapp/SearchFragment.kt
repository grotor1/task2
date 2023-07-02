package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.navigationapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {
    private var binding: FragmentSearchBinding? = null
    private var adapter: ProductAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchBinding.bind(view)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = ProductAdapter(
            list = ProductRepository.list,
            onItemClick = { product ->
                findNavController().navigate(
                    R.id.action_searchFragment_to_productFragment,
                    ProductFragment.createBundle(product.id)
                )
            }
        )
        binding?.rvProduct?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}