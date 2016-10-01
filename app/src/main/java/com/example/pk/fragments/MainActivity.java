package com.example.pk.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private LeftFragment leftFragment;
    private RightFragment rightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightFragment = RightFragment.newInstance();
        leftFragment = LeftFragment.newInstance();
        leftFragment.setiSender(rightFragment);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.left_fragment_container, leftFragment
                        , LeftFragment.class.getSimpleName())
                .replace(R.id.right_fragment_container, rightFragment
                        , RightFragment.class.getSimpleName())
                .commit();

    }
}
