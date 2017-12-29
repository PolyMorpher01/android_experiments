package com.example.ayush.layoutinflatorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater I = getLayoutInflater();

        LinearLayout l = findViewById(R.id.my_linear_layout);
        FrameLayout f = findViewById(R.id.my_frame_layout);

        View v = I.inflate(R.layout.sublayout,null);
        //View v = I.inflate(R.layout.sublayout,l,true);


        l.addView(v);

    }
}
