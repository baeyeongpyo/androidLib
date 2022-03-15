package com.yeong.easing.impl.expo

import com.yeong.easing.type.type.EasingBack
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import com.yeong.easing.util.EasingValue.c1
import com.yeong.easing.util.EasingValue.c3
import java.lang.Math.pow

@Suppress("SpellCheckingInspection")
object EasingOutBack : EasingBack, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            1 + c3 * pow(x - 1, 3.0) + c1 * pow(x - 1, 2.0)
        }
}