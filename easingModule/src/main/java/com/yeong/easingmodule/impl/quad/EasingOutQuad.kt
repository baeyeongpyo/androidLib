package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingOut

class EasingOutQuad : EasingQuad, EasingOut {
    override fun calculator(n: Number): Number = 1 - (1 - n.toDouble()) * (1 - n.toDouble())
}