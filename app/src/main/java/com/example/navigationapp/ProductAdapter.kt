package com.example.navigationapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapp.databinding.ItemProductBinding

class ProductAdapter(
    private var list: List<Product>,
    private val onItemClick: (Product) -> Unit,
) : RecyclerView.Adapter<ProductItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductItem = ProductItem(
        binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        onItemClick = onItemClick,
    )

    override fun onBindViewHolder(holder: ProductItem, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}