package com.helloworld.candor.candor;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.helloworld.candor.candor.Adapters.CustomExpandableListAdapter;
import com.helloworld.candor.candor.Helper.FragmentNavigationManager;
import com.helloworld.candor.candor.Interface.NavigationManager;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity {

    final int COMPANY_SUMMARY_REQUEST_CODE = 1;
    final int REWARDS_REQUEST_CODE = 2;
    // final int PROMO_REQUEST_CODE = 3;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private String mActivityTitle;
    private String[] items;

    private ExpandableListView expandableListView;
    private ExpandableListAdapter adapter;
    private List<String> lstTitle;
    private Map<String,List<String>> lstChild;
    private NavigationManager navigationManager;






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

        mDrawerLayout= (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        expandableListView = (ExpandableListView)findViewById(R.id.navList);
        navigationManager = FragmentNavigationManager.getmInstance(this);

        initItems();

        View listHeaderView = getLayoutInflater().inflate(R.layout.nav_header, null, false);
        expandableListView.addHeaderView(listHeaderView);

        genData();

        addDrawersItem();
        setupDrawer();

        if(savedInstanceState==null)
            selectFirstItemAsDefault();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Menu");




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

        rewardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), RewardsActivity.class);
                startActivityForResult(myIntent, REWARDS_REQUEST_CODE);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(mDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    public void genData(){

        List<String> title = Arrays.asList("Activites");
        List<String> childitem = Arrays.asList("Home","Rewards","Friends", "Community");

        lstChild = new TreeMap<>();
        lstChild.put(title.get(0),childitem);

        lstTitle = new ArrayList<>(lstChild.keySet());

    }

    private void initItems(){

         items = new String[1];

    }

    private void addDrawersItem(){

        adapter = new CustomExpandableListAdapter(this, lstTitle, lstChild);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                getSupportActionBar().setTitle(lstTitle.get(groupPosition).toString());

            }
        });
            expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
                @Override
                public void onGroupCollapse(int groupPosition) {
                    getSupportActionBar().setTitle("Menu");
                }
            });
            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                    String selectedItem= ((List)(lstChild.get(lstTitle.get(groupPosition))))
                    .get(childPosition).toString();

                    getSupportActionBar().setTitle(selectedItem);

                    if(items[0].equals(lstTitle.get(groupPosition)))
                        navigationManager.showFragment(selectedItem);
                    else
                        throw new IllegalArgumentException("Not Supported Fragment");

                    mDrawerLayout.closeDrawer(GravityCompat.START);




                    return false;
                }
            });
    }

    private void setupDrawer(){

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close)
        {
            @Override
            public void onDrawerOpened(View drawerView){
                super.onDrawerOpened(drawerView);
                //getSupportActionBar().setTitle("Menu");
                invalidateOptionsMenu();
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                //getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu();

            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);

    }

    private void selectFirstItemAsDefault(){
        if(navigationManager != null)
        {
            String firstItem = lstTitle.get(0);
            navigationManager.showFragment(firstItem);
            getSupportActionBar().setTitle(firstItem);
        }
    }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);

    }

}
