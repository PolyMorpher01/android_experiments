package com.example.ayush.internalstorageexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txt_username);
        txtPassword = findViewById(R.id.txt_password);
    }

    public void save(View view) throws IOException {

        String uname = txtUsername.getText().toString();
        String pass = txtPassword.getText().toString();

        uname = uname + " ";
        pass = pass + " ";

        FileOutputStream fos = openFileOutput("example.txt", Context.MODE_PRIVATE);

        fos.write(uname.getBytes());
        fos.write(pass.getBytes());

        File file = getFilesDir();

        Toast.makeText(this, "Data was saved" + file, Toast.LENGTH_SHORT).show();
    }

    public void next(View view) {
        Intent intent = new Intent(this,ActivityB.class);
        startActivity(intent);
    }
}
