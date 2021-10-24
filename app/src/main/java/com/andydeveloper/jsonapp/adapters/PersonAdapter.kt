package com.andydeveloper.jsonapp.adapters

import com.andydeveloper.jsonapp.models.PerformanceM
import com.andydeveloper.jsonapp.models.PersonM
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

class PersonAdapter {
    @ToJson
    fun toJson(personM: PersonM): String {
        return "${personM.firstName} ${personM.lastName}"
    }

    @FromJson
    fun fromJson(card: String): PersonM {
        val firstName = card.substringBefore(" ")
        val lastName = card.substringAfter(" ")
        return PersonM(firstName, lastName)
    }
}