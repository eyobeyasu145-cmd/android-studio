package com.example.lab1;

import android.icu.util.Output;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
  public void result(View view) {
      EditText ins = findViewById(R.id.source);
      String text = ins.getText().toString();
      ((TextView) findViewById(R.id.textView2)).setText("mame is :" + text);
      Toast.makeText(this, "mame is :" + text, Toast.LENGTH_SHORT).show();

  }

    }

