package com.example.pk.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.left_fragment_container, LeftFragment.newInstance()
                        , LeftFragment.class.getSimpleName())
                .replace(R.id.right_fragment_container, RightFragment.newInstance()
                        , RightFragment.class.getSimpleName())
                .commit();
    }
}
