package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adapterView : a list view
        listView = findViewById(R.id.listView);

        //data source: ArrayList<Planet>
        planetArrayList = new ArrayList<>();

        planetArrayList.add(new Planet("Earth", "1 Moons", R.drawable.earth));
        planetArrayList.add(new Planet("Mercury", "0 Moons", R.drawable.mercury));
        planetArrayList.add(new Planet("Venus", "0 Moons", R.drawable.venus));
        planetArrayList.add(new Planet("Mars", "2 Moons", R.drawable.mars));
        planetArrayList.add(new Planet("Jupiter", "79 Moons", R.drawable.jupiter));
        planetArrayList.add(new Planet("Saturn", "83 Moons", R.drawable.saturn));
        planetArrayList.add(new Planet("Uranus", "27 Moons", R.drawable.uranus));
        planetArrayList.add(new Planet("Neptune", "14 Moons", R.drawable.neptune));

        //adapter
        adapter = new MyCustomAdapter(planetArrayList, getApplicationContext());
        //getAllicationcontext() method is used obtain global app context.

        listView.setAdapter(adapter);

        //handling click events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Planet Name: "+adapter.getItem(i).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}