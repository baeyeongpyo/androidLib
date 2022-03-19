package com.yeong.core.ext

import android.view.View
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow

suspend fun View.onClick(): Flow<View> = callbackFlow {
    setOnClickListener(::trySend)
    awaitClose { setOnClickListener(null) }
}

fun <T> Flow<T>.throttle(time: Long): Flow<T> = flow {
    var lastTime = 0L
    collect { upstream ->
        val currentTime = System.currentTimeMillis()
        val mayEmit = currentTime - lastTime > time
        if (mayEmit) {
            lastTime = currentTime
            emit(upstream)
        }
    }
}
