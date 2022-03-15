package com.yeong.easing.impl.cubic

import com.yeong.easing.type.type.EasingCubic
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil

object EasingInCubic : EasingCubic, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x }
}