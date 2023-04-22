package com.bignerdranch.android.criminalintent
import java.util.*
// Importing to fix UUID red squiggle resulted in the * inclusion of all, hopefully this does not adversely affect Date

data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    //Add val boolean for crimes that require police
    val requiresPolice: Boolean = false
)
