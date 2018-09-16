package com.helloworld.candor.candor;

import android.os.Bundle;
import android.app.Activity;

public class MoreInformationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
