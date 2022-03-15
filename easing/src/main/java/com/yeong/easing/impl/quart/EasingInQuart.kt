package com.yeong.easing.impl.quart

import com.yeong.easing.type.type.EasingQuart
import com.yeong.easing.type.way.EasingIn
import com.yeong.easing.util.EasingUtil

object EasingInQuart : EasingQuart, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x * x }
}