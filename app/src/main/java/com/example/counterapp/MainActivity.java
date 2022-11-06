package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button countBtn = findViewById(R.id.countBtn);
        Button resetBtn = findViewById(R.id.resetBtn);
        TextView counter = findViewById(R.id.textView);
        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++count;
                counter.setText(new String(String.valueOf(count)));
                Toast.makeText(MainActivity.this, "count increased by one", Toast.LENGTH_SHORT).show();

            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                counter.setText(new String(String.valueOf(count)));
                Toast.makeText(MainActivity.this, "count reset", Toast.LENGTH_SHORT).show();
            }
        });
    }
}