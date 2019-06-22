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



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_list_view, container, false);
        populateHotelList();
        return view;
    }

    private void populateHotelList() {

        final ArrayList<placesModel> model = new ArrayList<>();
        model.add(new placesModel(getString(R.string.MadinaMarriottHotel_1), getString(R.string.address_1),
                R.drawable.medmc_exterior, getString(R.string.marriott_detail)));

        model.add(new placesModel(getString(R.string.GoldenTulipAlMektan), getString(R.string.AlSalamStreetWestArea_hotel2), R.drawable.golden_tulip_al_mektan,
                getString(R.string.mektan_detail)));

        model.add(new placesModel(getString(R.string.DallahTaibahHotel), getString(R.string.Abarzarstreet),
                R.drawable.dallah_taibah_hotel, getString(R.string.dallah_detail)));


        model.add(new placesModel(getString(R.string.GoldenGardenAlmedinaHotel), getString(R.string.GoldenGardenAddress), R.drawable.golden_garden, getString(R.string.GoldenDardenDetail)));


        model.add(new placesModel(getString(R.string.CoralAlMadinahHotel), getString(R.string.CoralAddress),
                R.drawable.coral, getString(R.string.CoralDetail)));


        myPlacesArrayAdapter adapter = new myPlacesArrayAdapter(this.getContext(), model);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                placesModel items = model.get(position);


                Bundle bundle = new Bundle();
                bundle.putString(myConstants.getKeyPlaceName(), items.getmPlaceName());
                bundle.putString(myConstants.getKeyPlaceAddress(), items.getmPlaceAddress());
                bundle.putInt(myConstants.getKeyImage(), items.getmImageRecourse());
                bundle.putString(myConstants.getKeyPlaceDetail(), items.getmPlaceDetail());



                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
