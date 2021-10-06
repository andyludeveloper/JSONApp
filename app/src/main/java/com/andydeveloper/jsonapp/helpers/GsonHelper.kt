package com.andydeveloper.jsonapp.helpers

import com.google.gson.Gson

class GsonHelper {
    fun <T> fromJson(jsonString: String, type: Class<T>): T {
        val gson = Gson()
        return gson.fromJson(jsonString, type)
    }
}