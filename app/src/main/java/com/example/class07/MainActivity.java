package com.example.class07;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabpageAdapter tabpageAdapter;

    private int[] tabIcons = {
            R.drawable.home,
            R.drawable.group,
            R.drawable.inbox,
            R.drawable.transaction,
            R.drawable.contact,
            R.drawable.notification,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewpagerId);
        tabpageAdapter = new TabpageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabpageAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(Color.parseColor("#000000"),
                Color.parseColor("#FFFFFF"));

        tabLayout.setupWithViewPager(viewPager);




        setupTabIcons();

tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tab.getIcon().setTint(getResources().getColor(R.color.white,getTheme()));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        tab.getIcon().setTint(getResources().getColor(R.color.black,getTheme()));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        tab.getIcon().setTint(getResources().getColor(R.color.white,getTheme()));

    }
});

    }

    private void setupTabIcons() {

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);

    }
}
