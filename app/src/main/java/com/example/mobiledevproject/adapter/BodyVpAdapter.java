package com.example.mobiledevproject.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class BodyVpAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;
    public BodyVpAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return (Fragment)fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
