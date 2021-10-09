package com.andydeveloper.jsonapp.models

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class PerformanceS(
    val resultPage: List<ResultPageS> = emptyList(),
    val skippedResults: Int,
    val totalResults: Int
)