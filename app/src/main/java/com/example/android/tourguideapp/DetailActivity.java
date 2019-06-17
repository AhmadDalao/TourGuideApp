package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.tourguideapp.HotelFragment.KEY_IMAGE;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_ADDRESS;
import static com.example.android.tourguideapp.HotelFragment.KEY_PLACE_NAME;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Bundle bundle = getIntent().getExtras();
        String theNameFromFragment = bundle.getString(KEY_PLACE_NAME);
        String theAddressFromFragment = bundle.getString(KEY_PLACE_ADDRESS);
        int theImageFromFragment = bundle.getInt(KEY_IMAGE);


        TextView namePlace = (TextView) findViewById(R.id.name_detail);
        namePlace.setText(theNameFromFragment);

        TextView address = (TextView) findViewById(R.id.address_detail);
        address.setText(theAddressFromFragment);
        address.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView imageview = (ImageView) findViewById(R.id.icon);
        if (imageview == null) {
            imageview.setVisibility(View.GONE);
        } else
            imageview.setImageResource(theImageFromFragment);

    }


}
