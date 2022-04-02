package com.yeong.core.data.result

import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.lang.Exception

class DataResultBounceTest {

    @Test
    fun resultFlowSuccessTest() = runBlocking {
        val data = DataResult.resultBind { "test" }
        val assertList = listOf(DataResult.loading(), data, DataResult.done())
        val flowList = DataResultBounce { data }.toList().toList()
        assertSame(assertList[0], flowList[0])
        assertSame(assertList[1], flowList[1])
        assertSame(assertList[2], flowList[2])
    }
    @Test
    fun resultFlowFailTest() = runBlocking {
        val data = DataResult.resultBind { throw Exception() }
        val assertList = listOf(DataResult.loading(), data, DataResult.done())
        val flowList = DataResultBounce { data }.toList().toList()
        assertSame(assertList[0], flowList[0])
        assertSame(assertList[1], flowList[1])
        assertSame(assertList[2], flowList[2])
    }

}

