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
        MenuModel(2, "Cool Welcome Page"),
        MenuModel(3, "Coming Soon")
    )
}