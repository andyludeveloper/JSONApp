package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class JsonHelperTest {
    @Test
    internal fun toJson() {
        val jsonHelper = JsonHelper()
        val jsonObject = jsonHelper.toJson(SampleJson.jsonString)
        val jsonObject2 = jsonHelper.toJson(SampleJson.jsonString)
        Assertions.assertEquals(jsonObject2, jsonObject)
    }
}