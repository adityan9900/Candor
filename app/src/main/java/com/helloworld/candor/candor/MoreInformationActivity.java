package com.helloworld.candor.candor;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;

public class MoreInformationActivity extends AppCompatActivity {

    TextView rankText;
    TextView percentText;
    TextView compName;
    EditText descripText;
    CompanyActivity companyActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        companyActivity = new CompanyActivity();

        rankText = findViewById(R.id.rankText);
        compName = findViewById(R.id.compName);
        percentText = findViewById(R.id.percentText);
        descripText = findViewById(R.id.descripText);
        
    }


}
