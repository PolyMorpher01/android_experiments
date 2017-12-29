package com.example.ayush.togglebuttontest;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    ToggleButton t1;
    ConstraintLayout c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= findViewById(R.id.toggleButton);
        c1= findViewById(R.id.cs);

        t1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            c1.setBackgroundColor(Color.GRAY);
        }

        else{
            c1.setBackgroundColor(Color.WHITE);

        }
    }
}
