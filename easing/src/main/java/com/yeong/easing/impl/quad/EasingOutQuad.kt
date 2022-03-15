package com.yeong.easing.impl.quad

import com.yeong.easing.type.type.EasingQuad
import com.yeong.easing.type.way.EasingOut
import com.yeong.easing.util.EasingUtil

object EasingOutQuad : EasingQuad, EasingOut {
    override fun calculator(n: Number): Number =
        EasingUtil.bindCalcul(n) { x -> 1 - (1 - x) * (1 - x) }
}