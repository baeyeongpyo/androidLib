package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingExpo
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingInExpo : EasingExpo, EasingIn {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 0.0)
                0
            else
                pow(2.0, 10 * x - 10)
        }
}