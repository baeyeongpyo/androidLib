package com.yeong.easing.impl.cubic

import com.yeong.easing.type.type.EasingCubic
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingInOutCubic : EasingCubic, EasingInOut {
    override fun calculator(n: Number): Number =
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                4 * x * x * x
            else
                1 - pow(-2 * x + 2, 3.0) * .5
        }
}