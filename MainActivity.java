package com.example.uzodzenia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Odkurzacz odkurzacz;
    Pralka pralka;
    Button button1;
    Button button2;
    EditText input;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        odkurzacz = new Odkurzacz();
        pralka = new Pralka();
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        input = findViewById(R.id.editTextTextPersonName);

    }
}