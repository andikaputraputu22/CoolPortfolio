package com.moonlightsplitter.coolportfolio.viewmodel

import androidx.lifecycle.ViewModel
import org.koin.dsl.module

val newsHomeViewModelModule = module {
    factory { NewsHomeViewModel() }
}

class NewsHomeViewModel : ViewModel() {

    val listTrending = listOf(
        "#memukau",
        "#memotivasi",
        "#manchester united",
        "#samsung",
        "#work from home"
    )
}