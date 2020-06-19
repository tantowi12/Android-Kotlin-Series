package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IvCenterInside : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iv_center_inside)

        button = findViewById(R.id.btnBack1)
        button.setOnClickListener {
            startActivity(Intent(this, IvCenterCrop::class.java))
        }

        button = findViewById(R.id.btnNext2)
        button.setOnClickListener {
            startActivity(Intent(this, Matrix::class.java))
        }
    }
}