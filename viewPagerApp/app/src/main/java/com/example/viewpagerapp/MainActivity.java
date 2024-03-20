package com.example.viewpagerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    MyViewPagerAdapter myAdapter;

    TableLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        myAdapter =new MyViewPagerAdapter(getSupportFragmentManager(), getLifecycle());

        //adding fragments to the list in the adapter class
        myAdapter.addFragment(new Fragment1());
        myAdapter.addFragment(new Fragment2());
        myAdapter.addFragment(new Fragment3());

        //set the orientation in viewPager2
        viewPager = findViewById(R.id.viewPager2);
        viewPager.setOrientation(viewPager.ORIENTATION_HORIZONTAL);

        //connecting adapter with viewpager2
        viewPager.setAdapter(myAdapter);

        //connecting tablayout with viewpager
        new TabLayoutMediator(
                new TabLayout(tabLayout.getContext()),
                viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Fragment"+(position+1));
            }
        }).attach();

    }
}