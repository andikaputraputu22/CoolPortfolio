package com.moonlightsplitter.coolportfolio.viewmodel

import androidx.lifecycle.ViewModel
import com.moonlightsplitter.coolportfolio.R
import com.moonlightsplitter.coolportfolio.models.CommerceCategoryModel
import com.moonlightsplitter.coolportfolio.models.CommerceProductModel
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

    val products = listOf(
        CommerceProductModel(1, "Agnolia", R.drawable.product1, "$100.00"),
        CommerceProductModel(2, "Azodia", R.drawable.product2, "$80.00"),
        CommerceProductModel(3, "Cherola", R.drawable.product3, "$150.00"),
        CommerceProductModel(4, "Demura", R.drawable.product4, "$60.00")
    )
}