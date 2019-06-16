package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);

        populatePlaceList();
        return view;
    }

    private void populatePlaceList() {
        ArrayList<placesModel> placesModels = placesModel.getPlacesList();
        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), placesModels);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);

    }

}
