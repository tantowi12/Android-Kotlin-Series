package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IvCenterCrop : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iv_center_crop)

        button = findViewById(R.id.btnBack)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        button = findViewById(R.id.btnNext1)
        button.setOnClickListener {
            startActivity(Intent(this,IvCenterInside::class.java))
        }
    }
}