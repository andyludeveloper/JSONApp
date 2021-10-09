package com.andydeveloper.jsonapp

object SampleJson {
    val jsonString = """
    {
    "firstName":"Andy",
     "lastName":"Lu",
      "age":30
      }
""".trimIndent()

    val secondHand = """
        {
            "totalResults": 1,
            "resultPage": [
                {
                    "entityType": "performance",
                    "uri": "https://secondhandsongs.com/performance/25405",
                    "title": "Something in the Way",
                    "performer": {
                        "uri": "https://secondhandsongs.com/artist/169",
                        "name": "Nirvana [US]"
                    },
                    "isOriginal": true
                }
            ],
            "skippedResults": 0
        }
    """.trimIndent()

    val secondHandEmptyResult = """
        {
            "totalResults": 1,
            "resultPage": [],
            "skippedResults": 0
        }
    """.trimIndent()
    val secondHandNoResult = """
        {
            "totalResults": 1,
            "skippedResults": 0
        }
    """.trimIndent()

}