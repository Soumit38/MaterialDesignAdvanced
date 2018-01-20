package com.example.soumit.materialdesignadvanced.Slideshow.MaterialSlideshow.Slideshow;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.soumit.materialdesignadvanced.R;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class SlideshowMain extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    SlideshowAdapter adapter;
    CircleIndicator indicator;

    /**
     * timer to run automatic slideshow
     */
    Handler handler;
    Runnable runnable;
    Timer timer;
    //-----------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        indicator = (CircleIndicator) findViewById(R.id.circleindicator_id);

        adapter = new SlideshowAdapter(this);

        viewPager.setAdapter(adapter);

        indicator.setViewPager(viewPager);

        /**
         * timer to run automatic slideshow
         */
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                int i = viewPager.getCurrentItem();
                if(i==adapter.images.length-1){

                    i=0;
                    viewPager.setCurrentItem(i, true);
                }else {

                    i++;
                    viewPager.setCurrentItem(i, true);
                }

            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        },4000, 4000);
        //---------------------------------------


    }
}
