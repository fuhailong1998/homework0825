package com.fxkxb.homework20210825;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * @author : Leon (fxkxb.com)
 * @file : MyAdapter.class
 * @date : 2021/8/27 上午11:43
 * @description :
 */
public class MyAdapter extends FragmentPagerAdapter {
    private Fragment[] fragments;

    public MyAdapter(FragmentManager fm, Fragment[] fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}