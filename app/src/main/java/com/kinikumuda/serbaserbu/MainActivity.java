package com.kinikumuda.serbaserbu;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kinikumuda.activities.FormLogin;

public class MainActivity extends AppCompatActivity {

    ViewPager mSlideViewPager;
    LinearLayout mDotLayout;
    Button backbtn, nextbtn, skipbtn;

    TextView[] dots;
    ViewPagarAdapter viewPagarAdapter;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);

        backbtn = findViewById(R.id.backbtn);
        nextbtn = findViewById(R.id.nextbtn);


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getitem(0) > 0){

                    mSlideViewPager.setCurrentItem(getitem(-1),true);
                }
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getitem(0) < 3)
                    mSlideViewPager.setCurrentItem(getitem(1),true);
                else {

                    Intent i = new Intent( MainActivity.this, FormLogin.class);
                    startActivity(i);
                    finish();
                }
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent( MainActivity.this,FormLogin.class);
                startActivity(i);
                finish();
            }
        });



        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.inidicator_layout);

        viewPagarAdapter = new ViewPagarAdapter(this);

        mSlideViewPager.setAdapter(viewPagarAdapter);

        setUpindicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListiner);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setUpindicator(int position) {

        dots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i=0 ; i < dots.length ; i++){

            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(com.google.android.material.R.color.m3_ref_palette_black, getApplicationContext().getTheme()));
            mDotLayout.addView(dots[i]);
        }

        dots[position].setTextColor(getResources().getColor(R.color.Hijau_Primary, getApplicationContext().getTheme()));
    }

    ViewPager.OnPageChangeListener viewListiner = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);

            if (position > 0) {

                backbtn.setVisibility(View.VISIBLE);

            }else {

                backbtn.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getitem(int i){

        return mSlideViewPager.getCurrentItem() + i;
    }

}