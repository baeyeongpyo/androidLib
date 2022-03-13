package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingElastic
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c4
import java.lang.Math.pow
import java.lang.Math.sin

@Suppress("SpellCheckingInspection")
class EasingOutElastic : EasingElastic, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 0.0)
                0
            else
                if (x == 1.0)
                    1
                else
                    pow(2.0, -10 * x) * sin((x * 10 - .75) * c4) + 1
        }
}