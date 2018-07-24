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


public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.activities_name_kadewe, R.string.activities_name_kadewe_explanation,
                R.drawable.kadewe, R.string.activities_name_kadewe_address));
        places.add(new Place(R.string.activities_name_ampelmann_shop, R.string.activities_name_ampelmann_shop_explanation,
                R.drawable.ampelmannshop, R.string.activities_name_ampelmann_shop_address));
        places.add(new Place(R.string.activities_name_classic_remise, R.string.activities_name_classic_remise_explanation,
                R.drawable.classicremise, R.string.activities_name_classic_remise_address));
        places.add(new Place(R.string.activities_name_markthalle_neun, R.string.activities_name_markthalle_neun_explanation,
                R.drawable.markthalleneun, R.string.activities_name_markthalle_neun_address));
        places.add(new Place(R.string.activities_name_berlin_philharmonic, R.string.activities_name_berlin_philharmonic_explanation,
                R.drawable.berlinphilharmonic, R.string.activities_name_berlin_philharmonic_address ));
        places.add(new Place(R.string.activities_name_tierpark, R.string.activities_name_tierpark_explanation,
                R.drawable.tierpark, R.string.activities_name_tierpark_address ));
        places.add(new Place(R.string.activities_name_mall_of_berlin, R.string.activities_name_mall_of_berlin_explanation,
                R.drawable.mallofberlin, R.string.activities_name_mall_of_berlin_address));
        places.add(new Place(R.string.activities_name_sony_center, R.string.activities_name_sony_center_explanation,
                R.drawable.sonycenter, R.string.activities_name_sony_center_address ));
        places.add(new Place(R.string.activities_name_aquadom_and_sealife, R.string.activities_name_aquadom_and_sealife_explanation,
                R.drawable.aquadomsealife, R.string.activities_name_aquadom_and_sealife_address ));
        places.add(new Place(R.string.activities_name_trabi_tour, R.string.activities_name_trabi_tour_explanation,
                R.drawable.trabitour, R.string.activities_name_trabi_tour_address ));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_activies);


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
