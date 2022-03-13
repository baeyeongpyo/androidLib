package com.yeong.easingmodule.impl.sine

import com.yeong.easingmodule.type.type.EasingSine
import com.yeong.easingmodule.type.way.EasingInOut
import kotlin.math.PI
import kotlin.math.cos

class EasingIntOutSine : EasingSine, EasingInOut {
    override fun calculator(n: Number): Number = -(cos(PI * n.toDouble()) - 1) * .5f
}