package com.moonlightsplitter.coolportfolio.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.moonlightsplitter.coolportfolio.R
import com.moonlightsplitter.coolportfolio.databinding.AdapterCommerceCategoryBinding
import com.moonlightsplitter.coolportfolio.models.CommerceCategoryModel

class CommerceCategoryAdapter(
    private val categories: List<CommerceCategoryModel>,
    private val listener: OnAdapterListener
): RecyclerView.Adapter<CommerceCategoryAdapter.ViewHolder>() {

    private val itemsCategoryBg = arrayListOf<LinearLayout>()
    private val itemsCategoryName = arrayListOf<TextView>()

    class ViewHolder(val binding: AdapterCommerceCategoryBinding): RecyclerView.ViewHolder(binding.root)

    interface OnAdapterListener {
        fun onClick(category: CommerceCategoryModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterCommerceCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categories[position]
        itemsCategoryBg.add(holder.binding.categoryBg)
        itemsCategoryName.add(holder.binding.categoryName)
        setBackground(itemsCategoryBg[0], itemsCategoryName[0])
        holder.binding.categoryName.text = category.title
        holder.itemView.setOnClickListener {
            listener.onClick(category)
            setBackground(holder.binding.categoryBg, holder.binding.categoryName)
        }
    }

    override fun getItemCount() = categories.size

    private fun setBackground(layout: LinearLayout, name: TextView) {
        itemsCategoryBg.forEach { it.setBackgroundResource(R.drawable.bg_category_unselected) }
        itemsCategoryName.forEach { it.setTextColor(Color.parseColor("#263238")) }

        layout.setBackgroundResource(R.drawable.bg_category_selected)
        name.setTextColor(Color.parseColor("#FFFFFF"))
    }
}