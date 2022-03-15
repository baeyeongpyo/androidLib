package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingExpo
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingOutExpo : EasingExpo, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 1.0)
                1
            else
                1 - pow(2.0, -10 * x)
        }
}