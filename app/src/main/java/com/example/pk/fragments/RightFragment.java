package com.example.pk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class RightFragment extends Fragment {
    private TextView textLabel;

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

        textLabel = (TextView) root.findViewById(R.id.rf_text_label);
        return root;
    }

    public void setText(String text) {
        textLabel.setText(text);
    }
}
