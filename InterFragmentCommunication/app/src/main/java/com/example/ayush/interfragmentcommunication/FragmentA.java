package com.example.ayush.interfragmentcommunication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ayush on 27/12/2017.
 */

public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter = 0;

    Communicator comm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Communicator)
            comm = (Communicator) context;
        else
            throw new ClassCastException();
    }

    @Override
    public void onClick(View view) {
        counter++;
        comm.respond("The Button was clicked " + counter + " times");
    }
}
