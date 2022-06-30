package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FaunaActivity extends AppCompatActivity {
    AppCompatButton BtnMusk, BtnMonal, BtnTiger, BtnElephant, BtnJimCorbett;

    private void setId() {
        BtnMusk = findViewById(R.id.BtnMusk);
        BtnMonal = findViewById(R.id.BtnMonal);
        BtnTiger = findViewById(R.id.BtnTiger);
        BtnElephant = findViewById(R.id.BtnElephant);
        BtnJimCorbett = findViewById(R.id.BtnJimCorbett);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna);

        setId();

        BtnMusk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMusk = new Intent(FaunaActivity.this, MuskDeerActivity.class);
                startActivity(iMusk);
            }
        });

        BtnMonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMonal = new Intent(FaunaActivity.this, MonalBirdActivity.class);
                startActivity(iMonal);
            }
        });

        BtnTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTiger = new Intent(FaunaActivity.this, TigerActivity.class);
                startActivity(iTiger);
            }
        });

        BtnElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iElephant = new Intent(FaunaActivity.this, ElephantActivity.class);
                startActivity(iElephant);
            }
        });

        BtnJimCorbett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iJimCorbett = new Intent(FaunaActivity.this, JimCorbettActivity.class);
                startActivity(iJimCorbett);
            }
        });
    }
}