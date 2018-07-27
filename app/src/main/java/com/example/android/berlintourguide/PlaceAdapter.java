package com.example.android.berlintourguide;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

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

        AssetManager am = getContext().getAssets();

        Typeface typeface = Typeface.createFromAsset(am,
                String.format(Locale.US, "font/%s", "CstBerlinWest Original Regular.otf"));

        Place currentPlace = getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getPlaceName());
        placeNameTextView.setTypeface(typeface);

        TextView placeExplanationTextView = listItemView.findViewById(R.id.explanation_text_view);
        placeExplanationTextView.setText(currentPlace.getShortExplanationText());
        placeExplanationTextView.setTypeface(typeface);

        ImageView placeImageView = listItemView.findViewById(R.id.place_image);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        placeImageView.setBackgroundColor(color);

        return listItemView;
    }
}