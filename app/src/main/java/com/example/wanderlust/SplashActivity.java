package com.example.wanderlust;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView bg, logo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        bg = findViewById(R.id.background);
        logo = findViewById(R.id.logo);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();
        
        runNextScreen();



    }

    private void runNextScreen() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, StartActivity.class);
                startActivity(intent);
                finish();

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        }, 1500);
    }

    public void Login_Activity(View view) {





    }
}