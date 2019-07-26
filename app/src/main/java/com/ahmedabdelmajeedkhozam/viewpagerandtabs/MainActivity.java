package com.ahmedabdelmajeedkhozam.viewpagerandtabs;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager ViewPager;
Fragment [] fragments={new F1(),new F2(),new F3()};
String titles [] ={"tab1","tab2","tab3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager=findViewById(R.id.viewPager);
        TabLayout tabLayout=findViewById(R.id.tabs);
        MyPagerAdapter adapter =new MyPagerAdapter(getSupportFragmentManager());
        ViewPager.setAdapter(adapter);



    }








    public class MyPagerAdapter extends FragmentPagerAdapter{

         public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragments[i];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

}
