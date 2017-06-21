package com.example.datla.mounica2017summer.activity;

/**
 * Created by mounicadatla on 6/18/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityD extends BaseActivity {

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
        setContentView(R.layout.activity_d);
        ButterKnife.bind(this);
        showToast("OnCreate");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showToast("OnNewIntent");
    }
}
