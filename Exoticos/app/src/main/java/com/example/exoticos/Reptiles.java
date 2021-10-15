package com.example.exoticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Reptiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles);
    }

    public void pasarAnterior(View view) {
        Intent anterior = new Intent(this, Animales.class);
        startActivity(anterior);
    }
}