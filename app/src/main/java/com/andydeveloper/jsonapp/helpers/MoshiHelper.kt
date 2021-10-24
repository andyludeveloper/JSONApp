package com.andydeveloper.jsonapp.helpers

import com.andydeveloper.jsonapp.adapters.PersonAdapter
import com.squareup.moshi.Moshi

class MoshiHelper {
    fun <T> fromJson(string: String, clazz: Class<T>): T? {
        val builder = Moshi.Builder()
        val moshi = builder.build()
        val jsonAdapter = moshi.adapter(clazz)
        return jsonAdapter.fromJson(string)
    }

//    fun <T> toJson(type: T, clazz: Class<PersonAdapter>): String {
//        val builder = Moshi.Builder()
//        val moshi = builder.build()
//        val adapter = moshi.adapter(clazz)
//        return adapter.toJson(type)
//    }
}