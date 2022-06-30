package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FloraActivity extends AppCompatActivity {
    AppCompatButton BtnBrahma, BtnBurans, BtnPine, BtnBlue, BtnValley;

    private void setId() {
        BtnBrahma = findViewById(R.id.BtnBrahma);
        BtnBurans = findViewById(R.id.BtnBurans);
        BtnPine = findViewById(R.id.BtnPine);
        BtnBlue = findViewById(R.id.BtnBlue);
        BtnValley = findViewById(R.id.BtnValley);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora);

        setId();

        BtnBrahma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBrahma = new Intent(FloraActivity.this, BrahmaKamalActivity.class);
                startActivity(iBrahma);
            }
        });

        BtnBurans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBurans = new Intent(FloraActivity.this, BuransActivity.class);
                startActivity(iBurans);
            }
        });

        BtnPine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPine = new Intent(FloraActivity.this, PineActivity.class);
                startActivity(iPine);
            }
        });

        BtnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBlue = new Intent(FloraActivity.this, BluePoppyActivity.class);
                startActivity(iBlue);
            }
        });

        BtnValley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iValley = new Intent(FloraActivity.this, ValleyOfFlowersActivity.class);
                startActivity(iValley);
            }
        });
    }
}