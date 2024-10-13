package com.example.nguyenvanthedinh;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return  new Fragment_1();
            case 1:
                return  new Fragment_2();
            case 2:
                return  new Fragment_3();
            default:
                return  new Fragment_1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
