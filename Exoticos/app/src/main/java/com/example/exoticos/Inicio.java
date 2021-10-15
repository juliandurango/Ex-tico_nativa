package com.example.exoticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void pasarAnimales(View view) {
        Intent animales = new Intent(this, Animales.class);
        startActivity(animales);
    }

    public void pasarQuienes(View view) {
        Intent creditos = new Intent(this, Creditos.class);
        startActivity(creditos);
    }

    public void pasarLugares(View view) {
        Intent lugares = new Intent(this, Lugares.class);
        startActivity(lugares);
    }
}