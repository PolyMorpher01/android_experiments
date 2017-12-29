package com.example.ayush.clickexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);

        b1.setOnClickListener(button_click);
        b2.setOnClickListener(button_click);
    }

    OnClickListener button_click = new OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button1:
                    Toast.makeText(MainActivity.this, "you cliced button 1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Toast.makeText(MainActivity.this, "you cliced button 2", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    };
}
