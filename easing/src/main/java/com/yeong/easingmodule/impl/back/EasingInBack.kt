package com.yeong.easingmodule.impl.expo

import com.yeong.easingmodule.type.type.EasingBack
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil
import com.yeong.easingmodule.util.EasingValue.c1
import com.yeong.easingmodule.util.EasingValue.c3
import java.lang.Math.pow
import kotlin.math.sqrt

@Suppress("SpellCheckingInspection")
object EasingInBack : EasingBack, EasingIn {

    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> c3 * x * x * x - c1 * x * x }
}