package com.example.android.berlintourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Place implements Parcelable {

    private int mPlaceName;

    private int mShortExplanationText;

    private int mExplanationText;

    private int mImageResourceId;

    private int mPlaceTelephoneNumber;

    private int mPlaceAddress;

    private int mPlaceWebSite;

    public Place(int placeName, int explanationText, int imageResourceId, int placeAddress, int placeTelephoneNumber, int placeWebSite, int shortExplanationText){
        mPlaceName = placeName;
        mExplanationText = explanationText;
        mImageResourceId = imageResourceId;
        mPlaceAddress = placeAddress;
        mPlaceTelephoneNumber = placeTelephoneNumber;
        mPlaceWebSite = placeWebSite;
        mShortExplanationText = shortExplanationText;
    }

    public int getPlaceName(){
        return mPlaceName;
    }

    public int getShortExplanationText(){
        return mShortExplanationText;
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

    protected Place(Parcel in) {
        mPlaceName = in.readInt();
        mExplanationText = in.readInt();
        mImageResourceId = in.readInt();
        mPlaceTelephoneNumber = in.readInt();
        mPlaceAddress = in.readInt();
        mPlaceWebSite = in.readInt();
        mShortExplanationText = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mPlaceName);
        dest.writeInt(mExplanationText);
        dest.writeInt(mImageResourceId);
        dest.writeInt(mPlaceTelephoneNumber);
        dest.writeInt(mPlaceAddress);
        dest.writeInt(mPlaceWebSite);
        dest.writeInt(mShortExplanationText);
    }

    public static final Parcelable.Creator<Place> CREATOR = new Parcelable.Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };
}

