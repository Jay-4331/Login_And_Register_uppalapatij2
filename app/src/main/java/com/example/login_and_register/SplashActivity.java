package com.example.login_and_register;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_and_register.LoginActivity;
import com.example.login_and_register.R;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIMEOUT = 2000; // Splash screen time in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close this splash activity to prevent from going back
            }
        }, SPLASH_TIMEOUT);
    }
}
