package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingBounce
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil

@Suppress("SpellCheckingInspection")
object EasingInBounce : EasingBounce, EasingIn {

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - EasingOutBounce.calculator(1 - x).toDouble() }
}