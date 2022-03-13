package com.yeong.easingmodule.impl.quart

import com.yeong.easingmodule.type.type.EasingQuint
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingInOutQuint : EasingQuint, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5f)
                16 * x * x * x * x * x
            else
                1 - pow(-2 * x + 2, 5.0) * .5
        }
}