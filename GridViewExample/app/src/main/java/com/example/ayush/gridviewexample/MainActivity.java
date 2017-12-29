package com.example.ayush.gridviewexample;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.gridView);

        grid.setAdapter(new myAdapter(this, new myAdapter.ItemClickListener() {
            @Override
            public void sendItem(country country) {
                Intent intent = new Intent(MainActivity.this, myDialog.class);

                intent.putExtra("countryImage", country.countryImage);
                // intent.putExtra("countryName",temp.countryName);
                startActivity(intent);
            }
        }));

    }
}

class country {
    int countryImage;
    String countryName;

    country(int countryImage, String countryName) {
        this.countryImage = countryImage;
        this.countryName = countryName;
    }
}

class viewHolder {
    ImageView countryImageView;

    viewHolder(View view) {
        countryImageView = view.findViewById(R.id.imageView);
    }
}


class myAdapter extends BaseAdapter {

    ArrayList<country> list;

    Context context;
    private ItemClickListener onClickListener;

    myAdapter(Context context, ItemClickListener onClickListener) {

        this.context = context;
        this.onClickListener = onClickListener;
        list = new ArrayList<country>();

        Resources res = context.getResources();
        String[] tempCountryNames = res.getStringArray(R.array.countryName);

        int[] countryImages = {R.drawable.argentina, R.drawable.australia, R.drawable.bangladesh, R.drawable.brazil, R.drawable.canada,
                R.drawable.colombia, R.drawable.finland, R.drawable.france, R.drawable.india, R.drawable.ireland, R.drawable.japan,
                R.drawable.korea_south, R.drawable.malaysia, R.drawable.mexico, R.drawable.nepal, R.drawable.pakistan,
                R.drawable.philippines, R.drawable.sri_lanka, R.drawable.uk, R.drawable.usa};

        for (int i = 0; i < 20; i++) {
            country c = new country(countryImages[i], tempCountryNames[i]);

            list.add(c);
        }


    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View item = view;
        viewHolder holder = null;

        if (item == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item = inflater.inflate(R.layout.single_item, viewGroup, false);

            holder = new viewHolder(item);
            item.setTag(holder);
        } else {
            holder = (viewHolder) item.getTag();
        }

        final country countryTemp = list.get(i);
        holder.countryImageView.setImageResource(countryTemp.countryImage);
        holder.countryImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.sendItem(countryTemp);
            }
        });

        return item;
    }

    public interface ItemClickListener {
        void sendItem(country country);
    }
}