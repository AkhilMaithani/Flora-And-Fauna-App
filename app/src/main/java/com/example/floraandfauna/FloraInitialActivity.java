package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class FloraInitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora_initial);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(FloraInitialActivity.this, "Flora Dashboard Open's", Toast.LENGTH_SHORT).show();
                Intent iFlora = new Intent(FloraInitialActivity.this, FloraActivity.class);
                startActivity(iFlora);
                finish();
            }
        }, 1000);
    }
}