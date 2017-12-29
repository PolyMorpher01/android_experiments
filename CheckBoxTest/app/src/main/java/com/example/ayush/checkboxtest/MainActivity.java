package com.example.ayush.checkboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 =findViewById(R.id.checkBox);
        c1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        CheckBox t  = (CheckBox) view;
        if(t.isChecked()){
            Toast.makeText(this, "Checked!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Unchecked!",Toast.LENGTH_SHORT).show();
        }
    }
}
