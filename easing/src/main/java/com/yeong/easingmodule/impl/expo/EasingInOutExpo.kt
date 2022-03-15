package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingExpo
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

object EasingInOutExpo : EasingExpo, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if ( x == 0.0)
                0
            else
                if ( x == 1.0)
                    1
                else
                    if ( x < .5)
                        pow(2.0, 20 * x - 10) * .5
                    else
                        (2 - pow(2.0, -20 * x + 10 )) * .5
        }
}