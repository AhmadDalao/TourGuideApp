package com.example.android.tourguideapp;

import android.content.res.Resources;

import java.util.ArrayList;

public class PlacesModel {


    private String mPlaceName;
    private String mPlaceAddress;
    private int mImageRecourse = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public PlacesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
    }

    public PlacesModel(String mPlaceName, String mPlaceAddress) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
    }


    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public void setmPlaceAddress(String mPlaceAddress) {
        this.mPlaceAddress = mPlaceAddress;
    }

    public int getmImageRecourse() {
        return mImageRecourse;
    }

    public void setmImageRecourse(int mImageRecourse) {
        this.mImageRecourse = mImageRecourse;
    }


    public boolean hasImage() {
        return mImageRecourse != NO_IMAGE;
    }


    public static ArrayList<PlacesModel> getHotelList() {

        ArrayList<PlacesModel> model = new ArrayList<>();
        model.add(new PlacesModel(Resources.getSystem().getString(R.string.Marriott_Hotel), Resources.getSystem().getString(R.string.Marriott_Hotel_address)
       ));


        return model;
    }

}
