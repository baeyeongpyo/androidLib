package com.yeong.core.list.endless

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

/**
 * https://gist.github.com/nesquena/d09dc68ff07e845cc622
 * https://github.com/codepath/android_guides/wiki/Endless-Scrolling-with-AdapterViews-and-RecyclerView
 */
class EndlessScrollListener(private val loadMore: EndlessOnLoadMore<*>) :
    RecyclerView.OnScrollListener() {

    private var visibleThreshold = 5
    private var previousTotalItemCount = 0

    private var loading = true

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        val layoutManager = recyclerView.layoutManager ?: return
        val totalItemCount = layoutManager.itemCount
        val lastVisibleItemPosition = lastVisibleItemPosition(layoutManager)

        if (totalItemCount < previousTotalItemCount) {
            previousTotalItemCount = totalItemCount
            if (totalItemCount == 0) loading = true
        }

        if (loading && totalItemCount > previousTotalItemCount) {
            loading = false
            previousTotalItemCount = totalItemCount
        }

        if (!loading && lastVisibleItemPosition + getVisibleThreshold(layoutManager) > totalItemCount) {
            loadMore.loadMore(totalItemCount)
            loading = true
        }

    }

    private fun lastVisibleItemPosition(layoutManager: RecyclerView.LayoutManager) =
        when (layoutManager) {
            is StaggeredGridLayoutManager ->
                getLastVisibleItem(layoutManager.findLastVisibleItemPositions(null))
            is GridLayoutManager -> layoutManager.findLastVisibleItemPosition()
            is LinearLayoutManager -> layoutManager.findLastVisibleItemPosition()
            else -> 0
        }

    private fun getLastVisibleItem(lastVisibleItemPositions: IntArray): Int =
        lastVisibleItemPositions.maxOrNull() ?: 0

    private fun getVisibleThreshold(layoutManager: RecyclerView.LayoutManager) =
        when (layoutManager) {
            is GridLayoutManager -> visibleThreshold * layoutManager.spanCount
            is StaggeredGridLayoutManager -> visibleThreshold * layoutManager.spanCount
            else -> visibleThreshold
        }

    fun restore() {
        loadMore.restore()
        previousTotalItemCount = 0
        loading = true
    }

}