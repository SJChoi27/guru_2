package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var fixButton : Button
    lateinit var diaryTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fixButton = findViewById(R.id.fixButton)

        fixButton.setOnClickListener {
            var intent = Intent(this, addCalendarActivity::class.java)
            startActivity(intent)
        }


    }
}