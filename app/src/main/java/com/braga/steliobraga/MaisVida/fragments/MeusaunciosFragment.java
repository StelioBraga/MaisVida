package com.braga.steliobraga.MaisVida.fragments;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.braga.steliobraga.MaisVida.R;

public class MeusaunciosFragment extends Fragment {



    public MeusaunciosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meusanuncios, container, false);
    }

}