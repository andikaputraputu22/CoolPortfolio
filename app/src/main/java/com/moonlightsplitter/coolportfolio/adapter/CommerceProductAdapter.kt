package com.moonlightsplitter.coolportfolio.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moonlightsplitter.coolportfolio.databinding.AdapterCommerceProductBinding
import com.moonlightsplitter.coolportfolio.models.CommerceProductModel
import com.moonlightsplitter.coolportfolio.utils.StaticController

class CommerceProductAdapter(
    private val context: Context,
    private val products: List<CommerceProductModel>,
    private val listener: OnAdapterListener
): RecyclerView.Adapter<CommerceProductAdapter.ViewHolder>() {

    interface OnAdapterListener {
        fun onClick(product: CommerceProductModel)
    }

    class ViewHolder(val binding: AdapterCommerceProductBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterCommerceProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.binding.nameProduct.text = product.name
        holder.binding.priceProduct.text = product.price
        val photo = StaticController.getImageResource(product.photo, context)
        holder.binding.photoProduct.setImageDrawable(photo)
        holder.itemView.setOnClickListener { listener.onClick(product) }
    }

    override fun getItemCount() = products.size
}