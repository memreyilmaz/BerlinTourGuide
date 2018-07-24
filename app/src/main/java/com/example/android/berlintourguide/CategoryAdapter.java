package com.example.android.berlintourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.berlintourguide.Fragments.ActivitiesFragment;
import com.example.android.berlintourguide.Fragments.MuseumsFragment;
import com.example.android.berlintourguide.Fragments.RestaurantsFragment;
import com.example.android.berlintourguide.Fragments.SightsFragment;

public class CategoryAdapter extends FragmentPagerAdapter{

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new ActivitiesFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
