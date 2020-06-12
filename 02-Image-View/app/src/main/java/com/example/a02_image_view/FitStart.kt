package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FitStart : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fit_start)

        button = findViewById(R.id.btnBack5)
        button.setOnClickListener {
            startActivity(Intent(this, FitEnd::class.java))
        }

        button = findViewById(R.id.btnNext6)
        button.setOnClickListener {
            startActivity(Intent(this, FitXY::class.java))
        }
    }
}