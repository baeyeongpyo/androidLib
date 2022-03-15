package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingBack
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import com.yeong.easing.util.EasingValue.c2
import java.lang.Math.pow

@Suppress("SpellCheckingInspection")
object EasingInOutBack : EasingBack, EasingInOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                (pow(2 * x, 2.0) * ((c2 + 1) * 2 * x - c2)) * .5
            else
                (pow(2 * x - 2, 2.0) * ((c2 + 1) * (x * 2 - 2) + c2) + 2) * .5
        }
}