package com.yeong.easing.impl.quart

import com.yeong.easing.type.type.EasingQuart
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingOutQuart : EasingQuart, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - pow(1 - x, 4.0) }
}