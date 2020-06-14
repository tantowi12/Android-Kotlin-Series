package com.example.test123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TextStyle : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_style)

        button = findViewById(R.id.btnBack1)
        button.setOnClickListener {
            startActivity(Intent(this, TextSize::class.java))
        }
    }
}