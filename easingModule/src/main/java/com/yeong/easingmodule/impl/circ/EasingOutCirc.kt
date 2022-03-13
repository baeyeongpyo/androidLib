package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingCirc
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
class EasingOutCirc : EasingCirc, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            sqrt(1 - pow(x - 1, 2.0))
        }
}