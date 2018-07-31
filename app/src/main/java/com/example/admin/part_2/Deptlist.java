package com.example.admin.part_2;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import net.skoumal.fragmentback.BackFragmentAppCompatActivity;

public class Deptlist extends BackFragmentAppCompatActivity {

    private Sectionpageradapter sectionpageradapter;
    private ViewPager viewPager;
    public int j;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deptlist);
        sectionpageradapter = new Sectionpageradapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("Timetable");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void setupViewPager(ViewPager viewpager){
        Sectionpageradapter adapter = new Sectionpageradapter(getSupportFragmentManager());
        adapter.addFragment(new tab7(),"F.E");
        adapter.addFragment(new tab1(),"I.T");
        adapter.addFragment(new tab2(),"COMPS");
        adapter.addFragment(new tab3(),"E.X.T.C");
        adapter.addFragment(new tab4(),"INSTRU");
        adapter.addFragment(new tab5(),"CIVIL");
        adapter.addFragment(new tab6(),"MECH");
        viewpager.setAdapter(adapter);
    }

    @Override
    public boolean onNavigateUp() {
        finish();
        return true;
    }
}