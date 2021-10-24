package com.andydeveloper.jsonapp.helpers

import android.util.Base64.encodeToString
import com.andydeveloper.jsonapp.SampleJson
import com.andydeveloper.jsonapp.adapters.PersonAdapter
import com.andydeveloper.jsonapp.models.PerformanceM
import com.andydeveloper.jsonapp.models.PersonM
import com.andydeveloper.jsonapp.models.ResultPageM
import com.google.gson.JsonObject
import com.squareup.moshi.Moshi
import kotlinx.serialization.json.Json
import org.json.JSONObject
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
    internal fun `same contents with incorrect type should returns equals`() {
        val moshiHelper = MoshiHelper()
        val result = moshiHelper.fromJson(SampleJson.secondHand1, PerformanceM::class.java)
        val expected = moshiHelper.fromJson(SampleJson.secondHand1, PerformanceM::class.java)
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

//    @Test
//    internal fun `person adapter to Json`() {
//        val person = PersonM("Andy", "Lu")
//        val moshiHelper = MoshiHelper()
//        val builder = Moshi.Builder()
//        val moshi = builder.add(PersonAdapter()).build()
//        val toJson = moshi.adapter(PersonM::class.java).toJson(person)
//        assertEquals("Andy Lu", toJson)
//    }
//
//    @Test
//    internal fun `person adapter from Json`() {
//        val person = PersonM("Andy", "Lu")
//        val moshiHelper = MoshiHelper()
//        val builder = Moshi.Builder()
//        val moshi = builder.add(PersonAdapter()).build()
//        val fromJson = moshi.adapter(PersonM::class.java).fromJson(
//            """{ "firstName":"Andy", "lastName":"Lu" }""".trimIndent()
//        )
//        assertEquals(person, fromJson)
//    }


}