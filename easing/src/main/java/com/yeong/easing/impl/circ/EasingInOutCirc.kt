package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingCirc
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
object EasingInOutCirc : EasingCirc, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                (1 - sqrt(1 - pow(2 * x, 2.0))) * .5
            else
                (sqrt(1 - pow(-2 * x + 2, 2.0)) + 1) * .5
        }
}