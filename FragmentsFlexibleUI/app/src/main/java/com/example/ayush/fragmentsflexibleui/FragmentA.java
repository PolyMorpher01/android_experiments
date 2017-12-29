package com.example.ayush.fragmentsflexibleui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Ayush on 27/12/2017.
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);

        listView = view.findViewById(R.id.listView1);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.titles, android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicator = (Communicator) context;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        communicator.respond(i);
    }
}


