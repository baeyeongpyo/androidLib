package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingBack
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil
import com.yeong.easing.util.EasingValue.c1
import com.yeong.easing.util.EasingValue.c3

@Suppress("SpellCheckingInspection")
object EasingInBack : EasingBack, EasingIn {

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> c3 * x * x * x - c1 * x * x }
}