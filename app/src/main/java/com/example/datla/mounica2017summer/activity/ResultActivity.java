package com.example.datla.mounica2017summer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.datla.mounica2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.data;

public class ResultActivity extends AppCompatActivity {
   private  final  int ACTIVITY1=123;
    private final int ACTIVITY2=321;

    @OnClick(R.id.activity_result_bt1)
    public void toResult(View view) {
        Intent intent = new Intent(this, ResultActivity1.class);
        startActivityForResult(intent, ACTIVITY1);
    }

    @OnClick(R.id.activity_result_bt2)
    public void toResult(View view) {
        Intent intent = new Intent(this, ResultActivity2.class);
        startActivityForResult(intent, ACTIVITY2);

    }
    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);
            ButterKnife.bind(this);
        }
        @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);

            String s= data.getStringExtra("Data");

            switch (requestCode){
                case ACTIVITY1:
                    showToast("FromResultActivity1");
            }

        }

    }
}