package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

//USING CARDVIEW IN PLACE OF CONSTRAINT LAYOUT.
public class MainActivity extends AppCompatActivity {

    //adapter view
    private RecyclerView recyclerView;

    //data source
    private List<Sport> sportList;

    //link btwn data source and adapter view
    private MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();

        sportList.add(new Sport("Football", R.drawable.football));
        sportList.add(new Sport("Basketball", R.drawable.basketball));
        sportList.add(new Sport("Volleyball", R.drawable.volley));
        sportList.add(new Sport("Tennis", R.drawable.tennis));
        sportList.add(new Sport("Ping Pong", R.drawable.ping));


        myCustomAdapter = new MyCustomAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);
    }
}