package com.example.ayush.internalstorageexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ActivityB extends AppCompatActivity {

    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        txtUsername = findViewById(R.id.txt_username);
        txtPassword = findViewById(R.id.txt_password);
    }

    public void load(View view) throws IOException {

        FileInputStream fis = openFileInput("example.txt");

        StringBuffer stringBuffer = new StringBuffer();

        int read;

        while((read = fis.read())!=-1){

            stringBuffer.append((char)read);
        }

        String uname = stringBuffer.substring(0,stringBuffer.indexOf(" "));
        String pass = stringBuffer.substring(stringBuffer.indexOf(" ")+1);

        txtUsername.setText(uname);
        txtPassword.setText(pass);

        Toast.makeText(this, "Data was loaded successfully", Toast.LENGTH_SHORT).show();
    }

    public void previous(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
