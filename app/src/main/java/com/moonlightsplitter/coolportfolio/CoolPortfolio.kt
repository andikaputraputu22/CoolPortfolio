package com.moonlightsplitter.coolportfolio

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class CoolPortfolio : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}