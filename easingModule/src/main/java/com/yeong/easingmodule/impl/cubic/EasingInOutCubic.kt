package com.yeong.easingmodule.impl.cubic

import com.yeong.easingmodule.type.type.EasingCubic
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingInOutCubic : EasingCubic, EasingOut {
    override fun calculator(n: Number): Number =
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                4 * x * x * x
            else
                1 - pow(-2 * x + 2, 3.0) * .5
        }
}