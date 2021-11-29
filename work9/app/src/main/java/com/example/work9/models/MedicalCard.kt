package com.example.work9.models

import java.util.*

data class MedicalCard(
    var id: String,
    var fullName: String,
    var birthDate: Date,
    var gender: String,
    var bloodType: String,
    var address: String?,
    var vacHistory: ArrayList<Vaccine>?,
    var sicknessHistory: ArrayList<Sickness>?
)

