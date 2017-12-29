package com.example.ayush.navigationdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ListView listView;
    String [] planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);
        listView = findViewById(R.id.drawerList);

        planets = getResources().getStringArray(R.array.planets);

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,planets));


    }
}
