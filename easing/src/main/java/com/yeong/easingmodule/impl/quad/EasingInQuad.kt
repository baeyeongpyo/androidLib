package com.yeong.easingmodule.impl.quad

import com.yeong.easingmodule.type.type.EasingQuad
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil

object EasingInQuad : EasingQuad, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x }
}