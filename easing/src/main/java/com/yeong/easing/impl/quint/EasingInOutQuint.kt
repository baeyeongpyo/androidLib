package com.yeong.easing.impl.quart

import com.yeong.easing.type.type.EasingQuint
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingInOutQuint : EasingQuint, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5f)
                16 * x * x * x * x * x
            else
                1 - pow(-2 * x + 2, 5.0) * .5
        }
}