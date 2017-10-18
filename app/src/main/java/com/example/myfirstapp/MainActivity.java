package com.example.myfirstapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.view.MenuItem;
import android.view.View;

import com.example.myfirstapp.adapters.CategoryAdapter;
import com.example.myfirstapp.helpers.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        final CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        final TabLayout homeTabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        homeTabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        homeTabLayout.setupWithViewPager(viewPager);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                homeTabLayout.setVisibility(View.VISIBLE);
                                viewPager.setAdapter(adapter);
                                break;
                            case R.id.action_search:
                                homeTabLayout.setVisibility(View.GONE);
                                viewPager.setAdapter(null);
                                break;
                            case R.id.action_favourite:
                                homeTabLayout.setVisibility(View.GONE);
                                viewPager.setAdapter(null);
                                break;
                            case R.id.action_profile:
                                homeTabLayout.setVisibility(View.GONE);
                                viewPager.setAdapter(null);
                                break;
                        }
                        return true;
                    }
                });
    }

    private void openHome() {

    }
}
