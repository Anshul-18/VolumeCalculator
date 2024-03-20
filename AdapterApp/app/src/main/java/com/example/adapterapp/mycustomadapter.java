package com.example.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class mycustomadapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public mycustomadapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;//returns no. of items in the data source.
    }

    @Override
    public Object getItem(int i) {
        return items[i];//returns data at given position.
    }

    @Override
    public long getItemId(int i) {
        return i;//returns a unique identifier for a item at given position.
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        //first we have to create a static instance of viewHolder class.
        ViewHolder holder;

        if(view == null) {
            //view : recycled view that you can reuse to improve the performance of your list.

            view = LayoutInflater.from(context).inflate(R.layout.activity_mycustomadapter, parent, false);
            holder = new ViewHolder();
            holder.textView = view.findViewById(R.id.text1);
            view.setTag(holder);

        }else{
            //reusing view that's recycled.
            holder = (ViewHolder) view.getTag();
            //getTag() method is used to retrieve a previously viewHolder object.
            //the viewHolder pattern is used to optimize the view recycling and improve performance of the
            // list based UI components.


        }


        return view;//Displays data at a position in the dataset.
    }

    //this static class holds references to the views within item layout purpose of this class is to store these references
    //once views are found by findViewById so they can be reused.
    static class ViewHolder{
        //holds the references to the views within an item layout.
        TextView textView;
    }
}