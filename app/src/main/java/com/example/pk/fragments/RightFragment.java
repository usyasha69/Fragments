package com.example.pk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RightFragment extends Fragment {

    public static RightFragment newInstance() {

        Bundle args = new Bundle();

        RightFragment fragment = new RightFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_right, container, false);

        return root;
    }

}
