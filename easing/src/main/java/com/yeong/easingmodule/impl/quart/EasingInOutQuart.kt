package com.yeong.easingmodule.impl.quart

import com.yeong.easingmodule.type.type.EasingQuart
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
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