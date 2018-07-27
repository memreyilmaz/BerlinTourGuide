package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText(getResources().getText(R.string.category_sights));
        tabLayout.getTabAt(1).setText(getResources().getText(R.string.category_museums));
        tabLayout.getTabAt(2).setText(getResources().getText(R.string.category_activities));
        tabLayout.getTabAt(3).setText(getResources().getText(R.string.category_restaurants));
    }
}