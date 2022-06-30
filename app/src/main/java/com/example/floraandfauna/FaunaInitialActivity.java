package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class FaunaInitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna_initial);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(FaunaInitialActivity.this, "Fauna Dashboard Open's", Toast.LENGTH_SHORT).show();
                Intent iFauna = new Intent(FaunaInitialActivity.this, FaunaActivity.class);
                startActivity(iFauna);
                finish();
            }
        }, 1000);
    }
}