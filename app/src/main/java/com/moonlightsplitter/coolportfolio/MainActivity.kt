package com.moonlightsplitter.coolportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.moonlightsplitter.coolportfolio.adapter.MenuAdapter
import com.moonlightsplitter.coolportfolio.databinding.ActivityMainBinding
import com.moonlightsplitter.coolportfolio.models.MenuModel
import com.moonlightsplitter.coolportfolio.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.listMenu.layoutManager = LinearLayoutManager(this)
        binding.listMenu.setHasFixedSize(true)
        binding.listMenu.adapter = menuAdapter
    }

    private val menuAdapter by lazy {
        MenuAdapter(viewModel.menus, object : MenuAdapter.OnAdapterListener {
            override fun onClick(menu: MenuModel) {
                //
            }
        })
    }
}