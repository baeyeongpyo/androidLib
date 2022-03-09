package com.yeong.core.component.resource

import android.content.Context

private var dimensionSize = 0f

object DimensionUtil {
    fun dimensionSizeInit(context: Context) {
        dimensionSize = context.resources.displayMetrics.density
    }
}

fun Number.toDp() = (this.toFloat() * dimensionSize).toInt()