package com.yeong.easing.impl.sine

import com.yeong.easing.type.type.EasingSine
import com.yeong.easing.type.way.EasingInOut
import com.yeong.easing.util.EasingUtil
import kotlin.math.PI
import kotlin.math.cos

object EasingIntOutSine : EasingSine, EasingInOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> -(cos(PI * x) - 1) * .5f }
}