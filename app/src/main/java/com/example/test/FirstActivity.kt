package com.example.test

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

//첫 화면
//가족코드 (혹은 지정된 가족 이름) 을 이용해 그룹에 참여
//그룹 추가 버튼을 누르면 그룹 추가 페이지로 이동
//코드를 입력했을 경우 닉네임 입력 페이지로 이동
//큐얼코드는 시간이 된다면 추가 예정

class FirstActivity : AppCompatActivity() {

    lateinit var nameAddTextView : TextView //닉네임을 입력해주세요!
    lateinit var nameEditText : EditText //닉네임 입력칸
    lateinit var checkButton : Button //확인 버튼
    lateinit var makenewTextView : TextView //코드 번호가 없다면 새로운 그룹을 만드세요!
    lateinit var insertButton: Button //코드 입력 버튼
    lateinit var makeButton:Button //가족 생성 버튼
    lateinit var groupAddTextView: TextView //그룹 코드를 입력해주세요!
    lateinit var groupEditText : EditText //그룹 코드 입력칸
    lateinit var checkButton2 : Button //확인 버튼
    lateinit var welcomeTextView : TextView //환영 문구

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        checkButton = findViewById(R.id.checkButton)

        checkButton.setOnClickListener {
            nameAddTextView.visibility=View.INVISIBLE
            nameEditText.visibility=View.INVISIBLE
            makenewTextView.visibility=View.VISIBLE
            insertButton.visibility=View.VISIBLE
            makeButton.visibility=View.VISIBLE
            groupAddTextView.visibility=View.INVISIBLE
            groupEditText.visibility=View.INVISIBLE
            checkButton2.visibility=View.INVISIBLE
            welcomeTextView.visibility=View.INVISIBLE
        }

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
