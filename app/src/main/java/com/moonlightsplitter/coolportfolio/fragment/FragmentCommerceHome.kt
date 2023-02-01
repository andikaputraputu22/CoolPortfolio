package com.moonlightsplitter.coolportfolio.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.moonlightsplitter.coolportfolio.adapter.CommerceCategoryAdapter
import com.moonlightsplitter.coolportfolio.databinding.FragmentCommerceHomeBinding
import com.moonlightsplitter.coolportfolio.models.CommerceCategoryModel
import com.moonlightsplitter.coolportfolio.viewmodel.CommerceHomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentCommerceHome : Fragment() {

    private val viewModel: CommerceHomeViewModel by viewModel()
    private lateinit var binding: FragmentCommerceHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommerceHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listCategory.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        binding.listCategory.adapter = categoryAdapter
    }

    private val categoryAdapter by lazy {
        CommerceCategoryAdapter(viewModel.categories, object : CommerceCategoryAdapter.OnAdapterListener {
            override fun onClick(category: CommerceCategoryModel) {

            }
        })
    }
}