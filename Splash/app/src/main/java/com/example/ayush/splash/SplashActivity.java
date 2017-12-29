package com.example.ayush.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ayush on 02/08/2017.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start home activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        // close splash activity
        finish();
    }
}
