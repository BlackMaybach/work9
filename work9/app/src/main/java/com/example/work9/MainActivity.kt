package com.example.work9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.work9.models.MedicalCard
import com.example.work9.models.Sickness
import com.example.work9.models.Vaccine
import java.util.*

class MainActivity : AppCompatActivity() {

//    var medicalCard: MedicalCard? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var medicalCard = MedicalCard(
            id = "1",
            fullName = "Maybach",
            birthDate = Date(),
            gender = "Мужчина",
            bloodType = "1",
            address = "Аламедин - 1",
            vacHistory = arrayListOf(Vaccine(
                vacName = "Фласка Маны",
                date = Date(),
                address = "Аламедин - 1"
            )),
            sicknessHistory = arrayListOf()
        )
        medicalCard.sicknessHistory?.add(Sickness(
            name = "Болен",
            date = Date(),
            status = "Болен status",
            endDate = null
        ))
    }
}