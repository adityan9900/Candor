package com.helloworld.candor.candor;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CompanySummaryActivity extends AppCompatActivity {

    RelativeLayout gradeLayout;
    String companyName, letterGrade;
    TextView companyNameView, letterGradeView;
    ListView alternativesList;
    ImageButton moreInformationButton;
    int color;
    CompanyActivity companyActivity;

    final int MORE_INFO_REQUEST_CODE = 3;

    ArrayAdapter<String> adapter;
    ArrayList<String> test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_summary);

        companyActivity = new CompanyActivity();

        gradeLayout = findViewById(R.id.gradeLayout);
        companyNameView = findViewById(R.id.companyNameView);
        letterGradeView = findViewById(R.id.letterGradeView);
        alternativesList = findViewById(R.id.alternativesList);
        moreInformationButton = findViewById(R.id.moreInfoButton);

        companyName = getIntent().getExtras().get("companyName").toString();
        letterGrade = getIntent().getExtras().get("letterGrade").toString();
        color = (Integer)(getIntent().getExtras().get("color"));
        test = companyActivity.getPotentialAlt(companyName);

        String temp = "";
        for(int i = 0; i < companyName.length(); i ++) {
            temp += (companyName.charAt(i) + " ").toUpperCase();
        }

        if(temp.length() > 26) {
            companyNameView.setText(temp.substring(0, 23) + "...");
        } else {
            companyNameView.setText(temp);
        }
        letterGradeView.setText(letterGrade);
        gradeLayout.setBackgroundColor(color);

//        adapter = new ArrayAdapter<String>(getApplicationContext(),
//                android.R.layout.simple_list_item_1,
//                test);
        //alternativesList.setAdapter(adapter);

        alternativesList.setAdapter(new CustomAdapter(test, getApplicationContext()));

        //getSupportActionBar().setTitle("Company Summary");

        moreInformationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), MoreInformationActivity.class);
                myIntent.putExtra("companyName", companyName);
                myIntent.putExtra("color", color);
                myIntent.putExtra("letterGrade", letterGrade);
                startActivityForResult(myIntent, MORE_INFO_REQUEST_CODE);
            }
        });

        alternativesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(view.getContext(), CompanySummaryActivity.class);
                String compName = test.get(position);
                myIntent.putExtra("companyName", compName);
                myIntent.putExtra("letterGrade", companyActivity.getScoreGrade(compName));
                myIntent.putExtra("color", companyActivity.getColorByName(compName));
                startActivityForResult(myIntent, 2);
            }
        });

    }

}

class CustomAdapter extends ArrayAdapter<String> implements View.OnClickListener{

    private ArrayList<String> dataSet;
    Context mContext;
    CompanyActivity companyActivity = new CompanyActivity();

    // View lookup cache
    private static class ViewHolder {
        TextView compName;
        RelativeLayout gradeLayout;
    }

    public CustomAdapter(ArrayList<String> data, Context context) {
        super(context, R.layout.row_main, data);
        this.dataSet = data;
        this.mContext = context;

    }

    @Override
    public void onClick(View v) {

        int position = (Integer) v.getTag();
        Object object = getItem(position);
        String compName = (String)object;
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String compName = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_main, parent, false);
            viewHolder.compName = (TextView) convertView.findViewById(R.id.companyName);
            viewHolder.gradeLayout = (RelativeLayout) convertView.findViewById(R.id.gradeColor);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

//        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.layout.up_from_bottom : R.layout.down_from_top);
//        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.gradeLayout.setBackgroundColor(companyActivity.getColorByName(compName.toLowerCase()));
        if(compName.length() > 15) {
            compName = compName.substring(0, 13) + "...";
        }
        compName = companyActivity.makeUpper(compName);
        viewHolder.compName.setText(compName);
        // Return the completed view to render on screen
        return convertView;
    }
}
