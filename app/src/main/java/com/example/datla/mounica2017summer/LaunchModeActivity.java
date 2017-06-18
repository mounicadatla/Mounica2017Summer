package com.example.datla.mounica2017summer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mounicadatla on 6/17/17.
 */
public class LaunchModeActivity extends AppCompatActivity {


     @OnClick(R.id.test)
     public void click(View v){
        Toast.makeText(this,"click",Toast.LENGTH_SHORT).show();
        }

 private TextView tv; //r.id.text is missing


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }
}


