package com.yeong.easingmodule.impl.cubic

import com.yeong.easingmodule.type.type.EasingCubic
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil

object EasingInCubic : EasingCubic, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x }
}