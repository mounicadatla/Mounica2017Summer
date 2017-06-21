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

public class ActivityD extends BaseActivity {

    //@OnClick(R.id.test)
    public void click(View v){
        Toast.makeText(this,"click", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);

    }
}
