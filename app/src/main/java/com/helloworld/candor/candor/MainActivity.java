package com.helloworld.candor.candor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class MainActivity extends AppCompatActivity {

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitCompanyButton = findViewById(R.id.submitCompanyButton);

        TypefaceProvider.registerDefaultIconSets();

        submitCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), CompanySummaryActivity.class);
                startActivityForResult(myIntent, COMPANY_SUMMARY_REQUEST_CODE);
            }
        });
    }
}
