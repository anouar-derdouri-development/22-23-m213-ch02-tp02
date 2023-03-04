package com.example.m213_ch02_tp01_crj_trainees;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Ex01Activity extends AppCompatActivity {
    Button btnEx01Minus;
    Button btnEx01Plus;
    TextView tvEx01Age;

    int min = 18;
    int max = 30;
    int age = min + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);

        btnEx01Minus = findViewById(R.id.btnEx01Minus);
        btnEx01Plus = findViewById(R.id.btnEx01Plus);
        tvEx01Age = findViewById(R.id.tvEx01Age);

        btnEx01Minus.setOnClickListener(view -> {
            if (age > min) {
                age--;
                tvEx01Age.setText(String.valueOf(age));
            }
        });

        btnEx01Plus.setOnClickListener(view -> {
            if (age < max) {
                age++;
                tvEx01Age.setText(String.valueOf(age));
            }
        });

        btnEx01Minus.performClick();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("age", age);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        age = savedInstanceState.getInt("age");
        tvEx01Age.setText(String.valueOf(age));
    }
}