package com.andydeveloper.jsonapp.models

import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String = "test"
)
