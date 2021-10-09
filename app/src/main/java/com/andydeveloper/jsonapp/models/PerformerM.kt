package com.andydeveloper.jsonapp.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PerformerM(
    val name: String,
    val uri: String
)