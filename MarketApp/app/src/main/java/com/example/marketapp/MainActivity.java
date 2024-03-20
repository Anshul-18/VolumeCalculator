package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

//RECYCLER VIEW
public class MainActivity extends AppCompatActivity {

    //adapter view
    RecyclerView recyclerView;

    //data source.
    List<Item> itemList;

    //adapter
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();

        itemList.clear();

        itemList.add(new Item(R.drawable.fruit, "Fruits", "Fresh fruits from garden"));
        itemList.add(new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables"));
        itemList.add(new Item(R.drawable.bread, "Bakery", "Bread, Wheat and Beans"));
        itemList.add(new Item(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt"));
        itemList.add(new Item(R.drawable.popcorn, "Snacks", "Pop corn, donut and Drinks"));
        itemList.add(new Item(R.drawable.beverage, "Beverage", "Juice, Tea and soda"));
        itemList.add(new Item(R.drawable.beverage, "Beverage", "Juice, Tea and soda"));



        //linear layout manager for recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

       myAdapter = new MyAdapter(itemList);
       recyclerView.setAdapter(myAdapter);


    }
}