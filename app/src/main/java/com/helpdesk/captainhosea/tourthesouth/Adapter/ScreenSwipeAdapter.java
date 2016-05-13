package com.helpdesk.captainhosea.tourthesouth.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Hosea on 4/29/2016.
 */
public class ScreenSwipeAdapter extends FragmentPagerAdapter {
    public ScreenSwipeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new ImageFragment();
            case 1:
                return new ImageFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 7;
    }
}
