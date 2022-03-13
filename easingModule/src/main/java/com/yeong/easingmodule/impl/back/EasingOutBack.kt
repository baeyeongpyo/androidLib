package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBack
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
class EasingOutBack : EasingBack, EasingOut {
    companion object {
        private const val c1 = 1.70158
        private const val c3 = c1 + 1
    }

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            1 + c3 * pow(x - 1, 3.0) + c1 * pow(x - 1, 2.0)
        }
}