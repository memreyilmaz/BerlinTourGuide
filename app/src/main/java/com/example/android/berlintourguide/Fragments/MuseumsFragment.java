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


public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.museum_name_stasi_museum, R.string.museum_name_stasi_museum_explanation,
                R.drawable.stasimuseum, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_ddr_museum, R.string.museum_name_ddr_museum_explanation,
                R.drawable.ddrmuseum, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_sans_souci_palace, R.string.museum_name_sans_souci_palace_explanation,
                R.drawable.sanssouci, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_museum_island, R.string.museum_name_museum_island_explanation,
                R.drawable.museumisland, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_holocaust_memorandum, R.string.museum_name_holocaust_memorandum_explanation,
                R.drawable.holocaustmemorandum, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_topography_of_terrors, R.string.museum_name_topography_of_terrors_explanation,
                R.drawable.topographiedesterrors, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_berlin_wall, R.string.museum_name_berlin_wall_explanation,
                R.drawable.berlinwall, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_reichstag, R.string.museum_name_reichstag_explanation,
                R.drawable.bundestag, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_marx_engels_forum, R.string.museum_name_marx_engels_forum_explanation,
                R.drawable.marxengelsforum, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));
        places.add(new Place(R.string.museum_name_checkpoint_charlie, R.string.museum_name_checkpoint_charlie_explanation,
                R.drawable.checkpointcharlie, mPlaceTelephoneNumber, mPlaceAddress, mPlaceWebSite));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museums);

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