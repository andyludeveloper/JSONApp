package com.andydeveloper.jsonapp.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PersonS(
//    @SerialName("firstName")
    val firstName: String,
//    @SerialName("lastName")
    val lastName: String = "test",
    val age: Int
)
