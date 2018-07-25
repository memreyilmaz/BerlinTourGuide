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


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.restaurants_name_curry_36, R.string.restaurants_name_curry_36_explanation,
                R.drawable.curry36, R.string.restaurants_name_curry_36_address, R.string.restaurants_name_curry_36_telephone, R.string.restaurants_name_curry_36_website  ));
        places.add(new Place(R.string.restaurants_name_mustafas_gemuse_kebap, R.string.restaurants_name_mustafas_gemuse_kebap_explanation,
                R.drawable.mustafasgemuesekebab, R.string.restaurants_name_mustafas_gemuse_kebap_address, R.string.restaurants_name_mustafas_gemuse_kebap_telephone, R.string.restaurants_name_mustafas_gemuse_kebap_website  ));
        places.add(new Place(R.string.restaurants_name_burger_meister, R.string.restaurants_name_burger_meister_explanation,
                R.drawable.burgermeister, R.string.restaurants_name_burger_meister_address, R.string.restaurants_name_burger_meister_telephone, R.string.restaurants_name_burger_meister_website ));
        places.add(new Place(R.string.restaurants_name_vapiano, R.string.restaurants_name_vapiano_explanation,
                R.drawable.vapiano, R.string.restaurants_name_vapiano_address, R.string.restaurants_name_vapiano_telephone, R.string.restaurants_name_vapiano_website  ));
        places.add(new Place(R.string.restaurants_name_zola, R.string.restaurants_name_zola_explanation,
                R.drawable.zola, R.string.restaurants_name_zola_address, R.string.restaurants_name_zola_telephone, R.string.restaurants_name_zola_website ));
        places.add(new Place(R.string.restaurants_name_hasir, R.string.restaurants_name_hasir_explanation,
                R.drawable.hasir, R.string.restaurants_name_hasir_address, R.string.restaurants_name_hasir_telephone, R.string.restaurants_name_hasir_website ));
        places.add(new Place(R.string.restaurants_name_lindner, R.string.restaurants_name_lindner_explanation,
                R.drawable.lindner, R.string.restaurants_name_lindner_address, R.string.restaurants_name_lindner_telephone, R.string.restaurants_name_lindner_website));
        places.add(new Place(R.string.restaurants_name_block_house, R.string.restaurants_name_block_house_explanation,
                R.drawable.blockhouse, R.string.restaurants_name_block_house_address, R.string.restaurants_name_block_house_telephone, R.string.no_web_site ));
        places.add(new Place(R.string.restaurants_name_hokey_pokey, R.string.restaurants_name_hokey_pokey_explanation,
                R.drawable.hokeypokey, R.string.restaurants_name_hokey_pokey_address, R.string.restaurants_name_hokey_pokey_telephone, R.string.restaurants_name_hokey_pokey_website  ));
        places.add(new Place(R.string.restaurants_name_oysterbar_kadewe, R.string.restaurants_name_oysterbar_kadewe_explanation,
                R.drawable.oysterbar, R.string.activities_name_kadewe_address, R.string.restaurants_name_oysterbar_kadewe_telephone, R.string.restaurants_name_oysterbar_kadewe_website  ));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

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
