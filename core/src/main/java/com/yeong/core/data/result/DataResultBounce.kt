package com.yeong.core.data.result

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object DataResultBounce {

    fun interface Bounce<T> {
        suspend fun bounce(): DataResult<T>
    }

    operator fun <T> invoke(bounce: Bounce<T>): Flow<DataResult<T>> = flow {
        emit(DataResult.loading())
        emit(bounce.bounce())
        emit(DataResult.done())
    }

}