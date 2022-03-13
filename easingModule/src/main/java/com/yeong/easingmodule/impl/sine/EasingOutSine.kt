package com.yeong.easingmodule.impl.sine

import com.yeong.easingmodule.type.type.EasingSine
import com.yeong.easingmodule.type.way.EasingOut
import java.lang.Math.PI
import java.lang.Math.sin

class EasingOutSine : EasingSine, EasingOut {
    override fun calculator(n: Number): Number {
        @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
        return sin((n.toDouble() * PI) * .5f)
    }
}