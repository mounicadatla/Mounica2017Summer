package com.example.datla.mounica2017summer.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.datla.mounica2017summer.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SharedPreferenceActivity extends AppCompatActivity {
    @BindView(.id.activity_sharedpreference_email)
    EditText emailEditText;
    @BindView(R.id.activity_sharedpreference_password)
    EditText passwordEditText;

    @OnClick(R.id.activity_sharepreference_login)
    public void
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
    }
}
