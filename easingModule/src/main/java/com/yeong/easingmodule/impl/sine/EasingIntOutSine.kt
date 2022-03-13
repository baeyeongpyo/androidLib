package com.yeong.easingmodule.impl.sine

import com.yeong.easingmodule.type.type.EasingSine
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import kotlin.math.PI
import kotlin.math.cos

class EasingIntOutSine : EasingSine, EasingInOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> -(cos(PI * x) - 1) * .5f }
}