package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var knopka : Button
    lateinit var text :TextView
    lateinit var note: Note
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        knopka = findViewById(R.id.knopka)
        text = findViewById(R.id.text)
        knopka.setOnClickListener(this)
        knopka.setOnClickListener{
            knopka.text = "Да"
            val note = Note("Name", "Text")
            val copy = note.copy()
            val toast = Toast.makeText(applicationContext, doExp(), Toast.LENGTH_LONG )

        }

        doExp()
    }





    fun doExp(): Note {
        val note = Note("Name", "Text")
        val copy = note.copy()
        return note
    }
}

