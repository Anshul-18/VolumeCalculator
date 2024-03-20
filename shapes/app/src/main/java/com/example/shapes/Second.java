package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TimePicker;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    TimePicker timePicker;
    DatePicker datePicker;
    Button button;

    ProgressBar progressBar;
    int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //timepicker
        timePicker = findViewById(R.id.timepicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hr, int min) {
                //handle time change
                Toast.makeText(Second.this, "hour:"+hr+" min:"+min, Toast.LENGTH_LONG).show();
            }
        });


        //date picker
        datePicker = findViewById(R.id.datepicker);
        button = findViewById(R.id.btn);

        //for progressbar
        progressBar = findViewById(R.id.progressbar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day = "day "+datePicker.getDayOfMonth();
                String month = "month "+(datePicker.getMonth()+1);
                String year = "year "+datePicker.getYear();

                Toast.makeText(Second.this, day+"\n"+month+"\n"+year, Toast.LENGTH_SHORT).show();


                progress += 10;
                progressBar.setProgress(progress);

            }
        });




    }
}