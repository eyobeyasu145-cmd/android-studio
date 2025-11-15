package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar));
        getSupportActionBar().setTitle("home");

    }


    public void welcome(View v){
        Intent i = new Intent(this,wecome.class);
        startActivity(i);

    }
      public void reg(View v){
          Intent i = new Intent(this,SigninActivity.class);
          startActivity(i);


    } }