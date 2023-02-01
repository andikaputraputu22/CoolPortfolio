package com.moonlightsplitter.coolportfolio.activities.commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.moonlightsplitter.coolportfolio.R
import com.moonlightsplitter.coolportfolio.databinding.ActivityCommerceBinding
import com.moonlightsplitter.coolportfolio.fragment.FragmentCommerceHome

class CommerceActivity : AppCompatActivity() {

    private val binding by lazy { ActivityCommerceBinding.inflate(layoutInflater) }
    private val homeFragment = FragmentCommerceHome()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        replaceFragment(homeFragment)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        with(binding) {
            bottomNavigation.setItemSelected(R.id.home)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}