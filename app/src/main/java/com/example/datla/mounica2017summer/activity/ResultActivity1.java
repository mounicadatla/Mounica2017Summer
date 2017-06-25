package com.example.datla.mounica2017summer.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import com.example.datla.mounica2017summer.R;

import com.example.datla.mounica2017summer.activity.Activity;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }
    @Override
    public void onBackPressed(){

        Intent intent =new Intent();
        intent.putExtra("Data","Data");
        setResult(RESULT_OK, intent);

        super.onBackPressed();

    }
}
