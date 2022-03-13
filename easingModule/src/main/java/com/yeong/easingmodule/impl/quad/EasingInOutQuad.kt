package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingInOut
import java.lang.Math.pow

class EasingInOutQuad : EasingQuad, EasingInOut {
    override fun calculator(n: Number): Number =
        if (n.toDouble() < .5)
            2 * n.toDouble() * n.toDouble()
        else
            1 - pow(-2 * n.toDouble() + 2, 2.0) * .5
}