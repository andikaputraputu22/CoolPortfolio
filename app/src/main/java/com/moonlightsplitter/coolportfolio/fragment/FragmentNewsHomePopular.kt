package com.moonlightsplitter.coolportfolio.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.moonlightsplitter.coolportfolio.databinding.FragmentNewsHomeBinding
import com.moonlightsplitter.coolportfolio.databinding.FragmentNewsHomePopularBinding
import com.moonlightsplitter.coolportfolio.viewmodel.CommerceHomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentNewsHomePopular : Fragment() {

    private val viewModel: CommerceHomeViewModel by viewModel()
    private lateinit var binding: FragmentNewsHomePopularBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsHomePopularBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}