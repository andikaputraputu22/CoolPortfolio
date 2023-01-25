package com.moonlightsplitter.coolportfolio

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.moonlightsplitter.coolportfolio.viewmodel.mainViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CoolPortfolio : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@CoolPortfolio)
            modules(
                mainViewModelModule
            )
        }
    }
}