package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentCartBinding

class CartFragment : Fragment(R.layout.fragment_cart) {
    private var binding: FragmentCartBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCartBinding.bind(view)

        binding?.run {
            button2.setOnClickListener {
                findNavController().navigate(
                    R.id.action_cartFragment_to_profileFragment,
                    ProfileFragment.createBundle("CartFragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}