package com.example.nguyenvanthedinh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nguyenvanthedinh.Tab_Layout_Fragment_1.Tab_layout_ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Fragment_1 extends Fragment {
    private TabLayout tablayout;
    private ViewPager viewPager;
    View mView;
    public Fragment_1() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView=  inflater.inflate(R.layout.fragment_1, container, false);
        tablayout = mView.findViewById(R.id.tab_layout);
        viewPager = mView.findViewById(R.id.viewpager1);

        Tab_layout_ViewPagerAdapter adapter = new Tab_layout_ViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        return mView;
    }

}