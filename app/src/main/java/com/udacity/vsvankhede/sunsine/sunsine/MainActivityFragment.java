package com.udacity.vsvankhede.sunsine.sunsine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mArrayAdapter;
    String[] forecastArray = {
            "Today - Sunny - 88/63",
            "Tomorrow - Foggy - 70/40",
            "Weds - Cloudy - 72/63",
            "Thurs - Asteroids - 75/65",
            "Fri - Heavy Rain - 65/56",
            "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
            "Sun - Sunny - 80/68"
    };

    List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mArrayAdapter =
                new ArrayAdapter<>(
                        // The current context (This fragment's parent activity)
                        getActivity(),
                        // ID of list item layout
                        R.layout.list_item_forecast,
                        // ID of textview to populate
                        R.id.list_item_forecast_textview,
                        // Forecast data
                        weekForecast);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_main_listview_forecast);
        listView.setAdapter(mArrayAdapter);
        return rootView;
    }
}
