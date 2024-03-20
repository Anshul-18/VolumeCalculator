package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapersArrayList;
    Context context;

    public myCustomAdapter (ArrayList<Shape> shapersArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapersArrayList);
        this.shapersArrayList = shapersArrayList;
        this.context = context;
    }

    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImage;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the shape object for current position
        Shape shape = getItem(position);

        //inflating layout
        MyViewHolder myViewHolder;

        if(convertView == null){
            //no view went off-screen, create new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);

            //finding the view
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImage = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);

        }else{
            //view went off-screen, reuse it
            myViewHolder = (MyViewHolder) convertView.getTag();

        }

        //getting the data from the model class(shape)
        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImage.setImageResource(shape.getShapeImage());

        return convertView;
    }
}
