package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingElastic
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c5
import java.lang.Math.pow
import java.lang.Math.sin

@Suppress("SpellCheckingInspection")
class EasingInOutElastic : EasingElastic, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 0.0)
                0
            else
                if (x == 1.0)
                    1
                else
                    if (x < .5)
                        -(pow(2.0, 20 * x - 10) * sin((20 * x - 11.125) * c5)) * .5
                    else
                        (pow(2.0, -20 * x + 10) * sin((20 * x - 11.125) * c5)) * .5 + 1
        }
}