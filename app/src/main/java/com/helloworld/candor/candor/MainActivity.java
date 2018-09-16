package com.helloworld.candor.candor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener{




    private DrawerLayout mDrawerLayout;

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;
    final int REWARDS_REQUEST_CODE = 2;
    final int BAR_REQUEST_CODE = 3;

    Button submitCompanyButton;
    Button rewardsButton;
    TextView companyInputTextView;
    TextView blackListOne, blackListTwo, blackListThree, blackListFour, blackListFive;
    CompanyActivity companyActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);

//

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.bringToFront();
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }

        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );




        //getSupportActionBar().setTitle("Candor");

        companyActivity = new CompanyActivity();

        submitCompanyButton = findViewById(R.id.submitCompanyButton);
        //rewardsButton = findViewById(R.id.rewardsButton);
        companyInputTextView = findViewById(R.id.companyInputTextView);
        blackListOne = findViewById(R.id.blackListOne);
        blackListTwo = findViewById(R.id.blackListTwo);
        blackListThree = findViewById(R.id.blackListThree);
        blackListFour = findViewById(R.id.blackListFour);
        blackListFive = findViewById(R.id.blackListFive);

        TypefaceProvider.registerDefaultIconSets();

        String one = companyActivity.getLowest().get(0);
        String two = companyActivity.getLowest().get(0);
        String three = companyActivity.getLowest().get(0);
        String four = companyActivity.getLowest().get(0);
        String five = companyActivity.getLowest().get(0);

        if(one.length() > 20) {
            one = one.substring(0, 19) + "...";
        } if(two.length() > 20) {
            two = two.substring(0, 19) + "...";
        } if(three.length() > 20) {
            three = three.substring(0, 19) + "...";
        } if(four.length() > 20) {
            four = four.substring(0, 19) + "...";
        } if(five.length() > 20) {
            five = five.substring(0, 19) + "...";
        }

        blackListOne.setText(one);
        blackListTwo.setText(two);
        blackListThree.setText(three);
        blackListFour.setText(four);
        blackListFive.setText(five);

        submitCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!companyActivity.getScoreGrade(companyInputTextView.getText().toString()).equals("ERROR")) {
                    Intent myIntent = new Intent(v.getContext(), CompanySummaryActivity.class);
                    myIntent.putExtra("letterGrade", companyActivity.getScoreGrade(companyInputTextView.getText().toString()));
                    myIntent.putExtra("companyName", companyInputTextView.getText().toString());
                    int color;
                    String x = companyInputTextView.getText().toString();
                    if (companyActivity.getScoreNum(x) > 60.00) {
                        color = Color.rgb(53, 244, 107);
                    } else if (companyActivity.getScoreNum(x) > 48.30) {
                        color = Color.rgb(53, 244, 107);
                    } else if (companyActivity.getScoreNum(x) > 43.20) {
                        color = Color.rgb(53, 244, 107);
                    } else if (companyActivity.getScoreNum(x) > 38.10) {
                        color = Color.rgb(136, 244, 53);
                    } else if (companyActivity.getScoreNum(x) > 31.80) {
                        color = Color.rgb(136, 244, 53);
                    } else if (companyActivity.getScoreNum(x) > 27.50) {
                        color = Color.rgb(136, 244, 53);
                    } else if (companyActivity.getScoreNum(x) > 20.70) {
                        color = Color.rgb(238, 255, 12);
                    } else if (companyActivity.getScoreNum(x) > 15.00) {
                        color = Color.rgb(238, 255, 12);
                    } else if (companyActivity.getScoreNum(x) > 9.80) {
                        color = Color.rgb(238, 255, 12);
                    } else if (companyActivity.getScoreNum(x) > 5.60) {
                        color = Color.rgb(239, 135, 0);
                    } else if (companyActivity.getScoreNum(x) > 3.90) {
                        color = Color.rgb(239, 135, 0);
                    } else if (companyActivity.getScoreNum(x) > 0.80) {
                        color = Color.rgb(239, 135, 0);
                    } else color = Color.rgb(194, 1, 4);
                    myIntent.putExtra("color", color);
                    startActivityForResult(myIntent, COMPANY_SUMMARY_REQUEST_CODE);
                } else {
                    Toast.makeText(MainActivity.this, "Company not found!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.nav_Rewards) {
            System.out.println("HERE REWARDS");
            Intent myIntent = new Intent(MainActivity.this, RewardsActivity.class);
            startActivityForResult(myIntent, 4);
        } else if (id == R.id.nav_gallery) {
            Intent myIntent = new Intent(MainActivity.this, LeaderBoardActivity.class);
            startActivityForResult(myIntent, 5);
        } else if (id == R.id.nav_slideshow) {
            Intent myIntent = new Intent(MainActivity.this, community_activity.class);
            startActivityForResult(myIntent, 6);
        } else if (id == R.id.nav_manage) {
//            Intent myIntent = new Intent(navigationView.getContext(), M.class);
//            startActivityForResult(myIntent, 7);
        }
        // set item as selected to persist highlight
        menuItem.setChecked(true);
        // close drawer when item is tapped
        mDrawerLayout.closeDrawers();

        // Add code here to update the UI based on the item selected
        // For example, swap UI fragments here

        return true;
    }


}
