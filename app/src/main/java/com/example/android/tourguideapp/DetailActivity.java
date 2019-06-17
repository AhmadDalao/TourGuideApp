package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.tourguideapp.HotelFragment.KEY_IMAGE;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_ADDRESS;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_DETAIL;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_NAME;


public class DetailActivity extends AppCompatActivity {

    private static final int NO_Image = -1;
    private String theNameFromFragment;
    private String theAddressFromFragment;
    private String theDetailFromFragment;
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
        }

        TextView namePlace = (TextView) findViewById(R.id.name_detail);
        namePlace.setText(theNameFromFragment);

        TextView address = (TextView) findViewById(R.id.address_detail);
        address.setText(theAddressFromFragment);
        address.setMovementMethod(LinkMovementMethod.getInstance());

        TextView detail = (TextView) findViewById(R.id.information_detail);
        detail.setText(theDetailFromFragment);


        ImageView image_place = (ImageView) findViewById(R.id.icon);
        if(hasImage()){
            image_place.setVisibility(View.VISIBLE);
            image_place.setImageResource(theImageFromFragment);
        }else
        {
            image_place.setVisibility(View.GONE);
        }

    }


    private boolean hasImage(){
        return theImageFromFragment != NO_Image;
    }

}
