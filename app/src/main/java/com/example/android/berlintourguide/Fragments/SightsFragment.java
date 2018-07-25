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
                R.drawable.alexanderplatz, R.string.sights_name_alexanderplatz_address, R.string.no_phone_number   ));
        places.add(new Place(R.string.sights_name_potsdamer_platz, R.string.sights_name_potsdamer_platz_explanation,
                R.drawable.potsdamerplatz, R.string.sights_name_potsdamer_platz_address, R.string.no_phone_number  ));
        places.add(new Place(R.string.sights_name_victoriapark, R.string.sights_name_victoriapark_explanation,
                R.drawable.victoriapark, R.string.sights_name_victoriapark_address, R.string.no_phone_number  ));
        places.add(new Place(R.string.sights_name_brandenburg_gate, R.string.sights_name_brandenburg_gate_explanation,
                R.drawable.brandenburggate, R.string.sights_name_brandenburg_gate_address, R.string.no_phone_number ));
        places.add(new Place(R.string.sights_name_east_side_gallery, R.string.sights_name_east_side_gallery_explanation,
                R.drawable.eastsidegallery, R.string.sights_name_east_side_gallery_address, R.string.no_phone_number   ));
        places.add(new Place(R.string.sights_name_hauptbahnhof, R.string.sights_name_hauptbahnhof_explanation,
                R.drawable.hauptbahnhof, R.string.sights_name_hauptbahnhof_address, R.string.sights_name_hauptbahnhof_telephone  ));
        places.add(new Place(R.string.sights_name_gendarmenmarkt, R.string.sights_name_gendarmenmarkt_explanation,
                R.drawable.gendarmenmarkt, R.string.sights_name_gendarmenmarkt_address, R.string.no_phone_number  ));
        places.add(new Place(R.string.sights_name_botanischer_garten, R.string.sights_name_botanischer_garten_explanation,
                R.drawable.botanischergarten, R.string.sights_name_botanischer_garten_address, R.string.sights_name_botanischer_garten_telephone   ));
        places.add(new Place(R.string.sights_name_olympiastadion, R.string.sights_name_olympiastadion_explanation,
                R.drawable.olympiastadion, R.string.sights_name_olympiastadion_address, R.string.sights_name_olympiastadion_telephone   ));
        places.add(new Place(R.string.sights_name_tiergarten, R.string.sights_name_tiergarten_explanation,
                R.drawable.tiergarten, R.string.sights_name_tiergarten_address, R.string.no_phone_number  ));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sights);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place place = places.get(position);

                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("place", place);

                startActivity(intent);
            }
        });

        return rootView;
    }

}
