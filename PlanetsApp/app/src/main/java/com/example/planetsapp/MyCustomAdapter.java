package com.example.planetsapp;

import android.content.Context;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {

    //using custom layouts -> MyCustomAdapter
    //using custom objects -> extends ArrayAdapter<Planet>

//    NOTE : whenever you have a model class

    private ArrayList<Planet> planetsArrayList;
    Context context;//provides access to various app specific resources,system level services and info about app environment.

    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }

    //view holder class : used to cache references to the views within
                        //an item layout , so that they do not need to be
    //                    repeatedly looked up during scrolling.

    public static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
    }

    //getView() : used to create and return a view for a specific item in the list.
//we are extending array adapter, you need to override getView.


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get planet object for current position.
        Planet planet = getItem(position);

        //Inflate layout
        MyViewHolder myViewHolder;
        final View result;

        if(convertView == null){
            myViewHolder =  new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            //finding views.
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moonCount);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;

            //setTag() method is used to attach an arbitrary object to the view object.
            convertView.setTag(myViewHolder);

        }
        else{
            //view is recycled, now we are reusing it
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        //getting data from the model class (Planet)
        myViewHolder.planetName.setText(planet.getPlanetName());
        myViewHolder.moonCount.setText(planet.getMoonCount());
        myViewHolder.planetImg.setImageResource(planet.getPlanetImage());

        return result;

    }
}
