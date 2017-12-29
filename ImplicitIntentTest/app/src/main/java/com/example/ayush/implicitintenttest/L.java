package com.example.ayush.implicitintenttest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Ayush on 12/12/2017.
 */

public class L {
    public static void m(String message){
        Log.d("Vivz",message);
    }

    public static void s(Context context, String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }
}
