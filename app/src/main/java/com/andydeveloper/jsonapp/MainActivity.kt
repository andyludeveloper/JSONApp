package com.andydeveloper.jsonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.andydeveloper.jsonapp.helpers.GsonHelper
import com.andydeveloper.jsonapp.helpers.JsonHelper
import com.andydeveloper.jsonapp.helpers.MoshiHelper
import com.andydeveloper.jsonapp.helpers.SerializationHelper
import com.andydeveloper.jsonapp.models.Person
import com.andydeveloper.jsonapp.models.PersonM
import com.andydeveloper.jsonapp.models.PersonS

val jsonString = """
    {
    "firstName":"Andy",
    "lastName":"Lu",
    
      "age":30
      }
""".trimIndent()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gson = findViewById<TextView>(R.id.gsonContent)
        val json = findViewById<TextView>(R.id.jsonContent)
        val moshi = findViewById<TextView>(R.id.moshiContent)
        val serialization = findViewById<TextView>(R.id.serializationContent)

        val person = GsonHelper().fromJson(jsonString, Person::class.java)
//        val fromJson = Gson().fromJson<Person>(jsonString, Person::class.java)
        gson.text = person.toString()

        val jsonObject = JsonHelper().toJson(jsonString)
        json.text = jsonObject.toString()

//        jsonObject["address"]
        val personM = MoshiHelper().fromJson(jsonString, PersonM::class.java)
        moshi.text = personM.toString()

        val personS = SerializationHelper().fromJson<PersonS>(jsonString)
        serialization.text = personS.toString()
    }
}