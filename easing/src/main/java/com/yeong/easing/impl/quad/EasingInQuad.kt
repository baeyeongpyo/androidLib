package com.yeong.easing.impl.quad

import com.yeong.easing.type.type.EasingQuad
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil

object EasingInQuad : EasingQuad, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x }
}