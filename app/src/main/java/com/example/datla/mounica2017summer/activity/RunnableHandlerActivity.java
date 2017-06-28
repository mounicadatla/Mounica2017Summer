package com.example.datla.mounica2017summer.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RunnableHandlerActivity extends BaseActivity {


    @BindView(R.id.activity_handler_runnable_et)
    EditText editText;

    @BindView(R.id.activity_handler_runnable_bt)
    Button button;
    Handler handler = new Handler();
    private int time = 0;

    Runnable runnable = new Runnable() {
        @Override
        public void run () {
            time--;
            if (time >= 0) {
                editText.setText(String.valueOf(time));
//
//                handler.post(runnable);
  //delay time
                handler.postDelayed(runnable, 1000);
            }
        }
    };
    private View.OnClickListener startListener;
    private View.OnClickListener stopListener;
    private View.OnClickListener resetListener;
    private Thread thread;
    private final int TIMER = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runnable_handler);
        ButterKnife.bind(this);


        startListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Stop");
                editText.setEnabled(false); // When timer start user cannot change text
                button.setOnClickListener(stopListener);
                time = Integer.valueOf(editText.getText().toString());
                handler.postDelayed(runnable, 1000); // Delayed time is 1 second
            }
        };

        stopListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Reset");
                button.setOnClickListener(resetListener);
//                thread.destroy();
                handler.removeCallbacks(runnable);

            }
        };

        resetListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Start");
                editText.setEnabled(true);
                button.setOnClickListener(startListener);
            }
        };
        button.setOnClickListener(startListener);

//        startThread();

    }



}
