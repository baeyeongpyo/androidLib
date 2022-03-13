package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingExpo
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingOutExpo : EasingExpo, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 1.0)
                1
            else
                1 - pow(2.0, -10 * x)
        }
}