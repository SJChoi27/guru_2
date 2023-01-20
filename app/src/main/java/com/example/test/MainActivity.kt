package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {

    lateinit var addCalendarbutton : Button
    lateinit var calendarView: CalendarView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addCalendarbutton = findViewById<Button>(R.id.addCalendarbutton)
        calendarView = findViewById<CalendarView>(R.id.calendarView)

        addCalendarbutton.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}