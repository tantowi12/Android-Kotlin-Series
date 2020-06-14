package com.example.test123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TextSize : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_size)

        button = findViewById(R.id.btnBack)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        button = findViewById(R.id.btnNext)
        button.setOnClickListener {
            startActivity(Intent(this, TextStyle::class.java))
        }
    }
}