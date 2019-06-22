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

        final ArrayList<placesModel> placesSpots = new ArrayList<>();
        placesSpots.add(new placesModel(getString(R.string.spot01), getString(R.string.place_type_01), 24.4878472, 39.6481492,
                R.drawable.alharam, getString(R.string.alHaramDetail)));
        placesSpots.add(new placesModel(getString(R.string.spot02), getString(R.string.place_type_02), 24.4619578, 39.5966926, R.drawable.museum, getString(R.string.museumDetail)));
        placesSpots.add(new placesModel(getString(R.string.spot03), getString(R.string.place_type_01), 24.439252, 39.6150999, R.drawable.quba, getString(R.string.masjid_quba_detail)));
        placesSpots.add(new placesModel(getString(R.string.spot04), getString(R.string.place_type_02), 24.5214825, 39.5884737, R.drawable.auhud, getString(R.string.jabel_auhud_detail)));


        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), placesSpots);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                placesModel items = placesSpots.get(position);

                Bundle bundle = new Bundle();
                bundle.putString(myConstants.getKeyPlaceName(), items.getmPlaceName());
                bundle.putString(myConstants.getKeyPlaceAddress(), items.getmPlaceAddress());
                bundle.putInt(myConstants.getKeyImage(), items.getmImageRecourse());
                bundle.putString(myConstants.getKeyPlaceDetail(), items.getmPlaceDetail());
                bundle.putDouble(myConstants.getKeyLatitude(), items.getmLatitude());
                bundle.putDouble(myConstants.getKeyLongitude(), items.getmLongitude());

                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

}
