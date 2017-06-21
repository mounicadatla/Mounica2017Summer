package com.example.datla.mounica2017summer;

/**
 * Created by mounicadatla on 6/14/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Jerry Vu on 6/14/2017.
 */

public class BaseActivity extends AppCompatActivity {



    public void showToast(String s){

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void shortToast(String s){

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void longToast(String s){

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void goToActivity(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);

    }
}