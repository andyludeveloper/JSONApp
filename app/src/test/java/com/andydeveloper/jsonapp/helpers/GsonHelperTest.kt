package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import com.andydeveloper.jsonapp.models.Person
import com.google.gson.Gson
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
}