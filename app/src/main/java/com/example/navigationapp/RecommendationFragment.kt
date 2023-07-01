package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentRecommendationBinding

class RecommendationFragment : Fragment(R.layout.fragment_recommendation) {
    private var binding: FragmentRecommendationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecommendationBinding.bind(view)

        binding?.run {
            button2.setOnClickListener {
                findNavController().navigate(
                    R.id.action_recommendationFragment_to_profileFragment,
                    ProfileFragment.createBundle("RecommendationFragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}