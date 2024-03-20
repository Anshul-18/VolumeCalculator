package com.example.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize UI elements and variables here
        Toast.makeText(this, "onCreate() is called.", Toast.LENGTH_SHORT).show();

        //explicit intent
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSecnodActivity();
            }
        });

        //Implicit intents
        Button btn2 = findViewById(R.id.openBrowser);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage();
                Toast.makeText(MainActivity.this, "Opening youtube.com", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() is called.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() is called.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() is called.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Release resources, save data, etc...
        Toast.makeText(this, "onStop() is called.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() is called.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //last chance t0 clean up resources, finalize tasks, etc...
        Toast.makeText(this, "onDestroy() is called.", Toast.LENGTH_SHORT).show();
    }

    //NOTE:Intents facilitates communication between different components of an app or different apps.
    //Intents are used to request an action to be perform either within same or another app,
    /*
        types of intents:
        1.Explicit intents
        2.Implicit intents
    * */



    public void gotoSecnodActivity() {
        Intent intent = new Intent(this, SecondActivity.class);//the first one is current_location and second one is destination.
        startActivity(intent);

    }

    //implicit intents.
    //lets open a webpage using device's web browser.
    public void openWebPage() {
        Uri webpage = Uri.parse("https://www.youtube.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    //Manifest file acts as blueprint for android system to understand and interact with your app.
}