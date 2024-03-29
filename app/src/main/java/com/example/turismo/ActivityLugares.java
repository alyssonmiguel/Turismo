package com.example.turismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityLugares extends AppCompatActivity {

    private TextView textViewLugar;
    private  TextView textViewDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        textViewLugar = findViewById(R.id.textViewLugar);
        textViewDescricao = findViewById(R.id.textViewDescricao);

        Intent intent = getIntent();
        String lugar = intent.getStringExtra("LUGAR");
        String descricao = intent.getStringExtra("DESCRICAO");

        textViewLugar.setText(lugar);
        textViewDescricao.setText(descricao);
    }
}
