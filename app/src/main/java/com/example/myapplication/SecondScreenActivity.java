package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreenActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen2);

        Intent intent = getIntent();
        String text = intent.getStringExtra("firstScreen");
        int selectColor = intent.getIntExtra("selectColor", 0);

        String[] colors = getResources().getStringArray(R.array.colors);
        Toast.makeText(this, colors[selectColor], Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.textView);
        textView.setText(text);

        if (colors[selectColor].equals("Red")) {
            textView.setTextColor(getResources().getColor(R.color.purple_200));
        } else if (colors[selectColor].equals("Blue")) {
            textView.setTextColor(getResources().getColor(R.color.purple_500));

        } else if (colors[selectColor].equals("Black")) {
            textView.setTextColor(getResources().getColor(R.color.black));

        } else if (colors[selectColor].equals("Green")) {
            textView.setTextColor(getResources().getColor(R.color.teal_200));

        } else if (colors[selectColor].equals("Orange")) {
            textView.setTextColor(getResources().getColor(R.color.teal_700));
        }


        }
    }

