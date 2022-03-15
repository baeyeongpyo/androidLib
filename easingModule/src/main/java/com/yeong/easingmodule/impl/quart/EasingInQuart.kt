package com.yeong.easingmodule.impl.quart

import com.yeong.easingmodule.type.type.EasingQuart
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil

object EasingInQuart : EasingQuart, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x * x }
}