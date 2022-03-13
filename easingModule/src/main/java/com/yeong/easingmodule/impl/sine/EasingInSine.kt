package com.yeong.easingmodule.impl.sine

import com.yeong.easingmodule.type.type.EasingSine
import com.yeong.easingmodule.type.way.EasingIn
import java.lang.Math.PI
import java.lang.Math.cos

class EasingInSine : EasingSine, EasingIn {
    override fun calculator(n: Number): Number {
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        return 1 - cos((n.toDouble() * PI) * .5f)
    }
}