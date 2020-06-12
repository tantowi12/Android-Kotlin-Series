package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FitEnd : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fit_end)

        button = findViewById(R.id.btnBack4)
        button.setOnClickListener {
            startActivity(Intent(this, FitCenter::class.java))
        }

        button = findViewById(R.id.btnNext5)
        button.setOnClickListener {
            startActivity(Intent(this, FitStart::class.java))
        }
    }
}