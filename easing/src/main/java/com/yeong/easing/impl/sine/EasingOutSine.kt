package com.yeong.easing.impl.sine

import com.yeong.easing.type.type.EasingSine
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil
import java.lang.Math.PI
import java.lang.Math.sin

object EasingOutSine : EasingSine, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> sin((x * PI) * .5f) }
}