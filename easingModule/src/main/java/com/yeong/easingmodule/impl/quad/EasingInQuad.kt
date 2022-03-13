package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingIn

class EasingInQuad : EasingQuad, EasingIn {
    override fun calculator(n: Number): Number = n.toDouble() * n.toDouble()
}