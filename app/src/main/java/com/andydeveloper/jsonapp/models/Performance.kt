package com.andydeveloper.jsonapp.models

data class Performance(
    val resultPage: List<ResultPage> = emptyList(),
    val skippedResults: Int,
    val totalResults: Int
)