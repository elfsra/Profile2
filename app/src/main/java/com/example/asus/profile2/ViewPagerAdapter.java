package com.example.asus.profile2;

/**
 * Created by asus on 03.09.2017.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return new arkadaslar();
            case 1 :
                return new arama();
            case 2 :
                return new neredeyim();


        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}