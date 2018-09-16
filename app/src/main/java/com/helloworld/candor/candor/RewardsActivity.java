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













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        promoOne = (findViewById(R.id.buttonOne));
        revertOne = (findViewById(R.id.promoCode));

        promoTwo = (findViewById(R.id.buttonTwo));
        revertTwo = (findViewById(R.id.promoCodeTwo));

        promoThree = (findViewById(R.id.buttonThree));
        revertThree = (findViewById(R.id.promoCodeThree));

        promoFour = (findViewById(R.id.buttonFour));
        revertFour = (findViewById(R.id.promoCodeFour));

        promoFive = (findViewById(R.id.buttonFive));
        revertFive = (findViewById(R.id.promoCodeFive));

        promoSix = (findViewById(R.id.buttonSix));
        revertSix = (findViewById(R.id.buttonSix));

        promoSeven = (findViewById(R.id.buttonSeven));
        revertSeven = (findViewById(R.id.buttonSeven));


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

        promoTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoTwo.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonTwo).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonTwo).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoTwo.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonTwo).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonTwo).setVisibility(View.INVISIBLE);
                }
            }

        });

        promoThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoThree.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonThree).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonThree).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoThree.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonThree).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonThree).setVisibility(View.INVISIBLE);
                }
            }



        });

        promoFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoFour.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonFour).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonFour).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoFour.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonFour).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonFour).setVisibility(View.INVISIBLE);
                }
            }

        });

        promoFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoFive.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonFive).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonFive).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoFive.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonFive).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonFive).setVisibility(View.INVISIBLE);
                }
            }

        });

        promoSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoSix.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonSix).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonSix).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoSix.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonSix).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonSix).setVisibility(View.INVISIBLE);
                }
            }

        });

        promoSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int tester=counter;
                if(promoSeven.getVisibility()== View.INVISIBLE) {
                    findViewById(R.id.buttonSeven).setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.buttonSeven).setVisibility(View.INVISIBLE);

                }
            }

        });

        revertSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(promoSeven.getVisibility()==View.INVISIBLE) {
                    findViewById(R.id.buttonSeven).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.buttonSeven).setVisibility(View.INVISIBLE);
                }
            }

        });
}
}
