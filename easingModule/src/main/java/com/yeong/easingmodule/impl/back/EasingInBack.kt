package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBack
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
class EasingInBack : EasingBack, EasingIn {
    companion object {
        private const val c1 = 1.70158
        private const val c3 = c1 + 1
    }

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> c3 * x * x * x - c1 * x * x }
}