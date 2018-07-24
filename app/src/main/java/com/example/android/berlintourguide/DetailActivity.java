package com.example.android.berlintourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Place currentPlace;
        Intent intent = getIntent();
        currentPlace = intent.getParcelableExtra("place");
        setTitle(currentPlace.getPlaceName());

        ImageView placeImageView = findViewById(R.id.place_image_big);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        TextView placeNameTextView = findViewById(R.id.place_name_text_view_detail);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView placeExplanationTextView = findViewById(R.id.explanation_text_view_detail);
        placeExplanationTextView.setText(currentPlace.getExplanationText());

        TextView placeAddressTextView = findViewById(R.id.place_address_text_view);
        placeAddressTextView.setText(currentPlace.getPlaceAddress());


    }
}