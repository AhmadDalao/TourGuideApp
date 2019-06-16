package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class myPlacesArrayAdapter extends ArrayAdapter<placesModel> {


    public myPlacesArrayAdapter(Context context, ArrayList<placesModel> placesModels) {
        super(context, 0, placesModels);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(this.getContext()).inflate(R.layout.custom_list_word_layout, parent, false);

        }

        placesModel places = getItem(position);

        TextView placeName = (TextView) listItem.findViewById(R.id.name_of_place);
        placeName.setText(places.getmPlaceName());


        TextView placeAddress = (TextView) listItem.findViewById(R.id.address);
        placeAddress.setText(places.getmPlaceAddress());


        ImageView image_place = (ImageView) listItem.findViewById(R.id.imageView);
        if (places.hasImage()) {
            image_place.setVisibility(View.VISIBLE);
            image_place.setImageResource(places.getmImageRecourse());
        } else {
            image_place.setVisibility(View.GONE);
        }


        return listItem;
    }
}
