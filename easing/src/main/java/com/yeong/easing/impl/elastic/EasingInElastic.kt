package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingElastic
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil
import com.yeong.easing.util.EasingValue.c4
import java.lang.Math.pow
import java.lang.Math.sin

@Suppress("SpellCheckingInspection")
object EasingInElastic : EasingElastic, EasingIn{
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x == 0.0)
                0
            else
                if (x == 1.0)
                    1
                else
                    -pow(2.0, 10 * x - 10) * sin((x * 10 - 10.75) * c4)
        }
}