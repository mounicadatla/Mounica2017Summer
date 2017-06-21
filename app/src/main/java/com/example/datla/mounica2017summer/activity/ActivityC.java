package com.example.datla.mounica2017summer.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;

import butterknife.ButterKnife;

public class ActivityC extends BaseActivity {

    //@OnClick(R.id.test)
    public void click(View v){
        Toast.makeText(this,"click", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);

    }
}