package com.moonlightsplitter.coolportfolio.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayoutMediator
import com.moonlightsplitter.coolportfolio.adapter.NewsTrendingAdapter
import com.moonlightsplitter.coolportfolio.databinding.FragmentNewsHomeBinding
import com.moonlightsplitter.coolportfolio.pageradapter.NewsHomePagerAdapter
import com.moonlightsplitter.coolportfolio.viewmodel.CommerceHomeViewModel
import com.moonlightsplitter.coolportfolio.viewmodel.NewsHomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentNewsHome : Fragment() {

    private val viewModel: NewsHomeViewModel by viewModel()
    private lateinit var binding: FragmentNewsHomeBinding
    private lateinit var newsHomePagerAdapter: NewsHomePagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listTrending.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        binding.listTrending.adapter = trendingAdapter

        newsHomePagerAdapter = NewsHomePagerAdapter(childFragmentManager, lifecycle)
        with(binding) {
            viewPager.adapter = newsHomePagerAdapter
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> tab.text = "MU"
                    1 -> tab.text = "Juara"
                    2 -> tab.text = "EPL"
                }
            }.attach()
        }
    }

    private val trendingAdapter by lazy {
        NewsTrendingAdapter(viewModel.listTrending, object : NewsTrendingAdapter.OnAdapterListener {
            override fun onClick(trending: String) {

            }
        })
    }
}