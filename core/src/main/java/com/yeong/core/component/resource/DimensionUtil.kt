package com.yeong.core.component.resource

import android.content.Context

private var dimensionSize = 0f

object DimensionUtil {
    /**
     * [com.yeong.core.component.CoreModuleInitApp] 을 통해서 초기화를 하고 있지만,
     * Custom View 를 사용하는 경우에서는 Init 해주지 못하므로 별도로 작업을 해주어야 preview 가 정상적으로 생성된다.
     * */
    fun dimensionSizeInit(context: Context) {
        dimensionSize = context.resources.displayMetrics.density
    }
}

fun Number.toDp() = (this.toFloat() * dimensionSize).toInt()