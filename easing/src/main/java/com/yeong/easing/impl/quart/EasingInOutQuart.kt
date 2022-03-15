package com.yeong.easing.impl.quart

import com.yeong.easing.type.type.EasingQuart
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingInOutQuart : EasingQuart, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                8 * x * x * x * x
            else
                1 - pow(-2 * x + 2, 4.0) * .5f
        }
}