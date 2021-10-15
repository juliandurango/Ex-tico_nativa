package com.example.exoticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void pasarAnfibios(View view) {
        Intent anfibios = new Intent(this, Anfibios.class);
        startActivity(anfibios);
    }

    public void pasarAves(View view) {
        Intent aves = new Intent(this, Aves.class);
        startActivity(aves);
    }

    public void pasarMamiferos(View view) {
        Intent mamiferos = new Intent(this, Mamiferos.class);
        startActivity(mamiferos);
    }

    public void pasarMariposas(View view) {
        Intent mariposas = new Intent(this, Mariposas.class);
        startActivity(mariposas);
    }

    public void pasarPeces(View view) {
        Intent peces = new Intent(this, Peces.class);
        startActivity(peces);
    }

    public void pasarReptiles(View view) {
        Intent reptiles = new Intent(this, Reptiles.class);
        startActivity(reptiles);
    }
}