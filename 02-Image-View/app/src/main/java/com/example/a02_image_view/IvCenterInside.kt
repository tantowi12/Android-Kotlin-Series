package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IvCenterInside : AppCompatActivity() {

    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iv_center_inside)

        button2 = findViewById(R.id.btnBack1)
        button2.setOnClickListener {
            startActivity(Intent(this, IvCenterCrop::class.java))
        }

        button2 = findViewById(R.id.btnNext2)
        button2.setOnClickListener {
            startActivity(Intent(this, Matrix::class.java))
        }
    }
}