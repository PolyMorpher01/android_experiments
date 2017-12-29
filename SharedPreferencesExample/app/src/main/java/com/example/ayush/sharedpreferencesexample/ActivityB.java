package com.example.ayush.sharedpreferencesexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    static final String DEFAULT = "N/A";

    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        txtUsername = findViewById(R.id.txt_username);
        txtPassword = findViewById(R.id.txt_password);
    }

    public void load(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);

        String name = sharedPreferences.getString("name",DEFAULT);
        String password = sharedPreferences.getString("password",DEFAULT);


        if(name == DEFAULT || password == DEFAULT){

            Toast.makeText(this, "No data was found", Toast.LENGTH_SHORT).show();

        }
        
        else {

            txtUsername.setText(name);
            txtPassword.setText(password);

            Toast.makeText(this, "Data was loaded successfully", Toast.LENGTH_SHORT).show();
            
        }

    }

    public void previous(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
