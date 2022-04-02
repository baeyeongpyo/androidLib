package com.yeong.core.data.result

import java.lang.Exception

sealed class DataResult<out R> {

    fun interface Bind<T> {
        fun bind(): T
    }

    companion object {
        fun <T> success(data: T): DataResult<T> = Success(data)
        fun fail(exception: Exception): DataResult<Nothing> = Fail(exception)
        fun loading(): DataResult<Nothing> = Loading
        fun done(): DataResult<Nothing> = Done
        fun <T> resultBind(bind: Bind<T>): DataResult<T> =
            try {
                success(bind.bind())
            } catch (e: Exception) {
                fail(e)
            }
    }

    data class Success<T>(val data: T) : DataResult<T>()
    data class Fail(val exception: Exception) : DataResult<Nothing>()
    object Loading : DataResult<Nothing>()
    object Done : DataResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success -> "Success[$data]"
            is Fail -> "Fail[$exception]"
            is Loading -> "Loading"
            is Done -> "Done"
        }
    }

    fun isSuccess(): Boolean = (this is Success)
    fun isFail(): Boolean = (this is Fail)
    fun isLoading(): Boolean = (this is Loading)
    fun isDone(): Boolean = (this is Done)

    fun getDataOrNull(): R? = (this as? Success)?.data
    fun getExceptionOrNull() = (this as? Fail)?.exception

}