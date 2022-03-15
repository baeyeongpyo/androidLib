package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBack
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c1
import com.yeong.easingmodule.util.EasingValue.c3
import java.lang.Math.pow

@Suppress("SpellCheckingInspection")
object EasingOutBack : EasingBack, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            1 + c3 * pow(x - 1, 3.0) + c1 * pow(x - 1, 2.0)
        }
}