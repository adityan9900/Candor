package com.helloworld.candor.candor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.beardedhen.androidbootstrap.TypefaceProvider;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;
    final int REWARDS_REQUEST_CODE = 2;
   // final int PROMO_REQUEST_CODE = 3;





    Button submitCompanyButton;
    Button rewardsButton;
    //ImageButton promoOne;



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
