package com.helloworld.candor.candor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.TypefaceProvider;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;
    final int REWARDS_REQUEST_CODE = 2;
   // final int PROMO_REQUEST_CODE = 3;

    Button submitCompanyButton;
    Button rewardsButton;
    TextView companyInputTextView;
    TextView blackListOne, blackListTwo, blackListThree;
    CompanyActivity companyActivity;
    //ImageButton promoOne;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        companyActivity = new CompanyActivity();

        submitCompanyButton = findViewById(R.id.submitCompanyButton);
        rewardsButton = findViewById(R.id.rewardsButton);
        companyInputTextView = findViewById(R.id.companyInputTextView);
        blackListOne = findViewById(R.id.blackListOne);
        blackListTwo = findViewById(R.id.blackListTwo);
        blackListThree = findViewById(R.id.blackListThree);

        TypefaceProvider.registerDefaultIconSets();

        blackListOne.setText(companyActivity.getLowest().get(0));
        blackListTwo.setText(companyActivity.getLowest().get(1));
        blackListThree.setText(companyActivity.getLowest().get(2));

        submitCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!companyActivity.getScoreGrade(companyInputTextView.getText().toString()).equals("ERROR")) {
                    Intent myIntent = new Intent(v.getContext(), CompanySummaryActivity.class);
                    myIntent.putExtra("letterGrade", companyActivity.getScoreGrade(companyInputTextView.getText().toString()));
                    myIntent.putExtra("companyName", companyInputTextView.getText().toString());
                    int color;
                    String x = companyInputTextView.getText().toString();
                    if (companyActivity.getScoreNum(x)>60.00) {
                        color = Color.rgb(53, 244, 107);
                    }
                    else if (companyActivity.getScoreNum(x)>48.30) {
                        color = Color.rgb(53, 244, 107);
                    }
                    else if (companyActivity.getScoreNum(x)>43.20) {
                        color = Color.rgb(53, 244, 107);
                    }
                    else if (companyActivity.getScoreNum(x)>38.10) {
                        color = Color.rgb(136, 244, 53);
                    }
                    else if (companyActivity.getScoreNum(x)>31.80) {
                        color = Color.rgb(136, 244, 53);
                    }
                    else if (companyActivity.getScoreNum(x)>27.50) {
                        color = Color.rgb(136, 244, 53);
                    }
                    else if (companyActivity.getScoreNum(x)>20.70) {
                        color = Color.rgb(238, 255, 12);
                    }
                    else if (companyActivity.getScoreNum(x)>15.00) {
                        color = Color.rgb(238, 255, 12);
                    }
                    else if (companyActivity.getScoreNum(x)>9.80) {
                        color = Color.rgb(238, 255, 12);
                    }
                    else if (companyActivity.getScoreNum(x)>5.60) {
                        color = Color.rgb(239, 135, 0);
                    }
                    else if (companyActivity.getScoreNum(x)>3.90) {
                        color = Color.rgb(239, 135, 0);
                    }
                    else if (companyActivity.getScoreNum(x)>0.80) {
                        color = Color.rgb(239, 135, 0);
                    }
                    else color = Color.rgb(194, 1, 4);
                    myIntent.putExtra("color", color);
                    startActivityForResult(myIntent, COMPANY_SUMMARY_REQUEST_CODE);
                } else {
                    Toast.makeText(MainActivity.this, "Company not found!", Toast.LENGTH_SHORT).show();
                }
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
