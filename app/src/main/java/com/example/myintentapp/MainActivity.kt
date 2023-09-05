package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnMove :  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move)
        btnMove.setOnClickListener{
            val intent = Intent(this@MainActivity, IntentActivity::class.java)

            startActivity(intent)
        }

    }
}