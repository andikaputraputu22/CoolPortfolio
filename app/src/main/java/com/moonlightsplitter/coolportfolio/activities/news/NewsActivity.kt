package com.moonlightsplitter.coolportfolio.activities.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.moonlightsplitter.coolportfolio.R
import com.moonlightsplitter.coolportfolio.databinding.ActivityNewsBinding
import com.moonlightsplitter.coolportfolio.fragment.FragmentNewsHome

class NewsActivity : AppCompatActivity() {

    private val binding by lazy { ActivityNewsBinding.inflate(layoutInflater) }
    private val homeFragment = FragmentNewsHome()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        replaceFragment(homeFragment)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        with(binding) {
            bottomNavigation.setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.home -> {
                        replaceFragment(homeFragment)
                        return@setOnItemSelectedListener true
                    }
                }
                false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}