package com.example.ayush.sharedpreferencesexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername,txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtUsername = findViewById(R.id.txt_username);
        txtPassword = findViewById(R.id.txt_password);
    }

    public void save(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name",txtUsername.getText().toString());
        editor.putString("password",txtPassword.getText().toString());

        editor.commit();

        Toast.makeText(this, "Data was saved", Toast.LENGTH_SHORT).show();
    }

    public void next(View view) {
        Intent intent = new Intent(this,ActivityB.class);
        startActivity(intent);
    }
}
