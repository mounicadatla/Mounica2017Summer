package com.example.datla.mounica2017summer.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.activity.AdvanceListViewAdapter;
import com.example.datla.mounica2017summer.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

//import static com.example.datla.mounica2017summer.R.layout.activity_advance_list_view;

//import static com.example.datla.mounica2017summer.R.id.activity_advance_list_view;


public class AdvanceListViewActivity extends BaseActivity {

    @BindView(R.id.activity_advance_list_view)
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
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
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

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