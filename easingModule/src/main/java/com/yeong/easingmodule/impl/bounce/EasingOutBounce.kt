package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBounce
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c1
import com.yeong.easingmodule.util.EasingValue.c3
import com.yeong.easingmodule.util.EasingValue.d1
import com.yeong.easingmodule.util.EasingValue.n1
import java.lang.Math.pow

@Suppress("SpellCheckingInspection")
class EasingOutBounce : EasingBounce, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            when {
                x < 1 / d1 -> n1 * x * x
                x < 2 / d1 -> (x - 1.5).let { dx -> n1 * (dx / d1) * dx + .75 }
                x < 2.5 / d1 -> (x - 2.25).let { dx -> n1 * (dx / d1) * dx + .9375 }
                else -> (x - 2.625).let { dx -> n1 * (dx / d1) * dx + .984375 }
            }
        }
}