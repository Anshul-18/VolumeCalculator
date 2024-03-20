package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable//used to mark the username
    //NOTE: YOU HAVE TO PUT BINDABLE BEFORE GETNAME NOT SETNAME.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
        //binding resources : its generated class by databinding library.
        //contains int values associated with each of the binding properties of your dataset.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
