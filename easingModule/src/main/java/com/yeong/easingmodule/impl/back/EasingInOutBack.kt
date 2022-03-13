package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBack
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
class EasingInOutBack : EasingBack, EasingOut {
    companion object {
        private const val c1 = 1.70158
        private const val c2 = c1 * 1.525
    }

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                (pow(2 * x, 2.0) * ((c2 + 1) * 2 * x - c2)) * .5
            else
                (pow(2 * x - 2, 2.0) * ((c2 + 1) * (x * 2 - 2) + c2) + 2) * .5
        }
}