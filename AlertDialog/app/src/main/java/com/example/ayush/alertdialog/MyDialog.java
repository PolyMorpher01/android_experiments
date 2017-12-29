package com.example.ayush.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Ayush on 27/12/2017.
 */

public class MyDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("My Dialog");

       // builder.setMessage("A very good Dialog");

       /* builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"item "+(i+1)+ " was clicked",Toast.LENGTH_SHORT).show();
            }
        });*/

       builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i, boolean b) {

               Toast.makeText(getActivity(),"item "+(i+1)+ " was selected " + b,Toast.LENGTH_SHORT).show();

           }
       });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"negative button clicked",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"positive button clicked",Toast.LENGTH_SHORT).show();
            }
        });



        Dialog dialog = builder.create();

        return dialog;
    }
}
