package com.yeong.easing.impl.cubic

import com.yeong.easing.type.type.EasingCubic
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow

object EasingOutCubic : EasingCubic, EasingOut {
    override fun calculator(n: Number): Number =
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        EasingUtil.bindCalcul(n) { x -> 1 - pow(1 - x, 3.0) }
}