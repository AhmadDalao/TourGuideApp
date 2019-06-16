package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewpager(viewPager);
        }


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewpager(ViewPager viewPager) {
        myViewpagerAdapter adapter = new myViewpagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "one");
        adapter.addFragment(new secondFragment(), "two ");
        adapter.addFragment(new thirdFragment(), "three");
        adapter.addFragment(new forthFragment(), "forth");
        viewPager.setAdapter(adapter);
    }


}
