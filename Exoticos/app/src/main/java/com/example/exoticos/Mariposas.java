package com.example.exoticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mariposas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mariposas);
    }

    public void Volver(View view) {
        Intent volver = new Intent(this, Animales.class);
        startActivity(volver);
    }
}