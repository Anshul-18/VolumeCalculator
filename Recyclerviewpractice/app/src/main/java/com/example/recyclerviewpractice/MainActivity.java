package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "dwfowefj", 98435498);
    Contact o2 = new Contact(2, "dwfodlffj", 98435498);
    Contact o3 = new Contact(3, "dlksdgf", 98435498);
    Contact o4 = new Contact(4, "dvkdjfgf", 98435498);
    Contact o5 = new Contact(5, "ifooejfwe", 98435498);
    Contact o6 = new Contact(6, "dbgejrei", 98435498);
    Contact o7 = new Contact(7, "hggeeg", 98435498);
    Contact o8 = new Contact(8, "mvcodopc", 98435498);
    Contact o9 = new Contact(9, "afcxas", 98435498);

    Contact[] contacts = {o1, o2, o3, o3, o4, o5, o5, o6, o7, o7, o8, o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
    }
}