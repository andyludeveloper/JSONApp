package com.andydeveloper.jsonapp.models

import kotlinx.serialization.Serializable

@Serializable
data class ResultPageS(
    val entityType: String,
    val isOriginal: Boolean,
    val performer: PerformerS,
    val title: String,
    val uri: String
)