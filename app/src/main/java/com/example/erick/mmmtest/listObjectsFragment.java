package com.example.erick.mmmtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by erick on 26/01/18.
 */

public class listObjectsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] item_objects = {"item1","item2","item3"};
        View view = inflater.inflate(R.layout.fragment_list_objects, container, false);


        ListView listView = view.findViewById(R.id.listItem);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_dropdown_item_1line,
                item_objects
        );
        listView.setAdapter(listViewAdapter);

        return view;

    }
}
