package com.andydeveloper.jsonapp.models

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class PerformerS(
    val name: String,
    val uri: String
)