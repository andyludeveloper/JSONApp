package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.models.PersonS
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class SerializationHelper {
    inline fun <reified T> fromJson(string: String): T {
        return Json.decodeFromString(string)
    }
}