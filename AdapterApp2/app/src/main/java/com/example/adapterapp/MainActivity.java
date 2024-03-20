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

        //adapterview : listview
        listView = findViewById(R.id.listView);

        //data source
        String[] ctrs = {"India", "Russia", "Japan", "Italy", "USA"};

        //adapter: acts as a bridge btwn datasource and adapterview.
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ctrs);

        //for custom adapter
        MyCustomAdapter adapter = new MyCustomAdapter(this, ctrs);

        //link listview to adapter
        listView.setAdapter(adapter);

    }
}