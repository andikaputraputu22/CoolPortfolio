package com.moonlightsplitter.coolportfolio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moonlightsplitter.coolportfolio.databinding.AdapterMenuBinding
import com.moonlightsplitter.coolportfolio.models.MenuModel

class MenuAdapter(
    private val menus: List<MenuModel>,
    private val listener: OnAdapterListener
): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    interface OnAdapterListener {
        fun onClick(menu: MenuModel)
    }

    class ViewHolder(val binding: AdapterMenuBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = menus[position]
        holder.binding.menuNumber.text = "${menu.id}"
        holder.binding.menuTitle.text = menu.title
        holder.itemView.setOnClickListener { listener.onClick(menu) }
    }

    override fun getItemCount() = menus.size
}