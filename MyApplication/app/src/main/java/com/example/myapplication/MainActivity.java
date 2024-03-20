package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button3);
        textView = findViewById(R.id.textView5);
        edittext = findViewById(R.id.editTextT);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked listener worked", Toast.LENGTH_SHORT).show();
                String s = edittext.getText().toString();
                double kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("value in pound = " + pound);
            }
        });
    }
/*
    OR YOU CAN WRITE THE SET ON CLICK CODE LIKE THIS
    BUT BEFORE RUNNING JUST GO IN activity_main.xml and write in Button android:onClick="calculate"
//    public void calculate(View view) {
       Toast.makeText(MainActivity.this, "Clicked listener worked", Toast.LENGTH_SHORT).show();
        String s = edittext.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("value in pound = " + pound);
    }
*/
}