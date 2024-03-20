package com.example.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            // if view doesn't exist then create it
            //convert view : recycled view that you can reuse to improve the
            //                  perforemance of your list.

            view = LayoutInflater.from(context).inflate(R.layout.my_list_item, viewGroup, false);
            holder = new ViewHolder();
            holder.textView = view.findViewById(R.id.text1);
            view.setTag(holder);


        }else{
            //if view alreay exists then recycle it.
            //reusing the view.
            holder = (ViewHolder) view.getTag();
        }

        //set the data to view
        holder.textView.setText(items[i]);

        return view;
    }

    static class ViewHolder{
        TextView textView;

    }
}
