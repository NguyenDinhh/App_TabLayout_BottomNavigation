package com.example.nguyenvanthedinh;

import android.os.Bundle;
import android.view.MenuItem;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
         ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
         viewPager.setAdapter(adapter);
         viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
             @Override
             public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

             }

             @Override
             public void onPageSelected(int position) {
                 switch (position)
                 {
                     case 0:
                         bottomNavigationView.getMenu().findItem(R.id.menu_1).setChecked(true);
                         break;
                     case 1:
                         bottomNavigationView.getMenu().findItem(R.id.menu_2).setChecked(true);
                         break;
                     case 2:
                         bottomNavigationView.getMenu().findItem(R.id.menu_3).setChecked(true);
                         break;

                 }
             }

             @Override
             public void onPageScrollStateChanged(int state) {
             }
         });
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.menu_1)
                {
                    viewPager.setCurrentItem(0);
                    return true;
                }
                else  if(item.getItemId() == R.id.menu_2)
                {
                    viewPager.setCurrentItem(1);
                    return true;
                }
                else  if(item.getItemId() == R.id.menu_3)
                {
                    viewPager.setCurrentItem(2);
                    return true;
                }
                else
                    return  false;
            }
        });




    }
}