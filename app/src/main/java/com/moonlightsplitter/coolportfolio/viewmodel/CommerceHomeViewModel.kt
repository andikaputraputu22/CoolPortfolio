package com.moonlightsplitter.coolportfolio.viewmodel

import androidx.lifecycle.ViewModel
import com.moonlightsplitter.coolportfolio.models.CommerceCategoryModel
import org.koin.dsl.module

val commerceHomeViewModelModule = module {
    factory { CommerceHomeViewModel() }
}

class CommerceHomeViewModel : ViewModel() {

    val categories = listOf(
        CommerceCategoryModel(1, "All"),
        CommerceCategoryModel(2, "Man"),
        CommerceCategoryModel(3, "Woman"),
        CommerceCategoryModel(4, "Kids"),
        CommerceCategoryModel(5, "Premium")
    )
}