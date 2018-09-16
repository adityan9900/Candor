package com.helloworld.candor.candor;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CompanySummaryActivity extends AppCompatActivity {

    RelativeLayout gradeLayout;
    String companyName, letterGrade;
    TextView companyNameView, letterGradeView;
    ListView alternativesList;
    int color;

    ArrayAdapter<String> adapter;
    ArrayList<String> test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_summary);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        test = new ArrayList<>();
        test.add("Test1");
        test.add("Test2");
        test.add("Test1");
        test.add("Test2");
        test.add("Test1");
        test.add("Test2");test.add("Test1");
        test.add("Test2");
        test.add("Test1");
        test.add("Test2");
        test.add("Test1");
        test.add("Test2");

        gradeLayout = findViewById(R.id.gradeLayout);
        companyNameView = findViewById(R.id.companyNameView);
        letterGradeView = findViewById(R.id.letterGradeView);
        alternativesList = findViewById(R.id.alternativesList);

        companyName = getIntent().getExtras().get("companyName").toString();
        letterGrade = getIntent().getExtras().get("letterGrade").toString();
        color = (Integer)(getIntent().getExtras().get("color"));

        companyName = companyName.toUpperCase();

        String temp = "";
        for(int i = 0; i < companyName.length(); i ++) {
            temp += companyName.charAt(i) + " ";
        }
        companyName = temp;

        companyNameView.setText(companyName);
        letterGradeView.setText(letterGrade);
        gradeLayout.setBackgroundColor(color);

        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                test);
        alternativesList.setAdapter(adapter);

    }

}
