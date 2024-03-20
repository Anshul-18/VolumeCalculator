package com.example.scrollapp;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("general", "onCreate: this scroll app is working properly");
        //log.d is used when only developer wants to see the message and
        //Toast is used when we wants user to see the message.
    }
}