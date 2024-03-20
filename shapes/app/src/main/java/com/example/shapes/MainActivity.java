package com.example.shapes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;

    //spinner - a kind of a dropdown menu
    Spinner spinner;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    Toast.makeText(MainActivity.this, "The checkbox is checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "checkbox isn't checked.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);//here i will do the job to put R.id.rdb1 or 2 for us when we choose a radio button
                Toast.makeText(MainActivity.this, "You selected "+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //view
        spinner = findViewById(R.id.spinner);

        //data source
        String[] data = {"C++", "Java", "Kotlin", "Python"};

        //ArrayAdapter : used to populate the the spinner with items from a string array resource.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, data);//context represent current running state
        //second one is layout which is used for the selected item.
        //third one is the data source or array of data.

        //apply adapter to  the spinner
        spinner.setAdapter(adapter);



        //to go to next page
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotosecnd();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();

        if(itemid == R.id.action_home){
            Toast.makeText(this, "You selected home", Toast.LENGTH_SHORT).show();
        }else if(itemid == R.id.action_search) {
            Toast.makeText(this, "You selected search", Toast.LENGTH_SHORT).show();
        }

        return onOptionsItemSelected(item);
    }

    public void gotosecnd() {
        Intent intnt = new Intent(this, Second.class);
        startActivity(intnt);
    }

}