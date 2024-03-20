package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prisms extends AppCompatActivity {

    EditText base, height;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisms);

        base = findViewById(R.id.edittext_prism1);
        height = findViewById(R.id.edittext_prism2);
        result = findViewById(R.id.textView5);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bs = base.getText().toString();
                String ht = height.getText().toString();

                float b = Float.parseFloat(bs);
                float h = Float.parseFloat(ht);

                double vol = b*h;
                result.setText("V = "+vol+"m^3");

            }
        });
    }
}