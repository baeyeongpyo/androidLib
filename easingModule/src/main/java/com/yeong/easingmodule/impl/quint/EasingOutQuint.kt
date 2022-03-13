package com.yeong.easingmodule.impl.quart

import com.yeong.easingmodule.type.type.EasingQuint
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingOutQuint : EasingQuint, EasingIn {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - pow(1 - x, 5.0) }
}