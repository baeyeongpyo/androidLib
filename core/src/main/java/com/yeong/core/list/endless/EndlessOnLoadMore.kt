package com.yeong.core.list.endless

abstract class EndlessOnLoadMore<KEY : Any> {
    var key: KEY? = null

    init {
        restore()
    }

    fun loadMore(totalItemCount: Int) = onLoadMore(key, totalItemCount)
    fun restore() {
        key = initKey()
    }

    fun nextKey(key: KEY?) {
        this.key = key
    }

    abstract fun initKey(): KEY?
    abstract fun onLoadMore(key: KEY?, totalItemCount: Int)
}