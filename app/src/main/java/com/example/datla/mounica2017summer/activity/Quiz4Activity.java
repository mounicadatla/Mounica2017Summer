package com.example.datla.mounica2017summer.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.adapter.BaseViewPagerAdapter;
import com.example.datla.mounica2017summer.fragment.BlueFragment;
import com.example.datla.mounica2017summer.fragment.GreenFragment;
import com.example.datla.mounica2017summer.fragment.RedFragment;
import com.example.datla.mounica2017summer.viewPagerActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Quiz4Activity extends BaseActivity  {

    @BindView(R.id.activity_quiz4_advance)
    ListView lv;
    private ViewPager viewPager;
    private ArrayList<Fragment> list1 = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I am fine, thank you!");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
    //    list1.add(new RedFragment());
  //      list1.add(new GreenFragment());
//        list1.add(new BlueFragment());

//        AdvanceListViewAdapter adapter1 = new AdvanceListViewAdapter(this, list1);
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
  //      lv.setAdapter(adapter1);
        lv.setAdapter(adapter);

//        viewPagerActivity vp=   new viewPagerActivity();
//        View headerView = getLayoutInflater().inflate(R.layout.activity_view_pager , null , false);

  //      lv.addHeaderView(headerView);

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

//        lv.addHeaderView(vp);
//        viewPager = (ViewPager) findViewById(R.id.activity_view_pager);
//        View header = inflater.inflate(R.layout.activity_view_pager, null, false);
//        viewPager.inflate(getBaseContext(),R.layout.activity_view_pager,lv);
//        lv.addHeaderView(viewPager);

  //      getListView().addHeaderView(header, null, true);
//        list1.add(new RedFragment());
//        list1.add(new GreenFragment());
  //      list1.add(new BlueFragment());

        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                showToast(String.valueOf(position));
            }
        });
    }
}

