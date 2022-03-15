package com.yeong.easingmodule.impl.sine

import com.yeong.easingmodule.type.type.EasingSine
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.PI
import java.lang.Math.sin

object EasingOutSine : EasingSine, EasingOut {
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> sin((x * PI) * .5f) }
}