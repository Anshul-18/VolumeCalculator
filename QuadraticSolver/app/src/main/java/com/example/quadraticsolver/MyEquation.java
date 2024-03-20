package com.example.quadraticsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticsolver.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable  {
    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    //constructor for binding and {getter & setter for a,b abd c.}
    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solvEq(View view){
        double a = Integer.parseInt(getA());
        double b = Integer.parseInt(getB());
        double c = Integer.parseInt(getC());

        //Discriminant : b^2-4ac.
        double d = b*b - 4*a*c;

        //finding the roots(solutions if exists).
        double x1,x2;
        if(d>0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);

            binding.textView.setText("x1 = "+x1+" "+"x2 = "+x2);
        }
        else if(d<0){
            binding.textView.setText("roots(solution) doesn't exist.");
        }else{
            x1 = -b/(2*a);

            binding.textView.setText("x = "+x1);
        }


    }
}
