package com.example.pk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LeftFragment extends Fragment {

    public static LeftFragment newInstance() {

        Bundle args = new Bundle();

        LeftFragment fragment = new LeftFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_left, container, false);

        final Button setTextAction = (Button) root.findViewById(R.id.lf_set_text);
        setTextAction.setText(getString(R.string.lf_set_text));

        return root;
    }

}
