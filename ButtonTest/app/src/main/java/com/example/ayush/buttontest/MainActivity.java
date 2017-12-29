package com.example.ayush.buttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View v){

        if ( v.getId()==R.id.button1)
            Log.d("button",  " first button Was clicked");
        else if( v.getId()==R.id.button2)
            Log.d("button",  " second button Was clicked");

    }
}
