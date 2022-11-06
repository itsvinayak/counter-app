package com.example.counterapp;

import static com.example.counterapp.R.id.countBtnUp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton countBtnUp, countBtnDown;
        countBtnUp = findViewById(R.id.countBtnUp);
        countBtnDown = findViewById(R.id.countBtnDown);
        Button resetBtn = findViewById(R.id.resetBtn);
        TextView counter = findViewById(R.id.textView);
        countBtnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++count;
                counter.setText(new String(String.valueOf(count)));
            }
        });
        countBtnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --count;
                counter.setText(new String(String.valueOf(count)));
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                counter.setText(new String(String.valueOf(count)));
                toast = Toast.makeText(MainActivity.this, "count reset", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
    }
}