package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingCirc
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
object EasingOutCirc : EasingCirc, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            sqrt(1 - pow(x - 1, 2.0))
        }
}