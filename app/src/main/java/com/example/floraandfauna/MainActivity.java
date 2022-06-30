package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btnDashboardFlora, btnDashboardFauna;

    private void setId() {
        btnDashboardFlora = findViewById(R.id.btnDashboardFlora);
        btnDashboardFauna = findViewById(R.id.btnDashboardFauna);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setId();

        btnDashboardFlora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iFlora = new Intent(MainActivity.this, FloraInitialActivity.class);
                startActivity(iFlora);
            }
        });

        btnDashboardFauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iFauna = new Intent(MainActivity.this, FaunaInitialActivity.class);
                startActivity(iFauna);
            }
        });
    }
}