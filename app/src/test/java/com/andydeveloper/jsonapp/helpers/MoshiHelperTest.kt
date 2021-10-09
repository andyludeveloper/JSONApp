package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import com.andydeveloper.jsonapp.models.PerformanceM
import com.andydeveloper.jsonapp.models.ResultPageM
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoshiHelperTest {
    @Test
    internal fun `same contents should returns equals`() {
        val moshiHelper = MoshiHelper()
        val result = moshiHelper.fromJson(SampleJson.secondHand, PerformanceM::class.java)
        val expected = moshiHelper.fromJson(SampleJson.secondHand, PerformanceM::class.java)
        assertEquals(expected, result)
    }

    @Test
    internal fun `empty list should returns emptyList`() {
        val moshiHelper = MoshiHelper()
        val result = moshiHelper.fromJson(
            SampleJson.secondHandEmptyResult,
            PerformanceM::class.java
        )
        assertEquals(emptyList<ResultPageM>(), result?.resultPage)
    }
    @Test
    internal fun `list is gone should returns emptyList`() {
        val moshiHelper = MoshiHelper()
        val result = moshiHelper.fromJson(
            SampleJson.secondHandNoResult,
            PerformanceM::class.java
        )
        assertEquals(emptyList<ResultPageM>(), result?.resultPage)
    }

}