package com.example.datla.mounica2017summer.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.datla.mounica2017summer.R;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        setResult(200, new Intent().putExtra("Data","data"));

    }
}
