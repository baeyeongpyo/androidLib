package com.yeong.easing.impl.quart

import com.yeong.easing.type.type.EasingQuint
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil

object EasingInQuint : EasingQuint, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x * x * x }
}