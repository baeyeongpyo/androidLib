package com.yeong.easing.impl.quad

import com.yeong.easing.type.type.EasingQuad
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingInOutQuad : EasingQuad, EasingInOut {
    override fun calculator(n: Number): Number =
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                2 * x * x
            else
                1 - pow(-2 * x + 2, 2.0) * .5
        }
}