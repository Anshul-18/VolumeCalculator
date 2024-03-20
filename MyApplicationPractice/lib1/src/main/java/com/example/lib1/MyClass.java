package com.example.lib1;

import java.util.ArrayList;

public class MyClass {
    public static void tble(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    public static void main(String[] args) {
        System.out.println("hello !!!");
        classEx t1 = new classEx();
        t1.method1();
        classEx2 tt = new classEx2();
        tt.method1();
        tt.method2();


        ArrayList p = new ArrayList<>(); //this is also right way for arraylist we just didn't assigned datatype.
        p.add(1);
        p.add("2344");
        p.add(69);
        p.add("hello");
        for(Object o : p){
            System.out.println("object is "+o);
        }
        //syntax for defining arraylist
        //ArrayList<datatype> a = new ArrayList<>()
        tble(9);


        int d = 4;
       for(int i=d;i>=0;i--){
           for(int j=i;j<=d;j++){
               System.out.print(" ");
           }

           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}