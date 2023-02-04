package com.moonlightsplitter.coolportfolio.utils

import android.content.Context
import android.util.TypedValue
import kotlin.math.roundToInt

object StaticController {

    fun dpToPx(context: Context, dp: Int): Int {
        val r = context.resources
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp.toFloat(),
            r.displayMetrics
        ).roundToInt()
    }
}