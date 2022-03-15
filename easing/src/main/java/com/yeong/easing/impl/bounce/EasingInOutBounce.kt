package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingBounce
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil

@Suppress("SpellCheckingInspection")
object EasingInOutBounce : EasingBounce, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                (1.0 - EasingOutBounce.calculator(1 - 2 * x).toDouble()) * .5
            else
                (1.0 + EasingOutBounce.calculator(2 * x - 1).toDouble()) * .5
        }
}