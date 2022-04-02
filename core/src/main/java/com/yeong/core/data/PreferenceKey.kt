package com.yeong.core.data

data class PreferenceKey<T>(val keyName: String, val keyType: Class<T>)