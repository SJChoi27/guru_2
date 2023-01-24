package com.example.test

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

//첫 화면
//가족코드 (혹은 지정된 가족 이름) 을 이용해 그룹에 참여
//그룹 추가 버튼을 누르면 그룹 추가 페이지로 이동
//코드를 입력했을 경우 닉네임 입력 페이지로 이동
//큐얼코드는 시간이 된다면 추가 예정

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        appBarMode(false) //앱바 감추기 (전체화면)
    }

    //앱바 감추기 함수 (전체화면)
    private fun appBarMode(switch: Boolean){
        if(switch){
            supportActionBar?.show()
        }else {
            supportActionBar?.hide()
        }
    }
}

class DBManeger(context: Context, name: String, factory: SQLiteDatabase.CursorFactory?, version: Int):
        SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}