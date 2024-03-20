package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//NOTE : handling multiple clicks (buttons).
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //NOTE: we first implemented view.onClickListener
    Button redBtn, greenBtn, blackBtn, yellowBtn, purpleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.redBtn);
        greenBtn = findViewById(R.id.greenBtn);
        blackBtn = findViewById(R.id.blackbtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        purpleBtn = findViewById(R.id.purpleBtn);


        redBtn.setOnClickListener(this);
        //here this refers to view onClickListener interface. it will override to onClick method below.
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        //find the button by id and play the correct sound.

        int clickedBtnId = view.getId();
        if(clickedBtnId == R.id.redBtn){
            playSounds(R.raw.red);
        }
        else if(clickedBtnId == R.id.blackbtn){
            playSounds(R.raw.black);
        }
        else if(clickedBtnId == R.id.greenBtn){
            playSounds(R.raw.green);
        }
        else if(clickedBtnId == R.id.purpleBtn){
            playSounds(R.raw.purple);
        }else{
            playSounds(R.raw.yellow);
        }
    }

    public void playSounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), id);
        mediaPlayer.start();
    }
}