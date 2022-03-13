package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingOut
import com.yeong.easingmodule.util.EasingUtil

class EasingOutQuad : EasingQuad, EasingOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - (1 - x) * (1 - x) }
}