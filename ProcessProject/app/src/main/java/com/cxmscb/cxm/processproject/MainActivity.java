package com.cxmscb.cxm.processproject;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.startService(new Intent(this,FirstService.class));
        this.startService(new Intent(this,SecondService.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }
}
