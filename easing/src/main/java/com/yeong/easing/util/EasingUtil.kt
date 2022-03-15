package com.yeong.easing.util

internal object EasingUtil {
    @Suppress("SpellCheckingInspection")
    fun bindCalcul(number: Number, bind: (Double) -> Number): Number = bind(number.toDouble())
}