package com.example.datla.mounica2017summer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.Pair;

import java.util.ArrayList;

public class ViewFragmentStateAdapter extends FragmentStatePagerAdapter{
    private final ArrayList<Pair<String , Fragment>> list;
    public ViewFragmentStateAdapter(FragmentManager fm, ArrayList<Pair<String, Fragment>> list){
        super(fm);
        this.list=list;
    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position).second;

    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
