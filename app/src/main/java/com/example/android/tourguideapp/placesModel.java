package com.example.android.tourguideapp;

import java.util.ArrayList;

public class placesModel {


    private String mPlaceName;
    private String mPlaceAddress;
    private int mImageRecourse = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public placesModel(String mPlaceName, String mPlaceAddress, int mImageRecourse) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mImageRecourse = mImageRecourse;
    }

    public placesModel(String mPlaceName, String mPlaceAddress) {
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


    public static ArrayList<placesModel> getHotelList() {

        ArrayList<placesModel> model = new ArrayList<>();
        model.add(new placesModel("Madinah Marriott Hotel", "King Faisal Street", R.drawable.medmc_exterior));
        model.add(new placesModel("Golden Tulip Al Mektan", "Al Salam Street , West Area", R.drawable.golden_tulip_al_mektan));
        model.add(new placesModel("Dallah Taibah Hotel ", "Abarzar street", R.drawable.dallah_taibah_hotel));
        model.add(new placesModel("Golden Garden AlMadhina Hotel", "Saad bin. Khithamah Beside National hospital", R.drawable.golden_garden));
        model.add(new placesModel("Coral Al Madinah Hotel  ", "Abu Ayyub Al Ansari - Bani Khidrah District", R.drawable.coral));

        return model;
    }

    public static ArrayList<placesModel> getFoodList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("test food", "test"));


        return models;
    }

    public static ArrayList<placesModel> getPlacesList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("test places", "test"));


        return models;
    }

    public static ArrayList<placesModel> getShoppingList() {
        ArrayList<placesModel> models = new ArrayList<>();
        models.add(new placesModel("test shopping", "test"));


        return models;
    }


}
