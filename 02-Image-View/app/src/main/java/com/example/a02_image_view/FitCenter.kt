package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FitCenter : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fit_center)

        button = findViewById(R.id.btnBack3)
        button.setOnClickListener {
            startActivity(Intent(this, Matrix::class.java))
        }

        button = findViewById(R.id.btnNext4)
        button.setOnClickListener {
            startActivity(Intent(this, FitEnd::class.java))
        }
    }
}