package com.example.android.berlintourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place>  {

    private int mColorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView placeExplanationTextView = listItemView.findViewById(R.id.explanation_text_view);
        placeExplanationTextView.setText(currentPlace.getExplanationText());

        ImageView placeImageView = listItemView.findViewById(R.id.place_image);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}