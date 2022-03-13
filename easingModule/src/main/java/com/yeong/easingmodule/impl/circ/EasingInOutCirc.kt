package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingCirc
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
class EasingInOutCirc : EasingCirc, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                (1 - sqrt(1 - pow(2 * x, 2.0))) * .5
            else
                (sqrt(1 - pow(-2 * x + 2, 2.0)) + 1) * .5
        }
}