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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    private View view;


    public static final String KEY_IMAGE = "KEE_IMAGE";
    public static final String KEY_PLACE_NAME = "KEY_PLACE_NAME";
    public static final String KEY_PLACE_ADDRESS = "KEY_PLACE_ADDRESS";
    public static final String KEY_PLACE_DETAIL = "KEY_PLACE_DETAIL";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);
        populateShoppingList();
        return view;
    }

    private void populateShoppingList() {


        final ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel(getString(R.string.alrashed), getString(R.string.alrashedAddress), R.drawable.aalrashed, getString(R.string.alrashedDetail)));

        models.add(new placesModel(getString(R.string.adel), getString(R.string.adelAddress), R.drawable.screenshot_2, getString(R.string.adelDetail)));


        models.add(new placesModel(getString(R.string.noor), getString(R.string.noorAddress), R.drawable.alnoor, getString(R.string.noor_detail)
        ));


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
