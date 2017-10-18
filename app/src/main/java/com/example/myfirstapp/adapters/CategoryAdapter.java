package com.example.myfirstapp.adapters;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myfirstapp.fragments.AllMangaFragment;
import com.example.myfirstapp.fragments.NewMangaFragment;
import com.example.myfirstapp.fragments.RecentMangaFragment;

/**
 * Created by nhi on 2017-10-13.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"All", "New", "Recent"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new AllMangaFragment();
        } else if (position == 1){
            return new NewMangaFragment();
        } else if (position == 2) {
            return new RecentMangaFragment();
        } else {
            return new AllMangaFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
