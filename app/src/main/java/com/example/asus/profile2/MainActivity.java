package com.example.asus.profile2;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle("App Bar Layout");

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        /*
        Creating Adapter and setting that adapter to the viewPager
        setSupportActionBar method takes the toolbar and sets it as
        the default action bar thus making the toolbar work like a normal
        action bar.
         */
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        /*
        TabLayout.newTab() method creates a tab view, Now a Tab view is not the view
        which is below the tabs, its the tab itself.
         */
        //we also set the Test of the Tabs
        final TabLayout.Tab test01 = tabLayout.newTab();
        final TabLayout.Tab test02 = tabLayout.newTab();
        final TabLayout.Tab test03 = tabLayout.newTab();
        test01.setIcon(R.drawable.twof);
        test02.setIcon(R.drawable.cloud);
        test03.setIcon(R.drawable.placeholder);
        tabLayout.addTab(test01,0);
        tabLayout.addTab(test02,1);
        tabLayout.addTab(test03,2);
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this,R.color.tab_selector));
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this,R.color.colorAccent));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                              @Override
                                              public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                                              }
                                              @Override
                                              public void onPageSelected(int position) {
                                                  switch (position) {
                                                      case 0:
                                                          test01.setIcon(R.drawable.twof);
                                                          test02.setIcon(R.drawable.cloud);
                                                          test03.setIcon(R.drawable.placeholder);
                                                          break;
                                                      case 1:
                                                          test01.setIcon(R.drawable.twof);
                                                          test02.setIcon(R.drawable.cloud);
                                                          test03.setIcon(R.drawable.placeholder);
                                                          break;
                                                      case 2:
                                                          test01.setIcon(R.drawable.twof);
                                                          test02.setIcon(R.drawable.cloud);
                                                          test03.setIcon(R.drawable.placeholder);
                                                          break;
                                                  }
                                              }
                                              @Override
                                              public void onPageScrollStateChanged(int state) {}
                                          }
        );
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override

            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }
}
