package com.example.lab1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar; // <-- Import the Toolbar class

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Home");
        }
    }




    public void reg(View v){
        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        String username = user.getText().toString();
        String password = pass.getText().toString();

        // Save using SharedPreferences
        SharedPreferences prefs = getSharedPreferences("UserData", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("username", username);
        editor.putString("password", password);
        editor.apply(); // save

        Toast.makeText(this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
    }
//    public void welcom(View v){
//        EditText user = findViewById(R.id.username);
//        EditText pass = findViewById(R.id.password);
//
//        String inputUser = user.getText().toString();
//        String inputPass = pass.getText().toString();
//
//        // Load saved data
//        SharedPreferences prefs = getSharedPreferences("UserData", MODE_PRIVATE);
//        String savedUser = prefs.getString("username", "");
//        String savedPass = prefs.getString("password", "");
//
//        if(inputUser.equals(savedUser) && inputPass.equals(savedPass)){
//            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
//            // open next activity here
//        } else {
//            Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
//        } }

    public void welcome(View v){
        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        String inputUser = user.getText().toString();
        String inputPass = pass.getText().toString();

        // Hard-coded usernames and passwords
        HashMap<String, String> accounts = new HashMap<>();
        accounts.put("eyob", "1234");
        accounts.put("job", "1122");
        accounts.put("admin", "0000");

        if(accounts.containsKey(inputUser) && accounts.get(inputUser).equals(inputPass)){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            // open next activity
        } else {
            Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
        }
    }












//    public void welcome(View v){
//        Intent i = new Intent(this,wecome.class);
//       EditText ed =  findViewById(R.id.loginUsername);
//        String message = ed.getText().toString();
//         i.putExtra("COOL",message);
//        startActivity(i);
//
//    }
//     public void reg(View v){
//          Intent i = new Intent(this,SigninActivity.class);
//          i.putExtra("COOL","HELLO");
//          startActivity(i);
//
//
//    }
    }