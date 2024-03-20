package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView welcomeTxt, luckynumTxt;
    Button share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcomeTxt = findViewById(R.id.textView2);
        luckynumTxt = findViewById(R.id.lucky_num_txt);
        share_btn = findViewById(R.id.share_btn);

        //receiving data from mainActivity
        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        //generating random numbers
        int random_num = getRndmNum();
        luckynumTxt.setText(""+random_num);

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName, random_num);
            }
        });
    }

    public int getRndmNum() {
        Random r = new Random();
        int up_limit = 1000;

        int randomgentrd = r.nextInt(up_limit);
        return randomgentrd;
    }

    public void shareData(String userName, int rnum) {
        //Implicit intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        //additional info
        i.putExtra(Intent.EXTRA_SUBJECT, userName + "got lucky today");
        i.putExtra(Intent.EXTRA_SUBJECT, "His luck number is: "+rnum);
        startActivity(Intent.createChooser(i, "choose a platform"));
    }
}