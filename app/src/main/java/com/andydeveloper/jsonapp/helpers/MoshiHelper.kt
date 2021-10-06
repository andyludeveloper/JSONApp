package com.andydeveloper.jsonapp.helpers

import com.squareup.moshi.Moshi

class MoshiHelper {
    fun <T> fromJson(string: String, clazz: Class<T>): T? {
        val builder = Moshi.Builder()
        val moshi = builder.build()
        val jsonAdapter = moshi.adapter(clazz)
        return jsonAdapter.fromJson(string)
    }
}