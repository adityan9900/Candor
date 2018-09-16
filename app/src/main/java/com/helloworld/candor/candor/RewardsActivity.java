package com.helloworld.candor.candor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

public class RewardsActivity extends AppCompatActivity {



    ImageButton promoOne;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        promoOne = (findViewById(R.id.buttonOne));

        promoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoOne.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonOne).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonOne).setVisibility(View.INVISIBLE);

                }
            }

        });



    }
}
