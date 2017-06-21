package com.example.datla.mounica2017summer.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.adapter.ViewFragmentStateAdapter;
import com.example.datla.mounica2017summer.fragment.BlueFragment;
import com.example.datla.mounica2017summer.fragment.GreenFragment;
import com.example.datla.mounica2017summer.fragment.RedFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

//import android.util.Pair;

public class AdvanceViewPagerActivity extends AppCompatActivity {

    private  ArrayList<Pair<String,Fragment>> list= new ArrayList<Pair<String, Fragment>>();

@BindView(R.id.activity_advance_view_pager_tablayout)
TabLayout tabLayout;

    @BindView(R.id.activity_advance_view_pager)
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_view_pager);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle","onCreateAdvance");
        Toast.makeText(this,"onCreate for advance",Toast.LENGTH_SHORT).show();
    //    viewPager = (ViewPager) findViewById(R.id.activity_view_pager);

        ButterKnife.bind(this);


        list.add(new Pair<String, Fragment>("Red", new RedFragment()));
        list.add(new Pair<String, Fragment>("Green", new GreenFragment()));
        list.add(new Pair<String, Fragment>("Blue", new BlueFragment()));

        ViewFragmentStateAdapter adapter =
                new ViewFragmentStateAdapter(this.getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}

