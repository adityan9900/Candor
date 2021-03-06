package com.helloworld.candor.candor;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;

public class MoreInformationActivity extends AppCompatActivity {

    TextView rankText;
    TextView percentText;
    TextView compName;
    TextView descripText;
    String companyName;
    CompanyActivity companyActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        companyName = getIntent().getExtras().get("companyName").toString();

        companyActivity = new CompanyActivity();

        rankText = findViewById(R.id.rankText);
        compName = findViewById(R.id.compName);
        percentText = findViewById(R.id.percentText);
        descripText = findViewById(R.id.descripText);

        System.out.println("HERE " + companyName);

        rankText.setText(companyActivity.getRanking(companyName) + "");
        String temp = "";
        for(int i = 0; i < companyName.length(); i ++) {
            temp += (companyName.charAt(i) + " ").toUpperCase();
        }
        compName.setText(temp);
        percentText.setText("" + companyActivity.getPercentile(companyName) * 100 + "%");
        descripText.setText(companyActivity.getDescriptor(companyName));
    }


}
