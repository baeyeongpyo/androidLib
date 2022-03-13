package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingExpo
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingInExpo : EasingExpo, EasingIn {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 0.0)
                0
            else
                pow(2.0, 10 * x - 10)
        }
}