package com.moonlightsplitter.coolportfolio.activities.commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moonlightsplitter.coolportfolio.R
import com.moonlightsplitter.coolportfolio.databinding.ActivityCommerceBinding

class CommerceActivity : AppCompatActivity() {

    private val binding by lazy { ActivityCommerceBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        with(binding) {
            bottomNavigation.setItemSelected(R.id.home)
        }
    }
}