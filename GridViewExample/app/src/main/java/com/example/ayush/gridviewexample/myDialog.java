package com.example.ayush.gridviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class myDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);

        Intent intent = getIntent();

        if(intent != null){
            int countryImage = intent.getIntExtra("countryImage",R.drawable.nepal);
            //String countryName = intent.getStringExtra("countryName");

            ImageView imageView = findViewById(R.id.myDialogImageView);
            imageView.setImageResource(countryImage);

            //TextView textView = findViewById(R.id.myDialogTextView);
            //textView.setText("This flag belongs to "+countryName);


        }
    }

    public void closeDialog(View view) {
        finish();
    }
}
