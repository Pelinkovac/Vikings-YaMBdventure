package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.vikinzi.vikingsyambdventure.GlideApp;
import com.vikinzi.vikingsyambdventure.R;

import java.util.Random;

//import org.w3c.dom.Text;

public class MaxiYamb extends AppCompatActivity implements
        View.OnClickListener {

    //TextView obj for 1. column - down
    TextView down_1;
    TextView down_2;
    TextView down_3;
    TextView down_4;
    TextView down_5;
    TextView down_6;
    TextView down_max;
    TextView down_min;
    TextView down_straight;
    TextView down_three;
    TextView down_full;
    TextView down_poker;
    TextView down_yamb;

    //TextView obj for 2. column - up
    TextView up_1;
    TextView up_2;
    TextView up_3;
    TextView up_4;
    TextView up_5;
    TextView up_6;
    TextView up_max;
    TextView up_min;
    TextView up_straight;
    TextView up_three;
    TextView up_full;
    TextView up_poker;
    TextView up_yamb;

    //TextView obj for 3. column - free
    TextView free_1;
    TextView free_2;
    TextView free_3;
    TextView free_4;
    TextView free_5;
    TextView free_6;
    TextView free_max;
    TextView free_min;
    TextView free_straight;
    TextView free_three;
    TextView free_full;
    TextView free_poker;
    TextView free_yamb;

    //TextView obj for 4. column - hand
    TextView hand_1;
    TextView hand_2;
    TextView hand_3;
    TextView hand_4;
    TextView hand_5;
    TextView hand_6;
    TextView hand_max;
    TextView hand_min;
    TextView hand_straight;
    TextView hand_three;
    TextView hand_full;
    TextView hand_poker;
    TextView hand_yamb;

    //TextView obj for 5. column - from center
    TextView center_1;
    TextView center_2;
    TextView center_3;
    TextView center_4;
    TextView center_5;
    TextView center_6;
    TextView center_max;
    TextView center_min;
    TextView center_straight;
    TextView center_three;
    TextView center_full;
    TextView center_poker;
    TextView center_yamb;

    //TextView obj for 6. column - from sides
    TextView sides_1;
    TextView sides_2;
    TextView sides_3;
    TextView sides_4;
    TextView sides_5;
    TextView sides_6;
    TextView sides_max;
    TextView sides_min;
    TextView sides_straight;
    TextView sides_three;
    TextView sides_full;
    TextView sides_poker;
    TextView sides_yamb;

    ImageView dice1;
    ImageView dice2;
    ImageView dice3;
    ImageView dice4;
    ImageView dice5;
    ImageView dice6;
    ImageView play;
    ImageView profile;

//    Down Down;

    //Arrays for TextViews values of all columns
    int count = 13;
    int[] arrayDown, arrayUp, arrayFree, arrayHand, arrayCenter, arraySides, arrayDicesValue;
    boolean[] arrayDicesState;
    int numOfThrows = 0;
    //   boolean played = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxi_yamb);

        initLayout();
        initListeners();
        initData();
    }

    private void initLayout() {
        down_1 = (TextView) findViewById(R.id.down_1);
        down_2 = (TextView) findViewById(R.id.down_2);
        down_3 = (TextView) findViewById(R.id.down_3);
        down_4 = (TextView) findViewById(R.id.down_4);
        down_5 = (TextView) findViewById(R.id.down_5);
        down_6 = (TextView) findViewById(R.id.down_6);
        down_max = (TextView) findViewById(R.id.down_max);
        down_min = (TextView) findViewById(R.id.down_min);
        down_straight = (TextView) findViewById(R.id.down_straight);
        down_three = (TextView) findViewById(R.id.down_three);
        down_full = (TextView) findViewById(R.id.down_full);
        down_poker = (TextView) findViewById(R.id.down_poker);
        down_yamb = (TextView) findViewById(R.id.down_yamb);

        up_1 = (TextView) findViewById(R.id.up_1);
        up_2 = (TextView) findViewById(R.id.up_2);
        up_3 = (TextView) findViewById(R.id.up_3);
        up_4 = (TextView) findViewById(R.id.up_4);
        up_5 = (TextView) findViewById(R.id.up_5);
        up_6 = (TextView) findViewById(R.id.up_6);
        up_max = (TextView) findViewById(R.id.up_max);
        up_min = (TextView) findViewById(R.id.up_min);
        up_straight = (TextView) findViewById(R.id.up_straight);
        up_three = (TextView) findViewById(R.id.up_three);
        up_full = (TextView) findViewById(R.id.up_full);
        up_poker = (TextView) findViewById(R.id.up_poker);
        up_yamb = (TextView) findViewById(R.id.up_yamb);

        free_1 = (TextView) findViewById(R.id.free_1);
        free_2 = (TextView) findViewById(R.id.free_2);
        free_3 = (TextView) findViewById(R.id.free_3);
        free_4 = (TextView) findViewById(R.id.free_4);
        free_5 = (TextView) findViewById(R.id.free_5);
        free_6 = (TextView) findViewById(R.id.free_6);
        free_max = (TextView) findViewById(R.id.free_max);
        free_min = (TextView) findViewById(R.id.free_min);
        free_straight = (TextView) findViewById(R.id.free_straight);
        free_three = (TextView) findViewById(R.id.free_three);
        free_full = (TextView) findViewById(R.id.free_full);
        free_poker = (TextView) findViewById(R.id.free_poker);
        free_yamb = (TextView) findViewById(R.id.free_yamb);

        hand_1 = (TextView) findViewById(R.id.hand_1);
        hand_2 = (TextView) findViewById(R.id.hand_2);
        hand_3 = (TextView) findViewById(R.id.hand_3);
        hand_4 = (TextView) findViewById(R.id.hand_4);
        hand_5 = (TextView) findViewById(R.id.hand_5);
        hand_6 = (TextView) findViewById(R.id.hand_6);
        hand_max = (TextView) findViewById(R.id.hand_max);
        hand_min = (TextView) findViewById(R.id.hand_min);
        hand_straight = (TextView) findViewById(R.id.hand_straight);
        hand_three = (TextView) findViewById(R.id.hand_three);
        hand_full = (TextView) findViewById(R.id.hand_full);
        hand_poker = (TextView) findViewById(R.id.hand_poker);
        hand_yamb = (TextView) findViewById(R.id.hand_yamb);

        center_1 = (TextView) findViewById(R.id.center_1);
        center_2 = (TextView) findViewById(R.id.center_2);
        center_3 = (TextView) findViewById(R.id.center_3);
        center_4 = (TextView) findViewById(R.id.center_4);
        center_5 = (TextView) findViewById(R.id.center_5);
        center_6 = (TextView) findViewById(R.id.center_6);
        center_max = (TextView) findViewById(R.id.center_max);
        center_min = (TextView) findViewById(R.id.center_min);
        center_straight = (TextView) findViewById(R.id.center_straight);
        center_three = (TextView) findViewById(R.id.center_three);
        center_full = (TextView) findViewById(R.id.center_full);
        center_poker = (TextView) findViewById(R.id.center_poker);
        center_yamb = (TextView) findViewById(R.id.center_yamb);

        sides_1 = (TextView) findViewById(R.id.sides_1);
        sides_2 = (TextView) findViewById(R.id.sides_2);
        sides_3 = (TextView) findViewById(R.id.sides_3);
        sides_4 = (TextView) findViewById(R.id.sides_4);
        sides_5 = (TextView) findViewById(R.id.sides_5);
        sides_6 = (TextView) findViewById(R.id.sides_6);
        sides_max = (TextView) findViewById(R.id.sides_max);
        sides_min = (TextView) findViewById(R.id.sides_min);
        sides_straight = (TextView) findViewById(R.id.sides_straight);
        sides_three = (TextView) findViewById(R.id.sides_three);
        sides_full = (TextView) findViewById(R.id.sides_full);
        sides_poker = (TextView) findViewById(R.id.sides_poker);
        sides_yamb = (TextView) findViewById(R.id.sides_yamb);

        dice1 = (ImageView) findViewById(R.id.dice1);
        dice2 = (ImageView) findViewById(R.id.dice2);
        dice3 = (ImageView) findViewById(R.id.dice3);
        dice4 = (ImageView) findViewById(R.id.dice4);
        dice5 = (ImageView) findViewById(R.id.dice5);
        dice6 = (ImageView) findViewById(R.id.dice6);

        play = (ImageView) findViewById(R.id.play);
        profile = (ImageView) findViewById(R.id.profile);
    }

    private void initListeners() {
        down_1.setOnClickListener(this);
        down_2.setOnClickListener(this);
        down_3.setOnClickListener(this);
        down_4.setOnClickListener(this);
        down_5.setOnClickListener(this);
        down_6.setOnClickListener(this);
        down_max.setOnClickListener(this);
        down_min.setOnClickListener(this);
        down_straight.setOnClickListener(this);
        down_three.setOnClickListener(this);
        down_full.setOnClickListener(this);
        down_poker.setOnClickListener(this);
        down_yamb.setOnClickListener(this);

        up_1.setOnClickListener(this);
        up_2.setOnClickListener(this);
        up_3.setOnClickListener(this);
        up_4.setOnClickListener(this);
        up_5.setOnClickListener(this);
        up_6.setOnClickListener(this);
        up_max.setOnClickListener(this);
        up_min.setOnClickListener(this);
        up_straight.setOnClickListener(this);
        up_three.setOnClickListener(this);
        up_full.setOnClickListener(this);
        up_poker.setOnClickListener(this);
        up_yamb.setOnClickListener(this);

        free_1.setOnClickListener(this);
        free_2.setOnClickListener(this);
        free_3.setOnClickListener(this);
        free_4.setOnClickListener(this);
        free_5.setOnClickListener(this);
        free_6.setOnClickListener(this);
        free_max.setOnClickListener(this);
        free_min.setOnClickListener(this);
        free_straight.setOnClickListener(this);
        free_three.setOnClickListener(this);
        free_full.setOnClickListener(this);
        free_poker.setOnClickListener(this);
        free_yamb.setOnClickListener(this);

        hand_1.setOnClickListener(this);
        hand_2.setOnClickListener(this);
        hand_3.setOnClickListener(this);
        hand_4.setOnClickListener(this);
        hand_5.setOnClickListener(this);
        hand_6.setOnClickListener(this);
        hand_max.setOnClickListener(this);
        hand_min.setOnClickListener(this);
        hand_straight.setOnClickListener(this);
        hand_three.setOnClickListener(this);
        hand_full.setOnClickListener(this);
        hand_poker.setOnClickListener(this);
        hand_yamb.setOnClickListener(this);

        center_1.setOnClickListener(this);
        center_2.setOnClickListener(this);
        center_3.setOnClickListener(this);
        center_4.setOnClickListener(this);
        center_5.setOnClickListener(this);
        center_6.setOnClickListener(this);
        center_max.setOnClickListener(this);
        center_min.setOnClickListener(this);
        center_straight.setOnClickListener(this);
        center_three.setOnClickListener(this);
        center_full.setOnClickListener(this);
        center_poker.setOnClickListener(this);
        center_yamb.setOnClickListener(this);

        sides_1.setOnClickListener(this);
        sides_2.setOnClickListener(this);
        sides_3.setOnClickListener(this);
        sides_4.setOnClickListener(this);
        sides_5.setOnClickListener(this);
        sides_6.setOnClickListener(this);
        sides_max.setOnClickListener(this);
        sides_min.setOnClickListener(this);
        sides_straight.setOnClickListener(this);
        sides_three.setOnClickListener(this);
        sides_full.setOnClickListener(this);
        sides_poker.setOnClickListener(this);
        sides_yamb.setOnClickListener(this);

        dice1.setOnClickListener(this);
        dice2.setOnClickListener(this);
        dice3.setOnClickListener(this);
        dice4.setOnClickListener(this);
        dice5.setOnClickListener(this);
        dice6.setOnClickListener(this);

        play.setOnClickListener(this);
        profile.setOnClickListener(this);

    }

    private void initData()
    {
        arrayDown = new int[count];
        arrayUp = new int[count];
        arrayFree = new int[count];
        arrayHand = new int[count];
        arrayCenter = new int[count];
        arraySides = new int[count];

        for (int i = 0; i < count; i++) {
            arrayHand[i] = -1;
            arrayFree[i] = -1;
            arrayUp[i] = -1;
            arrayDown[i] = -1;
            arrayCenter[i] = -1;
            arraySides[i] = -1;
        }

        arrayDicesValue = new int[6];
        arrayDicesState = new boolean[6];
//        for(int i = 0; i < 6; i++) {
//            arrayDicesState[i] = true;
//            arrayDicesValue[i] = 0;
//        }
        played();

    }

    public void down(int i, TextView textView) {
        if(i == 0){
            arrayDown[0] = returnSumOfDices();
            textView.setText(String.valueOf(arrayDown[0]));
            played();
        }
        else if(arrayDown[i-1] != -1){
            arrayDown[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayDown[i]));
            played();
        }
    }

    public void up(int i, TextView textView) {
        if (i == 12) {
            arrayUp[12] = returnSumOfDices();
            textView.setText(String.valueOf(arrayUp[12]));
            textView.setClickable(false);
            played();
        }
        else if (arrayUp[i + 1] != -1) {
            arrayUp[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayUp[i]));
            played();
        }

    }

    public void free(int i, TextView textView) {
            arrayFree[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayFree[i]));
            played();
    }

    public void hand(int i, TextView textView) {
        if ((arrayHand[i] == -1) && (numOfThrows == 1)) {
            arrayHand[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayHand[i]));
            played();
        }
    }

    //nagore 6,5,4,3,2,1,0
    //nadole 7,8,9,10,11,12
    public void centerUp(int i, TextView textView)
    {
        if(i == 6)
        {
            arrayCenter[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayCenter[i]));
            played();
        }
        else if(arrayCenter[i + 1] != -1)
        {
            arrayCenter[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayCenter[i]));
            played();
        }
    }
    public void centerDown(int i, TextView textView)
    {
        if(i==7)
        {
            arrayCenter[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayCenter[i]));
            played();
        }
        else if(arrayCenter[i - 1] != -1)
        {
            arrayCenter[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayCenter[i]));
            played();
        }
    }

    //nadole 0,1,2,3,4,5,6
    //nagore 12,11,10,9,8,7
    public void sidesDown(int i, TextView textView)
    {
        if(i==0)
        {
            arraySides[i] = returnSumOfDices();
            textView.setText(String.valueOf(arraySides[i]));
            played();
        }
        else if(arraySides[i - 1] != -1)
        {
            arraySides[i] = returnSumOfDices();
            textView.setText(String.valueOf(arraySides[i]));
            played();
        }
    }

    public void sidesUp(int i, TextView textView)
    {
        if(i == 12)
        {
            arraySides[i] = returnSumOfDices();
            textView.setText(String.valueOf(arraySides[i]));
            played();
        }
        else if(arraySides[i + 1] != -1)
        {
            arraySides[i] = returnSumOfDices();
            textView.setText(String.valueOf(arraySides[i]));
            played();
        }
    }

    //reset values after writing in field and sets dices
    public void played()
    {
        numOfThrows = 0;
        for(int i=0; i<6; i++)
        {
            arrayDicesState[i]=true;
            arrayDicesValue[i]=0;
        }
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice1);
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice2);
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice3);
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice4);
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice5);
        GlideApp.with(MaxiYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice6);
        GlideApp.with(MaxiYamb.this).load(R.drawable.play).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(play);
        firstTurn = false;
    }

    public void random(ImageView imageView, int i) {
        Random rand = new Random();
        int n = rand.nextInt(6)+1;

        try {
            if (arrayDicesState[i] && imageView != null) {
                switch (n) {
                    case 1: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 2: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 3: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 4: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 5: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 6: {
                        GlideApp.with(MaxiYamb.this).load(R.drawable.orange6).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                }
                arrayDicesValue[i] = n;
            }
        }
        catch (OutOfMemoryError | Exception e)
        {
            //
        }
    }


    public int returnSumOfDices()
    {
        int sum=0;
        for(int i=0;i<6;i++)
        {
            if(!arrayDicesState[i])
            {
                sum+=arrayDicesValue[i];
            }
        }
        return sum;

    }


    public void swapDice(ImageView imageView, int i)
    {
        try
        {
            if(firstTurn) {
                if (!arrayDicesState[i]) {
                    arrayDicesState[i] = true;
                    switch (arrayDicesValue[i]) {
                        case 1:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 2:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 3:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 4:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 5:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 6:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.orange6).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                    }

                } else {
                    arrayDicesState[i] = false;
                    switch (arrayDicesValue[i]) {

                        case 1:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 2:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 3:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 4:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 5:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 6:
                            GlideApp.with(MaxiYamb.this).load(R.drawable.red6).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                    }
                }
            }
        }
        catch (OutOfMemoryError | Exception e)
        {
            //
        }
    }
    private boolean firstTurn = false;
    public void swapPlay(ImageView imageView)
    {
        numOfThrows++;
        try
        {
//            if(numOfThrows == 0)
//            {
//                numOfThrows++;
//                GlideApp.with(MaxiYamb.this).load(R.drawable.play).into(imageView);
//            }
            if(numOfThrows == 1)
            {
                GlideApp.with(MaxiYamb.this).load(R.drawable.play1).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
                firstTurn = true;
            }
            if(numOfThrows == 2)
            {
                GlideApp.with(MaxiYamb.this).load(R.drawable.play2).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
            }
            if(numOfThrows == 3)
            {
                GlideApp.with(MaxiYamb.this).load(R.drawable.play3).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
                numOfThrows=0;
            }

//            if (numOfThrows == 2) {
//                numOfThrows = 0;
//                GlideApp.with(MaxiYamb.this).load(R.drawable.play1).into(imageView);
//            } else if (numOfThrows == 1) {
//                numOfThrows++;
//                GlideApp.with(MaxiYamb.this).load(R.drawable.play3).into(imageView);
//            } else if (numOfThrows == 0) {
//                numOfThrows++;
//                GlideApp.with(MaxiYamb.this).load(R.drawable.play2).into(imageView);
//            }
            if (arrayDicesState[0])
                random(dice1, 0);
            if (arrayDicesState[1])
                random(dice2, 1);
            if (arrayDicesState[2])
                random(dice3, 2);
            if (arrayDicesState[3])
                random(dice4, 3);
            if (arrayDicesState[4])
                random(dice5, 4);
            if (arrayDicesState[5])
                random(dice6, 5);
        }
        catch (OutOfMemoryError | Exception e)
        {
            //
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            // 2. column - down
            case R.id.down_1:
                //todo URADI ZA SVE
                if(arrayDown[0] == -1)
                    down( 0, down_1);
                break;

            case R.id.down_2:
                if(arrayDown[1] == -1)
                    down( 1, down_2);
                break;

            case R.id.down_3:
                if(arrayDown[2] == -1)
                    down( 2, down_3);
                break;

            case R.id.down_4:
                if(arrayDown[3] == -1)
                    down( 3, down_4);
                break;

            case R.id.down_5:
                if(arrayDown[4] == -1)
                    down( 4, down_5);
                break;

            case R.id.down_6:
                if(arrayDown[5] == -1)
                    down( 5, down_6);
                break;

            case R.id.down_max:
                if(arrayDown[6] == -1)
                    down( 6, down_max);
                break;

            case R.id.down_min:
                if(arrayDown[7] == -1)
                    down( 7, down_min);
                break;
            case R.id.down_straight:
                if(arrayDown[8] == -1)
                    down( 8, down_straight);
                break;

            case R.id.down_three:
                if(arrayDown[9] == -1)
                    down( 9, down_three);
                break;

            case R.id.down_full:
                if(arrayDown[10] == -1)
                    down( 10, down_full);
                break;

            case R.id.down_poker:
                if(arrayDown[11] == -1)
                    down( 11, down_poker);
                break;

            case R.id.down_yamb:
                if(arrayDown[12] == -1)
                    down( 12, down_yamb);
                break;

            // 3. column - up
            case R.id.up_1:
                if(arrayUp[0] == -1)
                    up( 0, up_1);
                break;

            case R.id.up_2:
                if(arrayUp[1] == -1)
                    up( 1, up_2);
                break;

            case R.id.up_3:
                if(arrayUp[2] == -1)
                    up( 2, up_3);
                break;

            case R.id.up_4:
                if(arrayUp[3] == -1)
                    up( 3, up_4);
                break;

            case R.id.up_5:
                if(arrayUp[4] == -1)
                    up( 4, up_5);
                break;

            case R.id.up_6:
                if(arrayUp[5] == -1)
                    up( 5, up_6);
                break;

            case R.id.up_max:
                if(arrayUp[6] == -1)
                    up( 6, up_max);
                break;

            case R.id.up_min:
                if(arrayUp[7] == -1)
                    up( 7, up_min);
                break;

            case R.id.up_straight:
                if(arrayUp[8] == -1)
                    up( 8, up_straight);
                break;

            case R.id.up_three:
                if(arrayUp[9] == -1)
                    up( 9, up_three);
                break;

            case R.id.up_full:
                if(arrayUp[10] == -1)
                    up( 10, up_full);
                break;

            case R.id.up_poker:
                if(arrayUp[11] == -1)
                    up( 11, up_poker);
                break;

            case R.id.up_yamb:
                if(arrayUp[12] == -1)
                    up( 12, up_yamb);
                break;

            // 3. column - free
            case R.id.free_1:
                if(arrayFree[0] == -1)
                    free( 0, free_1);
                break;

            case R.id.free_2:
                if(arrayFree[1] == -1)
                    free( 1, free_2);
                break;

            case R.id.free_3:
                if(arrayFree[2] == -1)
                    free( 2, free_3);
                break;

            case R.id.free_4:
                if(arrayFree[3] == -1)
                    free( 3, free_4);
                break;

            case R.id.free_5:
                if(arrayFree[4] == -1)
                    free( 4, free_5);
                break;

            case R.id.free_6:
                if(arrayFree[5] == -1)
                    free( 5, free_6);
                break;

            case R.id.free_max:
                if(arrayFree[6] == -1)
                    free( 6, free_max);
                break;

            case R.id.free_min:
                if(arrayFree[7] == -1)
                    free( 7, free_min);
                break;

            case R.id.free_straight:
                if(arrayFree[8] == -1)
                    free( 8, free_straight);
                break;

            case R.id.free_three:
                if(arrayFree[9] == -1)
                    free( 9, free_three);
                break;

            case R.id.free_full:
                if(arrayFree[10] == -1)
                    free( 10, free_full);
                break;

            case R.id.free_poker:
                if(arrayFree[11] == -1)
                    free( 11, free_poker);
                break;

            case R.id.free_yamb:
                if(arrayFree[12] == -1)
                    free( 12, free_yamb);
                break;

            // 4. column - hand
            case R.id.hand_1:
                if(arrayHand[0] == -1)
                    hand( 0, hand_1);
                break;

            case R.id.hand_2:
                if(arrayHand[1] == -1)
                    hand( 1, hand_2);
                break;

            case R.id.hand_3:
                if(arrayHand[2] == -1)
                    hand( 2, hand_3);
                break;

            case R.id.hand_4:
                if(arrayHand[3] == -1)
                    hand( 3, hand_4);
                break;

            case R.id.hand_5:
                if(arrayHand[4] == -1)
                    hand( 4, hand_5);
                break;

            case R.id.hand_6:
                if(arrayHand[5] == -1)
                    hand( 5, hand_6);
                break;

            case R.id.hand_max:
                if(arrayHand[6] == -1)
                    hand( 6, hand_max);
                break;

            case R.id.hand_min:
                if(arrayHand[7] == -1)
                    hand( 7, hand_min);
                break;

            case R.id.hand_straight:
                if(arrayHand[8] == -1)
                    hand( 8, hand_straight);
                break;

            case R.id.hand_three:
                if(arrayHand[9] == -1)
                    hand( 9, hand_three);
                break;

            case R.id.hand_full:
                if(arrayHand[10] == -1)
                    hand( 10, hand_full);
                break;

            case R.id.hand_poker:
                if(arrayHand[11] == -1)
                    hand( 11, hand_poker);
                break;

            case R.id.hand_yamb:
                if(arrayHand[12] == -1)
                    hand( 12, hand_yamb);
                break;

            // 5. column - center (from center to sides)
            case R.id.center_1:
                if(arrayCenter[0] == -1)
                    centerUp( 0, center_1);
                break;

            case R.id.center_2:
                if(arrayCenter[1] == -1)
                    centerUp( 1, center_2);
                break;

            case R.id.center_3:
                if(arrayCenter[2] == -1)
                    centerUp( 2, center_3);
                break;

            case R.id.center_4:
                if(arrayCenter[3] == -1)
                    centerUp( 3, center_4);
                break;

            case R.id.center_5:
                if(arrayCenter[4] == -1)
                    centerUp( 4, center_5);
                break;

            case R.id.center_6:
                if(arrayCenter[5] == -1)
                    centerUp( 5, center_6);
                break;

            case R.id.center_max:
                if(arrayCenter[6] == -1)
                    centerUp( 6, center_max);
                break;

            case R.id.center_min:
                if(arrayCenter[7] == -1)
                    centerDown( 7, center_min);
                break;

            case R.id.center_straight:
                if(arrayCenter[8] == -1)
                    centerDown( 8, center_straight);
                break;

            case R.id.center_three:
                if(arrayCenter[9] == -1)
                    centerDown( 9, center_three);
                break;

            case R.id.center_full:
                if(arrayCenter[10] == -1)
                    centerDown( 10, center_full);
                break;

            case R.id.center_poker:
                if(arrayCenter[11] == -1)
                    centerDown( 11, center_poker);
                break;

            case R.id.center_yamb:
                if(arrayCenter[12] == -1)
                    centerDown( 12, center_yamb);
                break;

            // 6. column - side (from sides to center)
            case R.id.sides_1:
                if(arraySides[0] == -1)
                    sidesDown( 0, sides_1);
                break;

            case R.id.sides_2:
                if(arraySides[1] == -1)
                    sidesDown( 1, sides_2);
                break;

            case R.id.sides_3:
                if(arraySides[2] == -1)
                    sidesDown( 2, sides_3);
                break;

            case R.id.sides_4:
                if(arraySides[3] == -1)
                    sidesDown( 3, sides_4);
                break;

            case R.id.sides_5:
                if(arraySides[4] == -1)
                    sidesDown( 4, sides_5);
                break;

            case R.id.sides_6:
                if(arraySides[5] == -1)
                    sidesDown( 5, sides_6);
                break;

            case R.id.sides_max:
                if(arraySides[6] == -1)
                    sidesDown( 6, sides_max);
                break;

            case R.id.sides_min:
                if(arraySides[7] == -1)
                    sidesUp( 7, sides_min);
                break;

            case R.id.sides_straight:
                if(arraySides[8] == -1)
                    sidesUp( 8, sides_straight);
                break;

            case R.id.sides_three:
                if(arraySides[9] == -1)
                    sidesUp( 9, sides_three);
                break;

            case R.id.sides_full:
                if(arraySides[10] == -1)
                    sidesUp( 10, sides_full);
                break;

            case R.id.sides_poker:
                if(arraySides[11] == -1)
                    sidesUp( 11, sides_poker);
                break;

            case R.id.sides_yamb:
                if(arraySides[12] == -1)
                    sidesUp( 12, sides_yamb);
                break;

            // Dices
            case R.id.dice1:
                swapDice(dice1, 0);
                break;

            case R.id.dice2:
                swapDice(dice2, 1);
                break;

            case R.id.dice3:
                swapDice(dice3, 2);
                break;

            case R.id.dice4:
                swapDice(dice4, 3);
                break;

            case R.id.dice5:
                swapDice(dice5, 4);
                break;

            case R.id.dice6:
                swapDice(dice6, 5);
                break;

            case R.id.play:
                swapPlay(play);
                break;

            case R.id.profile:
                Intent i;
                i = new Intent(MaxiYamb.this, MaxiYambOpponent.class);
                startActivity(i);
                break;
        }
    }
}
