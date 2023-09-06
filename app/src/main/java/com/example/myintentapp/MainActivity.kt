package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnMove :  Button
    lateinit var btnIntentWithData : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move)
        btnIntentWithData = findViewById(R.id.btn_intent_with_data)

        btnMove.setOnClickListener{
            val intent = Intent(this@MainActivity, IntentActivity::class.java)

            startActivity(intent)
        }

        btnIntentWithData.setOnClickListener {
            val intent = Intent(this@MainActivity, IntentWithDataActivity::class.java)
            intent.putExtra(IntentWithDataActivity.EXTRA_DATA, "Kamu Berhasil Gan!!")
            startActivity(intent)
        }
    }
}