package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.SampleJson
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class JsonHelperTest {
    val secondHandJson = """
        {
            "totalResults": 1,
            "resultPage": [
                {
                    "entityType": "performance",
                    "uri": "https://secondhandsongs.com/performance/25405",
                    "title": "Something in the Way",
                    "performer": {
                        "uri": "https://secondhandsongs.com/artist/169",
                        "name": "Nirvana [US]"
                    },
                    "isOriginal": true
                }
            ],
            "skippedResults": 0
        }
    """.trimIndent()

    private lateinit var jsonHelper: JsonHelper

    @BeforeEach
    internal fun setUp() {
        jsonHelper = JsonHelper()
    }

    @Test
    internal fun toJson() {
        val jsonObject = jsonHelper.toJson(SampleJson.jsonString)
        val jsonObject2 = jsonHelper.toJson(SampleJson.jsonString)
        Assertions.assertEquals(jsonObject2, jsonObject)
    }

    @Test
    internal fun `totalResults should returns 1`() {
        val jsonObject = jsonHelper.toJson(secondHandJson)
        val totalResults = jsonObject["totalResults"]
        Assertions.assertEquals(1, totalResults)
    }


}