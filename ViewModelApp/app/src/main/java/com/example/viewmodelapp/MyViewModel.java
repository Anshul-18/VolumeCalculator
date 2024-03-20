package com.example.viewmodelapp;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
//    int ct = 0;

    //LiveData
    private MutableLiveData<Integer> ct = new MutableLiveData<>();//it is design to observe data changes.

    public void incCtr(View view){
//        ct++;
        int currVal = ct.getValue() != null ? ct.getValue() : 0;
        //increment
        ct.setValue(currVal+1);
    }

    public LiveData<Integer> getCt() {
        return ct;
    }
}
