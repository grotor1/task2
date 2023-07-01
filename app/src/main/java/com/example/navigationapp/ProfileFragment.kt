package com.example.navigationapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navigationapp.databinding.FragmentProfileBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.run {
            val name = arguments?.getString(ARG_CLASSNAME)
            Log.d("", name ?: "")
            Snackbar.make(root, name ?: "", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_CLASSNAME = "ARG_CLASSNAME"

        fun createBundle(name: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_CLASSNAME, name)
            return bundle
        }
    }
}