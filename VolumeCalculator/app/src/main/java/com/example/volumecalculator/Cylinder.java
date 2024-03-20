package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinder_radius, cylinder_height;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinder_radius = findViewById(R.id.edittext_cylinder1);
        cylinder_height = findViewById(R.id.edittext_cylinder2);
        result = findViewById(R.id.textView4);

        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();

                float r = Float.parseFloat(radius);
                float h = Float.parseFloat(height);

                double vol = 3.14159 * (r*r) * h;
                result.setText("V = "+vol+"m^3");

            }
        });


    }
}