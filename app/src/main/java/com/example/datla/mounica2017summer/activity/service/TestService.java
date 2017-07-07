
/**

package com.example.datla.mounica2017summer.activity.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mounicadatla on 7/3/17.


public class TestService extends Service {
    private Timer timer;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        String value =intent.getStringExtra("Service");
        timer.schedule( new UdpateTask(), 0, 1000);

        return super. onStartCommand(intent, flags, startId);


    }
    @Nullable
    @Override

    public IBinder onBind(Intent intent){
        return null;
    }

    private class UpdateTask extends TimerTask {
        public void run(){
            Intent intent = new Intent();

        }
    }

}
**/