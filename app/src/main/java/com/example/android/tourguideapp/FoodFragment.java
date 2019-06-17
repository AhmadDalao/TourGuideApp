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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    public static final String KEY_IMAGE = "KEE_IMAGE";
    public static final String KEY_PLACE_NAME = "KEY_PLACE_NAME";
    public static final String KEY_PLACE_ADDRESS = "KEY_PLACE_ADDRESS";
    public static final String KEY_PLACE_DETAIL = "KEY_PLACE_DETAIL";


    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);

        populateFoodList();
        return view;
    }

    private void populateFoodList() {
        final ArrayList<placesModel> models = placesModel.getFoodList();
        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), models);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                placesModel placesModel = models.get(position);

                Bundle bundle = new Bundle();
                bundle.putString(KEY_PLACE_NAME, placesModel.getmPlaceName());
                bundle.putString(KEY_PLACE_ADDRESS, placesModel.getmPlaceAddress());
                bundle.putInt(KEY_IMAGE, placesModel.getmImageRecourse());
                bundle.putString(KEY_PLACE_DETAIL, placesModel.getmPlaceDetail());

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

}
