package com.example.floraandfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // create delay for splash screen or intro screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // move from splash screen to dashboard screen
                Intent iDashboard = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(iDashboard);
                finish(); // in order to prevent backtracking to the splash screen again
            }
        }, 3000);
    }
}