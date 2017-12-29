package com.example.ayush.listviewimagetwo;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] memeTitles;
    String [] memeDescriptions;
    int [] images = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12,R.drawable.meme13,R.drawable.meme14,R.drawable.meme15,R.drawable.meme16,R.drawable.meme17,R.drawable.meme18,R.drawable.meme19,R.drawable.meme20};

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= findViewById(R.id.listView1);

        Resources res = getResources();

        memeTitles = res.getStringArray(R.array.titles);
        memeDescriptions = res.getStringArray(R.array.descriptions);

        myCustomAdapter adapter = new myCustomAdapter(this,memeTitles,images,memeDescriptions);
        list.setAdapter(adapter);
    }


}


class myCustomAdapter extends ArrayAdapter<String>
{
    Context context;
    int images[];
    String title[];
    String discription[];

    myCustomAdapter(Context c,String[] titles,int imgs[],String desc[]){
        super(c,R.layout.single_row,R.id.textView1,titles);
        this.context = c;
        this.images = imgs;
        this.title = titles;
        this.discription = desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if(row==null){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.single_row,parent,false);
        }

        ImageView myImage = row.findViewById(R.id.imageView);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myDescription = row.findViewById(R.id.textView2);

        myImage.setImageResource(images[position]);
        myTitle.setText(title[position]);
        myDescription.setText(discription[position]);

        return row;
    }
}