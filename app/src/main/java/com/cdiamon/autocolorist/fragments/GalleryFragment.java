package com.cdiamon.autocolorist.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.cdiamon.autocolorist.R;
import com.cdiamon.autocolorist.explistview.ActivitySearchGallery;

public class GalleryFragment extends Fragment {

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_gallery, container, false);
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        Button goButton = (Button) view.findViewById(R.id.fragm_button_go);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(GalleryFragment.this.getContext(), ActivitySearchGallery.class);
                Toast.makeText(GalleryFragment.this.getContext(), R.string.fragmentGalleryToastGo, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        return view;
    }
}
