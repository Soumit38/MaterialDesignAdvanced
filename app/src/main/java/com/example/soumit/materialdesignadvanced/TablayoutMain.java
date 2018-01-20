package com.example.soumit.materialdesignadvanced;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Soumit on 1/20/2018.
 */

public class TablayoutMain extends AppCompatActivity{

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOneFragment(), "Item One");
        adapter.addFragment(new TabTwoFragment(), "Item Two");
        adapter.addFragment(new TabThreeFragment(), "Item Three");
        /**
         * extra elements for scrollable slideshow
         */
        adapter.addFragment(new TabFourFragment(), "Item Four");
        adapter.addFragment(new TabFiveFragment(), "Item Five");
        adapter.addFragment(new TabSixFragment(), "Item Six");
        adapter.addFragment(new TabSevenFragment(), "Item Seven");
        adapter.addFragment(new TabEightFragment(), "Item Eight");
        adapter.addFragment(new TabNineFragment(), "Item Nine");
        adapter.addFragment(new TabTenFragment(), "Item Ten");
        //---------------------------------------------

        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }
}
