package com.example.intentservice;
import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.Nullable;
public class MyIntentService extends IntentService {

    public static final String TAG = "MyTAg";

    public MyIntentService() {
        super( "MyIntentService" );
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d( TAG, "onHandleIntent: " );
        for (int i = 0; i < 10; i++) {
            Log.d( TAG, "loop: " + i );
            SystemClock.sleep( 1000 );
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d( TAG, "onCreate: " );
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.d( TAG, "onStartCommand: " );
        return super.onStartCommand( intent, flags, startId );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d( TAG, "onDestroy: " );
    }
}