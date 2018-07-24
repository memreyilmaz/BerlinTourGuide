package com.example.android.berlintourguide.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.berlintourguide.DetailActivity;
import com.example.android.berlintourguide.Place;
import com.example.android.berlintourguide.PlaceAdapter;
import com.example.android.berlintourguide.R;

import java.util.ArrayList;


public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.sights_name_alexanderplatz, R.string.sights_name_alexanderplatz_explanation,
                R.drawable.alexanderplatz, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_potsdamer_platz, R.string.sights_name_potsdamer_platz_explanation,
                R.drawable.potsdamerplatz, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_victoriapark, R.string.sights_name_victoriapark_explanation,
                R.drawable.victoriapark, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_brandenburg_gate, R.string.sights_name_brandenburg_gate_explanation,
                R.drawable.brandenburggate, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_east_side_gallery, R.string.sights_name_east_side_gallery_explanation,
                R.drawable.eastsidegallery, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_hauptbahnhof, R.string.sights_name_hauptbahnhof_explanation,
                R.drawable.hauptbahnhof, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_gendarmenmarkt, R.string.sights_name_gendarmenmarkt_explanation,
                R.drawable.gendarmenmarkt, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_botanischer_garten, R.string.sights_name_botanischer_garten_explanation,
                R.drawable.botanischergarten, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_olympiastadion, R.string.sights_name_olympiastadion_explanation,
                R.drawable.olympiastadion, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.sights_name_tiergarten, R.string.sights_name_tiergarten_explanation,
                R.drawable.tiergarten, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sights);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place place = places.get(position);

                //TODO INTENT DETAIL ACTIVITY
                Intent intent = new Intent(getContext(), DetailActivity.class);
                //intent.putExtra(getResources().getString(R.string.parcel_movie), mCurrentMovie);

                startActivity(intent);
            }
        });

        return rootView;
    }

}
