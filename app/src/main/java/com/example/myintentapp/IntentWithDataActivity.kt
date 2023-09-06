package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentWithDataActivity : AppCompatActivity() {

    lateinit var tvIntentData : TextView
    lateinit var MoveDataToMain : Button

    companion object {
        const val EXTRA_DATA = "Aku adalah ekstra data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_with_data)

        tvIntentData = findViewById(R.id.tv_intent_data)
        MoveDataToMain = findViewById(R.id.btn_data_move_to_main)

        val data = intent.getStringExtra(EXTRA_DATA)

        tvIntentData.text = data

        MoveDataToMain.setOnClickListener{
            val intent = Intent(this@IntentWithDataActivity, MainActivity::class.java)

            startActivity(intent)
        }




    }
}