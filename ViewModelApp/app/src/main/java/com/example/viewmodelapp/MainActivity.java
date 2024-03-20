package com.example.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.viewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//    int ct=0;
    MyViewModel viewModel;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        mainBinding.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ct++;
//                mainBinding.textView2.setText(""+ct);
//            }
//        });

        //NOTE: we are doing this to save data on textView so that when we rotate the screen then also its data should be
        // retained.
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        //NOTE: now we can remove this listener because we have added data & increasecounter in button in activity_main.
//        mainBinding.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                viewModel.incCtr();
//                mainBinding.textView2.setText(""+viewModel.getCt());
//            }
//        });
        //and in place of listener
        //NOTE: here we are linking dataBinding with viewmodel.
        mainBinding.setMyviewmodel(viewModel);

        mainBinding.textView2.setText(""+viewModel.getCt());

        //Observing the live data
        viewModel.getCt().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer counter) {
                        //it ensures that live data always shows latest data without any manual update.
                        //livwData is lifecycle aware.
                        //updates the UI when live data changes.
                        mainBinding.textView2.setText(""+counter);
                    }
                });

    }
}