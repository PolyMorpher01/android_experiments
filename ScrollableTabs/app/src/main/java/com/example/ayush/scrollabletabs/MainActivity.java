package com.example.ayush.scrollabletabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);

        FragmentManager fragmentManager = getSupportFragmentManager();

        viewPager.setAdapter(new MyAdapter(fragmentManager));

    }
}

class MyAdapter extends FragmentPagerAdapter{



    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        if (position==0) return new FragmentA();
        if (position==1) return new FragmentB();
        if (position==2) return new FragmentC();

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0) return "Tab 1";
        if (position==1) return "Tab 2";
        if (position==2) return "Tab 3";

        return null;
    }
}

