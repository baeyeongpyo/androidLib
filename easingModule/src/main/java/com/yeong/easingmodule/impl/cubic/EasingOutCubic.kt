package com.yeong.easingmodule.impl.cubic

import com.yeong.easingmodule.type.type.EasingCubic
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil
import java.lang.Math.pow

class EasingOutCubic : EasingCubic, EasingOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - pow(1 - x, 3.0) }
}