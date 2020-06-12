package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FitCenter : AppCompatActivity() {

    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fit_center)

        button4 = findViewById(R.id.btnBack3)
        button4.setOnClickListener {
            startActivity(Intent(this, Matrix::class.java))
        }

        button4 = findViewById(R.id.btnNext4)
        button4.setOnClickListener {
            startActivity(Intent(this, FitEnd::class.java))
        }
    }
}