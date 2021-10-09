package com.andydeveloper.jsonapp.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PerformanceM(
    val resultPage: List<ResultPageM> = emptyList(),
    val skippedResults: Int,
    val totalResults: Int
)