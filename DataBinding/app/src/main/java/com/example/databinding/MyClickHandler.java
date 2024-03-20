package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {

    Context context;

    public  MyClickHandler(Context context){
        this.context = context;
    }

    public void onButton1Clicked(View view){
        Toast.makeText(context, "1st btn is clicked", Toast.LENGTH_SHORT).show();
    }
}
