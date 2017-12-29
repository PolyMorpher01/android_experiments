package com.example.ayush.layoutjava;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ll = new LinearLayout(this);
        t = new TextView(this);
        b = new Button(this);

        LinearLayout.LayoutParams dimen = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(dimen);


        LinearLayout.LayoutParams viewDimen = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        t.setLayoutParams(viewDimen);
        b.setLayoutParams(viewDimen);

        ll.setOrientation(LinearLayout.VERTICAL);
        t.setText("Hello");
        b.setText("Click Here");

        ll.addView(t);
        ll.addView(b);

        setContentView(ll);
    }
}
