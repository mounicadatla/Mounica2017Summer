package com.example.datla.mounica2017summer.activity;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.datla.mounica2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WorkRadioActivity extends AppCompatActivity {


    private  int checkedID;
    @BindView(R.id.activity_work_radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_work_radio_submit_button)
    public void submit(View view){
//        shortToast("You choose Radio Button");
        Toast.makeText(this, "You choose Radio Button"+checkedID, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_radio);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                checkedID=checkedId;
            }

        });
    }
    }

