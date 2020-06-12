package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Matrix : AppCompatActivity() {

    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matrix)

        button3 = findViewById(R.id.btnBack2)
        button3.setOnClickListener {
            startActivity(Intent(this, IvCenterInside::class.java))
        }

        button3 = findViewById(R.id.btnNext3)
        button3.setOnClickListener {
            startActivity(Intent(this, FitCenter::class.java))
        }
    }
}