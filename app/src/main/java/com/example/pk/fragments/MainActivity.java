package com.example.pk.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RightFragment rightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightFragment = RightFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.left_fragment_container, LeftFragment.newInstance()
                        , LeftFragment.class.getSimpleName())
                .replace(R.id.right_fragment_container, rightFragment
                        , RightFragment.class.getSimpleName())
                .commit();
    }

    public void setTextToRightFragment(String text) {
        rightFragment.setText(text);
    }
}
