package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ranking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking);
        final Button juego = findViewById(R.id.juegoButton);
        juego.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent volverAlJuego = new Intent(Ranking.this, myActivity.class);
                startActivity(volverAlJuego);
            }
        });
    }

}