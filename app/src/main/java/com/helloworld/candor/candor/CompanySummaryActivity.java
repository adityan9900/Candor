package com.helloworld.candor.candor;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CompanySummaryActivity extends AppCompatActivity {

    RelativeLayout gradeLayout;
    String companyName, letterGrade;
    TextView companyNameView, letterGradeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_summary);
        System.out.println(getActionBar());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gradeLayout = findViewById(R.id.gradeLayout);
        gradeLayout.setBackgroundColor(Color.RED);
        companyNameView = findViewById(R.id.companyNameView);
        letterGradeView = findViewById(R.id.letterGradeView);
        companyName = "C O M P A N Y";
        letterGrade = "A+";
        companyNameView.setText(companyName);
        letterGradeView.setText(letterGrade);
    }

}
