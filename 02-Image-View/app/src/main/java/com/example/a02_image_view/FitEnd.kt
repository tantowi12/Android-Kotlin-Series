package com.example.a02_image_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FitEnd : AppCompatActivity() {

    private lateinit var button5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fit_end)

        button5 = findViewById(R.id.btnBack4)
        button5.setOnClickListener {
            startActivity(Intent(this, FitCenter::class.java))
        }

        button5 = findViewById(R.id.btnNext5)
        button5.setOnClickListener {
            startActivity(Intent(this, FitStart::class.java))
        }
    }
}