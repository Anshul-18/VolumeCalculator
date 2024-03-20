package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //step1: adapterView : gridView
    GridView gridView;

    //step2: data source: ArrayList<Shape>
    ArrayList<Shape> shapesArrayList;

    //step3: adapter: mycustomadapter
    myCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapesArrayList = new ArrayList<>();

        shapesArrayList.add(new Shape("Sphere", R.drawable.sphere));
        shapesArrayList.add(new Shape("Cylinder", R.drawable.cylinder));
        shapesArrayList.add(new Shape("CUbe", R.drawable.cube));
        shapesArrayList.add(new Shape("Prism", R.drawable.prism));

        adapter = new myCustomAdapter(shapesArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);//either you do this or in activity_main.xml write in gridView: android:numColumns="2".

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intnt = new Intent(getApplicationContext(), Sphere.class);
//                startActivity(intnt);
                Intent intnt;

                if(i == 0){
                    intnt = new Intent(getApplicationContext(), Sphere.class);

                }
                else if(i == 1){
                    intnt = new Intent(getApplicationContext(), Cylinder.class);

                }
                else if(i == 2){
                     intnt = new Intent(getApplicationContext(), Cube.class);

                }
                else if(i == 3){
                     intnt = new Intent(getApplicationContext(), Prisms.class);

                }else {
                    intnt = new Intent(getApplicationContext(), Prisms.class);
                }

                startActivity(intnt);

            }
        });

    }
}