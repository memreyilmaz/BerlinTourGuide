package com.example.android.berlintourguide;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager am = getBaseContext().getApplicationContext().getAssets();

       /* Typeface typeface = Typeface.createFromAsset(am,
                String.format(Locale.US, "fonts/%s", "berlin.bold.ttf"));

        setTypeface(typeface);*/

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText(getResources().getText(R.string.category_sights));
        tabLayout.getTabAt(1).setText(getResources().getText(R.string.category_museums));
        tabLayout.getTabAt(2).setText(getResources().getText(R.string.category_activities));
        tabLayout.getTabAt(3).setText(getResources().getText(R.string.category_restaurants));


    }
}