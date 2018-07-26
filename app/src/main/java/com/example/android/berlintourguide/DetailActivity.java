package com.example.android.berlintourguide;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class DetailActivity extends AppCompatActivity {
    Place currentPlace;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        AssetManager am = getApplicationContext().getAssets();

        typeface = Typeface.createFromAsset(am,
                String.format(Locale.US, "font/%s", "CstBerlinWest Original Regular.otf"));

        Intent intent = getIntent();
        currentPlace = intent.getParcelableExtra("place");
        //ActionBar actionBar=getSupportActionBar();
        setTitle(currentPlace.getPlaceName());
        //actionBar.setTypeface(typeface);*/
        //getSupportActionBar().setTitle((Html.fromHtml("<font face=\"CstBerlinWest Original Regular\">" + getString(currentPlace.getPlaceName()) + "</font>")));
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setDisplayShowCustomEnabled(true);
        //actionBar.setDisplayShowTitleEnabled(false);
        //actionBar.setTypeface(typeface);
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2B1C27")));

        ImageView placeImageView = findViewById(R.id.place_image_big);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        TextView placeNameTextView = findViewById(R.id.place_name_text_view_detail);
        placeNameTextView.setText(currentPlace.getPlaceName());
        placeNameTextView.setTypeface(typeface);

        TextView placeExplanationTextView = findViewById(R.id.explanation_text_view_detail);
        placeExplanationTextView.setText(currentPlace.getExplanationText());
        placeExplanationTextView.setTypeface(typeface);

        TextView placeAddressTextView = findViewById(R.id.place_address_text_view);
        placeAddressTextView.setText(currentPlace.getPlaceAddress());
        placeAddressTextView.setTypeface(typeface);
        final String addressTextViewText = (String) placeAddressTextView.getText();

        placeAddressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String map = "http://maps.google.com/maps?q=" + addressTextViewText;
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(mapIntent);
            }
        });

        showPhoneNumber();
        showWebSite();


    }

    public void showPhoneNumber() {
        if (currentPlace.getPlaceTelephoneNumber() != R.string.no_phone_number) {
            TextView placeTelephoneTextView = findViewById(R.id.place_telephone_text_view);
            ImageView placeTelephoneIconImageView = findViewById(R.id.place_telephone_number_icon_image_view);
            placeTelephoneTextView.setVisibility(View.VISIBLE);
            placeTelephoneIconImageView.setVisibility(View.VISIBLE);
            placeTelephoneTextView.setText(currentPlace.getPlaceTelephoneNumber());
            placeTelephoneTextView.setTypeface(typeface);
            final String telephoneTextViewText = (String) placeTelephoneTextView.getText();

            placeTelephoneTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent telephoneIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telephoneTextViewText, null));
                    startActivity(telephoneIntent);
                }
            });
        }
    }



    public void showWebSite() {
        if (currentPlace.getPlaceWebSite() != R.string.no_web_site) {
            TextView placeWebsiteTextView = findViewById(R.id.place_website_text_view);
            ImageView placeWebSiteIconImageView = findViewById(R.id.place_website_icon_image_view);
            placeWebsiteTextView.setVisibility(View.VISIBLE);
            placeWebSiteIconImageView.setVisibility(View.VISIBLE);
            placeWebsiteTextView.setText(R.string.web_site);
            placeWebsiteTextView.setTypeface(typeface);
            final String webSiteTextViewText = getString(currentPlace.getPlaceWebSite());

            placeWebsiteTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(webSiteTextViewText));
                    startActivity(browserIntent);
                }
            });

        }
    }
}
