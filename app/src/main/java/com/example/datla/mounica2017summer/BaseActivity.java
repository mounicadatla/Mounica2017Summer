package com.example.datla.mounica2017summer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by mounicadatla on 6/14/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showToast(String s){
        Toast.makeText(this,s,  Toast.LENGTH_SHORT).show();

    }

    public static class NotificationActivity extends BaseActivity {

/*
        @OnClick(R.id.activity_notification_small)
        public void smallNotification(View v){
            Toast.makeText(this, "small", Toast.LENGTH_SHORT).show();

        }

        @OnClick(R.id.activity_notification_small)
        public void smallNotification(View v){
            showToast("BigNotification");
        }



        @OnClick(R.id.activity_notification_small)
        public void smallNotification(View v){
            showToast("PicNotification");

        }
*/
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notification);
        }
    }
}
