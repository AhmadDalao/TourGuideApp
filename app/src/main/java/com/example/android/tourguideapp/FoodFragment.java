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
    public static final String KEY_LATITUDE = "KEY_LATITUDE";
    public static final String KEY_LONGITUDE = "KEY_LONGITUDE";

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);

        populateFoodList();
        return view;
    }

    private void populateFoodList() {
        final ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel(getString(R.string.food01), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food02), getString(R.string.food_time), 24.4695945, 39.606515));
        models.add(new placesModel(getString(R.string.food03), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food04), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food05), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food06), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food07), getString(R.string.food_time), 24.4878472, 39.6481492));
        models.add(new placesModel(getString(R.string.food08), getString(R.string.food_time), 24.4780252, 39.6051526));
        models.add(new placesModel(getString(R.string.food09), getString(R.string.food_time), 24.4780252, 39.6051526));
        models.add(new placesModel(getString(R.string.food10), getString(R.string.food_time), 24.4675248, 39.5999492));

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
                bundle.putDouble(KEY_LATITUDE, placesModel.getmLatitude());
                bundle.putDouble(KEY_LONGITUDE, placesModel.getmLongitude());

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

}
