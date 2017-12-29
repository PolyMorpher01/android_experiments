package com.example.ayush.listviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String [] data ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l=findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView1,data);

        l.setAdapter(adapter);
    }
}
