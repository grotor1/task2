package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {
    private var binding: FragmentSearchBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchBinding.bind(view)

        binding?.run {
            button2.setOnClickListener {
                findNavController().navigate(
                    R.id.action_searchFragment_to_profileFragment,
                    ProfileFragment.createBundle("SearchFragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}