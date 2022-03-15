package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingCirc
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
object EasingInCirc : EasingCirc, EasingIn {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            1 - sqrt(1 - pow(x, 2.0))
        }
}