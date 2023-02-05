package com.moonlightsplitter.coolportfolio.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.TypedValue
import androidx.core.content.ContextCompat
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

    fun getImageResource(idImage: Int, context: Context): Drawable? {
        return ContextCompat.getDrawable(context, idImage)
    }
}