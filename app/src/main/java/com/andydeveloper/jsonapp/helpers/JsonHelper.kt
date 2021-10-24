package com.andydeveloper.jsonapp.helpers

import org.json.JSONObject

class JsonHelper {
    fun toJson(string: String): JSONObject = JSONObject(string)
}