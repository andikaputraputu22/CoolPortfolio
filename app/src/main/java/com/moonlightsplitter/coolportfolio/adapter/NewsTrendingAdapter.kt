package com.moonlightsplitter.coolportfolio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moonlightsplitter.coolportfolio.databinding.AdapterNewsTrendingBinding

class NewsTrendingAdapter(
    private val listTrending: List<String>,
    private val listener: OnAdapterListener
): RecyclerView.Adapter<NewsTrendingAdapter.ViewHolder>() {

    class ViewHolder(val binding: AdapterNewsTrendingBinding): RecyclerView.ViewHolder(binding.root)

    interface OnAdapterListener {
        fun onClick(trending: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterNewsTrendingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val trending = listTrending[position]
        holder.binding.trending.text = trending
        holder.itemView.setOnClickListener {
            listener.onClick(trending)
        }
    }

    override fun getItemCount() = listTrending.size
}