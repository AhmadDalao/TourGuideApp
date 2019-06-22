package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


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

        //set the up button xD
        getSupportActionBar().setTitle("Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            theNameFromFragment = bundle.getString(myConstants.getKeyPlaceName());
            theAddressFromFragment = bundle.getString(myConstants.getKeyPlaceAddress());
            theImageFromFragment = bundle.getInt(myConstants.getKeyImage());
            theDetailFromFragment = bundle.getString(myConstants.getKeyPlaceDetail());
            mLatitude = bundle.getDouble(myConstants.getKeyLatitude());
            mLongitude = bundle.getDouble(myConstants.getKeyLongitude());
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

    // to set up the back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }


    private boolean hasImage() {
        return theImageFromFragment != NO_Image;
    }

}
