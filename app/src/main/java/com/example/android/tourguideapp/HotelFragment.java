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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);
        populateHotelList();
        return view;
    }

    private void populateHotelList() {
        ArrayList<placesModel> placesModels = placesModel.getHotelList();
        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), placesModels);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);

    }

}
