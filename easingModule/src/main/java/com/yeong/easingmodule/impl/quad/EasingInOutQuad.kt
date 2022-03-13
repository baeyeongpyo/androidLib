package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingInOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingInOutQuad : EasingQuad, EasingInOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x ->
            if (x < .5)
                2 * x * x
            else
                1 - pow(-2 * x + 2, 2.0) * .5
        }
}