package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import com.andydeveloper.jsonapp.models.Performance
import com.andydeveloper.jsonapp.models.Person
import com.andydeveloper.jsonapp.models.ResultPage
import com.google.gson.Gson
import org.json.JSONObject
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GsonHelperTest {
    @Test
    internal fun fromJson() {
        val gsonHelper = GsonHelper()

        val person1 = gsonHelper.fromJson(SampleJson.jsonString, Person::class.java)
        val person2 = gsonHelper.fromJson(SampleJson.jsonString, Person::class.java)
        assertEquals(person2, person1)
    }

    @Test
    internal fun `same object call fromJson should equals`() {
        val gsonHelper = GsonHelper()
        val person1 = gsonHelper.fromJson(SampleJson.secondHand, Performance::class.java)
        val person2 = gsonHelper.fromJson(SampleJson.secondHand, Performance::class.java)
        assertEquals(person2, person1)
    }
    @Test
    internal fun `same object with incorrect type call fromJson should equals`() {
        val gsonHelper = GsonHelper()
        val person1 = gsonHelper.fromJson(SampleJson.secondHand1, Performance::class.java)
        val person2 = gsonHelper.fromJson(SampleJson.secondHand1, Performance::class.java)
        assertEquals(person2, person1)
    }

    @Test
    internal fun `same objects title should equals`() {
        val gsonHelper = GsonHelper()
        val person1 = gsonHelper.fromJson(SampleJson.secondHand, Performance::class.java)
        val person2 = gsonHelper.fromJson(SampleJson.secondHand, Performance::class.java)
        assertEquals(person2.resultPage[0].title, person1.resultPage[0].title)
    }

    @Test
    internal fun `empty object should return empty list`() {
        val gsonHelper = GsonHelper()
        val person1 = gsonHelper.fromJson(SampleJson.secondHandEmptyResult, Performance::class.java)
        assertEquals(emptyList<ResultPage>(), person1.resultPage)
    }

    @Test
    internal fun `no data should return empty list`() {
        val gsonHelper = GsonHelper()
        val person1 = gsonHelper.fromJson(SampleJson.secondHandNoResult, Performance::class.java)
        assertEquals(emptyList<ResultPage>(), person1.resultPage)
    }

}