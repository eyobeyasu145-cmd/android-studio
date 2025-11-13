package com.example.lab1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



      public void setting(View v){
          Intent i = new Intent(this,SettingsActivity2.class);
            startActivity(i);

      }

    }
//  // Change background color
//    ts.setBackgroundColor(Color.parseColor("#FFC107")); // Amber yellow
//
//    // Optional: change text color too
//    ts.setTextColor(Color.WHITE);
//
//    // Add animation (your existing one)
//    ts.animate().scaleX(2).scaleY(2).setDuration(2000);