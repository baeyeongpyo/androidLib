package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBounce
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c1
import com.yeong.easingmodule.util.EasingValue.c3

@Suppress("SpellCheckingInspection")
class EasingInBounce : EasingBounce, EasingIn {

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - EasingOutBounce().calculator(1 - x).toDouble() }
}