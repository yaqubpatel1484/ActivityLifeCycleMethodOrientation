package com.project.orientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityNext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Log.e("ActivityNext","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ActivityNext","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ActivityNext","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ActivityNext","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ActivityNext","OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ActivityNext","OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ActivityNext","OnDestroy");

        Log.e("ActivityNext","*************************************");
    }
}
