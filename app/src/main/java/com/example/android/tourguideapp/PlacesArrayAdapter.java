package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PlacesArrayAdapter extends ArrayAdapter<PlacesModel> {


    public PlacesArrayAdapter(Context context, ArrayList<PlacesModel> placesModels) {
        super(context, 0, placesModels);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItem = convertView;
        if (listItem == null) {
          //  listItem = LayoutInflater.from(this.getContext()).inflate(R.layout.custom_list_word_layout, parent, false);

        }
        return listItem;

    }
}
