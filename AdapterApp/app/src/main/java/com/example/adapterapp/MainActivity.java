package com.example.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //example of adapterView
        listView = findViewById(R.id.listView);

        //data source
        String[] ctrs = {"India", "Russia", "Japan", "USA", "UK", "Germany", "France", "Italy"};

        //Adapter : acts as a bridge between data source and adapter view.
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ctrs);

        //for custom adapter
        mycustomadapter adapter = new mycustomadapter(this, ctrs);
        //link listview with adapter
        listView.setAdapter(adapter);

    }
}