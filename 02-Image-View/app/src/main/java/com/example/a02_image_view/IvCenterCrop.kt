package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IvCenterCrop : AppCompatActivity() {

    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iv_center_crop)

        button1 = findViewById(R.id.btnBack)
        button1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        button1 = findViewById(R.id.btnNext1)
        button1.setOnClickListener {
            startActivity(Intent(this,IvCenterInside::class.java))
        }
    }
}