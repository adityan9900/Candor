package com.helloworld.candor.candor;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RelativeLayout;

public class CompanySummaryActivity extends AppCompatActivity {

    RelativeLayout gradeLayout = findViewById(R.id.gradeLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_summary);
        System.out.println(getActionBar());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
