package com.example.nguyenvanthedinh.Tab_Layout_Fragment_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class Tab_layout_ViewPagerAdapter extends FragmentStatePagerAdapter {

    public Tab_layout_ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return  new BlankFragment_1();
            case 1:
                return  new BlankFragment_2();
            case 2:
                return  new BlankFragment_3();
            default:
                return  new  BlankFragment_1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Tổng quan";
            case 1:
                return"Sở thích";
            case 2:
                return "Kỹ năng";
            default:
                return "Tổng quan";
        }
    }
}
