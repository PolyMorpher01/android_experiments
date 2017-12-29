package com.example.ayush.explicitintenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
    }

    public void Next(View v){
        Intent i = new Intent();
        i.setClassName("com.example.ayush.explicitintenttest","com.example.ayush.explicitintenttest.ActivityB");
        startActivity(i);
    }
}
