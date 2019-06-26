package com.example.testscouting2019.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.testscouting2019.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class Match_Sect_Pag_Adapt extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Team, R.string.Auto, R.string.Teleop, R.string.End, R.string.Post};
    private final Context mContext;

    public Match_Sect_Pag_Adapt(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;

        switch(position){
            case 0:
                fragment = new Match_Frag_Team();
                break;
            case 1:
                fragment = new Match_Frag_Auto();
                break;
            case 2:
                fragment = new Match_Frag_Teleop();
                break;
            case 3:
                fragment = new Match_Frag_End();
                break;
            case 4:
                fragment = new Match_Frag_Post();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}