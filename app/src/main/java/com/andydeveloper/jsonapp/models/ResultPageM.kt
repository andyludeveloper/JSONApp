package com.andydeveloper.jsonapp.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultPageM(
    val entityType: String,
    val isOriginal: Boolean,
    val performer: PerformerM,
    val title: String,
    val uri: String
)