package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.navigationapp.databinding.FragmentProductBinding

class ProductFragment : Fragment(R.layout.fragment_product) {
    private var binding: FragmentProductBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProductBinding.bind(view)

        val glide = Glide.with(this)

        val options: RequestOptions = RequestOptions
            .diskCacheStrategyOf(DiskCacheStrategy.NONE)

        binding?.run {
            val id = arguments?.getInt(ARG_ID)
            val p = ProductRepository.getById(id ?: 0)

            tvTitle.text = p?.name
            tvDesc.text = p?.desc

            glide.load(p?.url)
                .apply(options)
                .into(ivImage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_ID = "ARG_ID"

        fun createBundle(id: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ARG_ID, id)
            return bundle
        }
    }
}