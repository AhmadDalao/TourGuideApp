package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.tourguideapp.FoodFragment.KEY_LATITUDE;
import static com.example.android.tourguideapp.FoodFragment.KEY_LONGITUDE;
import static com.example.android.tourguideapp.HotelFragment.KEY_IMAGE;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_ADDRESS;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_DETAIL;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_NAME;


public class DetailActivity extends AppCompatActivity {

    private static final int NO_Image = -1;
    private String theNameFromFragment;
    private String theAddressFromFragment;
    private String theDetailFromFragment;

    private double mLatitude;
    private double mLongitude;

    private int theImageFromFragment = NO_Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            theNameFromFragment = bundle.getString(KEY_PLACE_NAME);
            theAddressFromFragment = bundle.getString(KEY_PLACE_ADDRESS);
            theImageFromFragment = bundle.getInt(KEY_IMAGE);
            theDetailFromFragment = bundle.getString(KEY_PLACE_DETAIL);
            mLatitude = bundle.getDouble(KEY_LATITUDE );
            mLongitude = bundle.getDouble(KEY_LONGITUDE);
        }

        final TextView namePlace = (TextView) findViewById(R.id.name_detail);
        namePlace.setText(theNameFromFragment);

        TextView address = (TextView) findViewById(R.id.address_detail);
        address.setText(theAddressFromFragment);


        TextView detail = (TextView) findViewById(R.id.information_detail);
        detail.setText(theDetailFromFragment);


        ImageView image_place = (ImageView) findViewById(R.id.icon);
        if (hasImage()) {
            image_place.setVisibility(View.VISIBLE);
            image_place.setImageResource(theImageFromFragment);
        } else {
            image_place.setVisibility(View.GONE);
        }

        ImageView location = (ImageView) findViewById(R.id.location_map);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:" + mLatitude + "," + mLongitude + "?q=" + theNameFromFragment);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }

        });


    }


    private boolean hasImage() {
        return theImageFromFragment != NO_Image;
    }

}
