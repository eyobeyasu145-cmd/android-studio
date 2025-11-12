package com.example.lab1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void disable(View v){
        Button button = (Button) v;
        button.setText("Disabled");
        Log.d("succes","Button disable");
    }
    public void textCh(View view){
        TextView tx = findViewById(R.id.texts);
        tx.setText("Text Changed");


    }
}
