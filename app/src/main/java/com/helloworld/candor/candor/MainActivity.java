package com.helloworld.candor.candor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TypefaceProvider.registerDefaultIconSets();
    }
}
