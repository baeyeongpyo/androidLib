package com.yeong.easingmodule.impl.quart

import com.yeong.easingmodule.type.type.EasingQuint
import com.yeong.easingmodule.type.way.EasingIn
import com.yeong.easingmodule.util.EasingUtil

object EasingInQuint : EasingQuint, EasingIn {
    override fun calculator(n: Number): Number = EasingUtil.bindCalcul(n) { x -> x * x * x * x * x }
}