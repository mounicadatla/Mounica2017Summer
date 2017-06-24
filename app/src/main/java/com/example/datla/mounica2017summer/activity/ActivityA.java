package com.example.datla.mounica2017summer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.audio.BaseBean;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.Button_A)
    public void clickA(View v){
        goToActivity(ActivityA.class);
    }

    @OnClick(R.id.Button_B)
    public void clickB(View v){
        goToActivity(ActivityB.class);
    }

    @OnClick(R.id.Button_C)
    public void clickC(View v){
        goToActivity(ActivityC.class);

    }

    @OnClick(R.id.Button_D)
    public void clickD(View v){
        goToActivity(ActivityD.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        Intent intent=getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        String bs = bundle.getString("StringBundle");
        int bi= bundle.getInt("IntegerBundle",0);
        BaseBean bean= (BaseBean) bundle.getSerializable("Object");
        shortToast(bean.getName());
        shortToast(bs);

        //shortToast("Integer");
        //String s =intent.getStringExtra("StringInfo");
        //showToast("OnCreate");
        //int i= intent.getIntExtra("IntegerInfo", 0);
        //shortToast(s);

        //shortToast(String.valueOf(i));
        //shortToast(String.valueOf(i));
        //shortToast("Integer is:"+i);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showToast("OnNewIntent");
    }

}
