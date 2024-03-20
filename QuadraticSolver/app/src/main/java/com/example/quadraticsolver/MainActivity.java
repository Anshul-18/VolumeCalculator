package com.example.quadraticsolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.quadraticsolver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DATA BINDING.
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MyEquation eq = new MyEquation(mainBinding);
        mainBinding.setMyequation(eq);



    }
}