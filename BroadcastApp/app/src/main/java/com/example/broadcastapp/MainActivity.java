package com.example.broadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for api above 26..
        //DYNAMIC WAY TO REGISTER BROADCAST
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        AirplanemodeReceiver br = new AirplanemodeReceiver();
        registerReceiver(br, intentFilter);
        //this method is used to dynamically register a broadvast reciever in your app.


    }
}