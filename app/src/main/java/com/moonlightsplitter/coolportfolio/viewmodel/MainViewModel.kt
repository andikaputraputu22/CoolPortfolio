package com.moonlightsplitter.coolportfolio.viewmodel

import androidx.lifecycle.ViewModel
import com.moonlightsplitter.coolportfolio.models.MenuModel
import org.koin.dsl.module

val mainViewModelModule = module {
    factory { MainViewModel() }
}

class MainViewModel : ViewModel() {

    val menus = listOf(
        MenuModel(1, "Clean E-Commerce"),
        MenuModel(2, "Simple News"),
        MenuModel(3, "Cool Welcome Page"),
        MenuModel(4, "Coming Soon")
    )
}