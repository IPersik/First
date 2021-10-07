package com.example.myapplication

import java.util.*

data class Note (val title: String, val note: String) {
    fun getNameUppercase()= title.uppercase(Locale.getDefault())
}