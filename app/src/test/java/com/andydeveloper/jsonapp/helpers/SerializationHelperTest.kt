package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import com.andydeveloper.jsonapp.models.PerformanceM
import com.andydeveloper.jsonapp.models.PerformanceS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SerializationHelperTest {
    @Test
    internal fun `same contents should returns equals`() {
        val result = SerializationHelper().fromJson<PerformanceS>(SampleJson.secondHand)
        val expect = SerializationHelper().fromJson<PerformanceS>(SampleJson.secondHand)
        assertEquals(expect, result)
    }

    @Test
    internal fun `empty list should returns emptyList`() {
        val result = SerializationHelper().fromJson<PerformanceS>(SampleJson.secondHandEmptyResult)
        assertEquals(emptyList<PerformanceS>(), result.resultPage)
    }

    @Test
    internal fun `no list item should returns emptyList`() {
        val result = SerializationHelper().fromJson<PerformanceS>(SampleJson.secondHandNoResult)
        assertEquals(emptyList<PerformanceS>(), result.resultPage)
    }

}