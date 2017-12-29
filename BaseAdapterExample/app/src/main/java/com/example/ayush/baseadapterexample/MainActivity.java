package com.example.ayush.baseadapterexample;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= findViewById(R.id.listView1);

        list.setAdapter(new myCustomAdapter(this));

    }
}

class singleRow{
    String title;
    String description;
    int image;

    singleRow(String title, String description, int image){
        this.title = title;
        this.description = description;
        this.image = image;
    }
}


class myCustomAdapter extends BaseAdapter{


    ArrayList<singleRow> list;
    Context context;

    myCustomAdapter(Context c){
        context = c;

        list = new ArrayList<singleRow>();
        Resources res  = c.getResources();
        String[] titles = res.getStringArray(R.array.titles);
        String[] descriptions = res.getStringArray(R.array.descriptions);

        int [] images = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12,R.drawable.meme13,R.drawable.meme14,R.drawable.meme15,R.drawable.meme16,R.drawable.meme17,R.drawable.meme18,R.drawable.meme19,R.drawable.meme20};

        for (int i=0;i<10;i++){

           list.add(new singleRow(titles[i],descriptions[i],images[i]));

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

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.single_row,viewGroup,false);

        TextView title = row.findViewById(R.id.textView1);
        TextView description = row.findViewById(R.id.textView2);
        ImageView image = row.findViewById(R.id.imageView);

        singleRow temp = list.get(i);
        title.setText(temp.title);
        description.setText(temp.description);
        image.setImageResource(temp.image);

        return row;
    }
}
