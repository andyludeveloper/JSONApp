package com.andydeveloper.jsonapp.models

data class ResultPage(
    val entityType: String,
    val isOriginal: Boolean,
    val performer: Performer,
    val title: String,
    val uri: String
)