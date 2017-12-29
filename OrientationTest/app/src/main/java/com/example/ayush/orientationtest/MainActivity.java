package com.example.ayush.orientationtest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("Ayush","oreintation changed " + newConfig.orientation);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Ayush","landscape mode");

        }
        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Log.d("Ayush","portrait mode");

        }

    }
}
