package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

    public static final String KEY_IMAGE = "KEE_IMAGE";
    public static final String KEY_PLACE_NAME = "KEY_PLACE_NAME";
    public static final String KEY_PLACE_ADDRESS = "KEY_PLACE_ADDRESS";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);
        populateHotelList();
        return view;
    }

    private void populateHotelList() {
        final ArrayList<placesModel> placesModels = placesModel.getHotelList();
        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), placesModels);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                placesModel words = placesModels.get(position);

                Bundle bundle = new Bundle();
                bundle.putString(KEY_PLACE_NAME, words.getmPlaceName());
                bundle.getString(KEY_PLACE_ADDRESS, words.getmPlaceAddress());
                bundle.putInt(KEY_IMAGE, words.getmImageRecourse());

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
