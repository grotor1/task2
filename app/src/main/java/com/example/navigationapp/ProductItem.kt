package com.example.navigationapp

import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapp.databinding.ItemProductBinding

class ProductItem(
    private val binding: ItemProductBinding,
    private val onItemClick: (Product) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(product: Product) {
        binding.run {
            tvTitle.text = product.name
            tvDesc.text = product.desc

            root.setOnClickListener {
                onItemClick(product)
            }
        }
    }
}