package com.example.ayush.implicitintenttest;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {

        Intent intent, chooser;

        if (v.getId() == R.id.launchMap) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.8777"));
            chooser = Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }

        else if (v.getId() == R.id.launchMarket) {
            intent= new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.Slack"));
            chooser = Intent.createChooser(intent, "Launch Market");
            startActivity(chooser);

        }

        else if (v.getId() == R.id.sendEmail) {
            intent= new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"xyz@gmail.com","dolphinDev@mail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"Do not reply");
            intent.putExtra(Intent.EXTRA_TEXT,"Please do not reply");
            intent.setType("message/rfc822");

            chooser = Intent.createChooser(intent, "Launch Email");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.sendImage){
            Uri imageUri = Uri.parse("android.resource://com.example.ayush.implicitintenttest/res/"+R.mipmap.ic_launcher);
            intent= new Intent(Intent.ACTION_SEND);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,imageUri);
            intent.putExtra(Intent.EXTRA_TEXT,"Image Attached");
            chooser = Intent.createChooser(intent, "Send Image");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.sendImages) {
            File pictures = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            String[] listOfPictures = pictures.list();
            Uri uri = null;
            ArrayList<Uri> arrayList = new ArrayList<Uri>();
            for(String picture:listOfPictures){
                uri= Uri.parse("file://"+pictures.toString()+"/"+picture);
                arrayList.add(uri);
            }
            intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,arrayList);
            chooser = Intent.createChooser(intent, "Send Images");
            startActivity(chooser);

        }
    }
}
