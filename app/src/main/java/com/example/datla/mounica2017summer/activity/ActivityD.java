package com.example.datla.mounica2017summer.activity;

/**
 * Created by mounicadatla on 6/18/17.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);

    }
}
