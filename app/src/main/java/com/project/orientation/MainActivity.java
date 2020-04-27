package com.project.orientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","OnCreate");
        TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ActivityNext.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity","OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","OnDestroy");

        Log.e("MainActivity","*************************************");
    }


}
