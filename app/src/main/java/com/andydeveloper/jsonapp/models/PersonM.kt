package com.andydeveloper.jsonapp.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
data class PersonM(
//    @Json(name = "firstName")
    val firstName: String,
//    @Json(name = "lastName")
    val lastName: String = "temp"
)
