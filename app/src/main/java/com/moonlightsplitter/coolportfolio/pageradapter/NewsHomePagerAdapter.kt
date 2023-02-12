package com.moonlightsplitter.coolportfolio.pageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.moonlightsplitter.coolportfolio.fragment.FragmentNewsHomeLifestyle
import com.moonlightsplitter.coolportfolio.fragment.FragmentNewsHomePopular
import com.moonlightsplitter.coolportfolio.fragment.FragmentNewsHomeTerbaru

class NewsHomePagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val pages = listOf(FragmentNewsHomeTerbaru(), FragmentNewsHomePopular(), FragmentNewsHomeLifestyle())

    override fun getItemCount() = pages.size

    override fun createFragment(position: Int): Fragment {
        return pages[position]
    }
}