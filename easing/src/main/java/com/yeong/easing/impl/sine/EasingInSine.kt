package com.yeong.easing.impl.sine

import com.yeong.easing.type.type.EasingSine
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil
import java.lang.Math.PI
import java.lang.Math.cos

object EasingInSine : EasingSine, EasingIn {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - cos((x * PI) * .5f) }
}