package com.helloworld.candor.candor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

public class RewardsActivity extends AppCompatActivity {



    ImageButton promoOne;
    ImageButton revertOne;
    ImageButton promoTwo;
    ImageButton revertTwo;
    ImageButton promoThree;
    ImageButton revertThree;
    ImageButton promoFour;
    ImageButton revertFour;
    ImageButton promoFive;
    ImageButton revertFive;
    ImageButton promoSix;
    ImageButton revertSix;
    ImageButton promoSeven;
    ImageButton revertSeven;
    ImageButton PromoEight;
    ImageButton revertEight;


    









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        promoOne = (findViewById(R.id.buttonOne));
        revertOne = (findViewById(R.id.promoCode));


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

        revertOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoOne.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonOne).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonOne).setVisibility(View.INVISIBLE);
            }
        }

    });
}
}
