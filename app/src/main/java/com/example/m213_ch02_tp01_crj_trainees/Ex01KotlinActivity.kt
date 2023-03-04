package com.example.m213_ch02_tp01_crj_trainees

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ex01KotlinActivity : AppCompatActivity() {
    val btnEx01Minus: Button by lazy {
        findViewById(R.id.btnEx01Minus)
    }
    val btnEx01Plus: Button by lazy {
        findViewById(R.id.btnEx01Plus)
    }
    val tvEx01Age: TextView by lazy {
        findViewById(R.id.tvEx01Age)
    }

    var age = 18;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex01)

        btnEx01Minus.setOnClickListener {
            age--;
            tvEx01Age.text = age.toString()
        }
    }
}