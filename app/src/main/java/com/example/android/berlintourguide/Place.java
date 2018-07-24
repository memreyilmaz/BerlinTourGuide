package com.example.android.berlintourguide;

public class Place {

    private int mPlaceName;

    private int mExplanationText;

    private int mImageResourceId;

    private int mPlaceTelephoneNumber;

    private int mPlaceAddress;

    private int mPlaceWebSite;

    public Place(int placeName, int explanationText, int imageResourceId, int placeTelephoneNumber, int placeAddress, int placeWebSite){
        mPlaceName = placeName;
        mExplanationText = explanationText;
        mImageResourceId = imageResourceId;
        mPlaceTelephoneNumber = placeTelephoneNumber;
        mPlaceAddress = placeAddress;
        mPlaceWebSite = placeWebSite;
    }

    public Place(int placeName, int explanationText, int imageResourceId, int placeAddress, int placeWebSite){
        mPlaceName = placeName;
        mExplanationText = explanationText;
        mImageResourceId = imageResourceId;
        mPlaceAddress = placeAddress;
        mPlaceWebSite = placeWebSite;
    }

    public Place(int placeName, int explanationText, int imageResourceId, int placeAddress){
        mPlaceName = placeName;
        mExplanationText = explanationText;
        mImageResourceId = imageResourceId;
        mPlaceAddress = placeAddress;
    }

    public int getPlaceName(){
        return mPlaceName;
    }

    public int getExplanationText(){
        return mExplanationText;
    }

    public int getImageResourceId (){
        return mImageResourceId;
    }

    public int getPlaceTelephoneNumber (){
        return mPlaceTelephoneNumber;
    }

    public int getPlaceAddress (){
        return mPlaceAddress;
    }

    public int getPlaceWebSite (){
        return mPlaceWebSite;
    }
}
