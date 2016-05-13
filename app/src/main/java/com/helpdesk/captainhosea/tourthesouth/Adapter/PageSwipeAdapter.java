package com.helpdesk.captainhosea.tourthesouth.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.helpdesk.captainhosea.tourthesouth.Fragmets.QuizFiveFragment;
import com.helpdesk.captainhosea.tourthesouth.Fragmets.QuizFourFragment;
import com.helpdesk.captainhosea.tourthesouth.Fragmets.QuizOneFragment;
import com.helpdesk.captainhosea.tourthesouth.Fragmets.QuizThreeFragment;
import com.helpdesk.captainhosea.tourthesouth.Fragmets.QuizTwoFragment;

/**
 * Created by Captain Hosea on 2016-05-01.
 */
public class PageSwipeAdapter extends FragmentPagerAdapter {
    public PageSwipeAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new QuizOneFragment();
            case 1:
                return new QuizTwoFragment();
            case 2:
                return new QuizThreeFragment();
            case 3:
                return new QuizFourFragment();
            case 4:
                return new QuizFiveFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}

