package com.example.android.tourguideapp;

public class placesModel {

    private double mLatitude;
    private double mLongitude;
    private String mPlaceAddress;
    private int mImageRecourse = NO_IMAGE;
    private String mPlaceName;
    private String mPlaceDetail;
    private static final int NO_IMAGE = -1;

    public double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }


    public placesModel(String mPlaceName, String mPlaceAddress, double mLatitude, double mLongitude) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }


    public placesModel(String mPlaceName, String mPlaceAddress, double mLatitude, double mLongitude, int mImageRecourse) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
        this.mImageRecourse = mImageRecourse;
    }

    public placesModel(String mPlaceName, String mPlaceAddress, double mLatitude, double mLongitude, int mImageRecourse, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
        this.mImageRecourse = mImageRecourse;
        this.mPlaceDetail = mPlaceDetail;
    }


    public placesModel() {

    }

    public placesModel(String mPlaceName, String mPlaceAddress, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mPlaceDetail = mPlaceDetail;
    }


    public placesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
        this.mPlaceDetail = mPlaceDetail;
    }

    public placesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
    }


    public String getmPlaceDetail() {
        return mPlaceDetail;
    }

    public void setmPlaceDetail(String mPlaceDetail) {
        this.mPlaceDetail = mPlaceDetail;
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


}
