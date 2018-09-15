package com.helloworld.candor.candor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class MainActivity extends AppCompatActivity {

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;
    final int REWARDS_REQUEST_CODE = 2;
    Button submitCompanyButton;
    Button rewardsButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitCompanyButton = findViewById(R.id.submitCompanyButton);
        rewardsButton = findViewById(R.id.rewardsButton);

        TypefaceProvider.registerDefaultIconSets();

        submitCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), CompanySummaryActivity.class);
                startActivityForResult(myIntent, COMPANY_SUMMARY_REQUEST_CODE);
            }
        });

        rewardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), RewardsActivity.class);
                startActivityForResult(myIntent, REWARDS_REQUEST_CODE);
            }
        });
    }
}
