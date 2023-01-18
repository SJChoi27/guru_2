package com.example.withmily

import android.content.Intent

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    //xml에 생성해둔 ui 정보를 호출해서 변수로 생성
    lateinit var calendarView: CalendarView //달력 (안드로이드 기본 달력)
    lateinit var addCalButton: Button //달력 게시물 추가 버튼


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //달력 게시물 추가 버튼 UI 변수
        addCalButton = findViewById<Button>(R.id.addCalButton)
        // 달력 UI 변수
        calendarView=findViewById(R.id.calendarView)

        //추가 버튼을 클릭했을 때 addCalendar(게시물 작성페이지)로 넘어가기
        addCalButton.setOnClickListener {
            var intent = Intent (this, addCalendar::class.java)
            startActivity(intent)
        }
    }
}



































