package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.vikinzi.vikingsyambdventure.GlideApp;
import com.vikinzi.vikingsyambdventure.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class MiniYamb extends AppCompatActivity  implements
        View.OnClickListener, TextWatcher {
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

    //sum
    TextView down_sum1;
    TextView down_sum2;
    TextView down_sum3;
    TextView up_sum1;
    TextView up_sum2;
    TextView up_sum3;
    TextView free_sum1;
    TextView free_sum2;
    TextView free_sum3;
    TextView hand_sum1;
    TextView hand_sum2;
    TextView hand_sum3;
    TextView yamb_sum1;
    TextView yamb_sum2;
    TextView yamb_sum3;
    TextView yamb_sumtotal;

    ImageView dice1;
    ImageView dice2;
    ImageView dice3;
    ImageView dice4;
    ImageView dice5;
    ImageView dice6;
    ImageView play;
    ImageView profile;

 //   private View p;
 //   private MiniYamb (View view){
 //       this.p = view;
 //   }

//    Down Down;

    //Arrays for TextViews values of all columns
    int count = 13;
    int[] arrayDown, arrayUp, arrayFree, arrayHand, arrayDicesValue;
    boolean[] arrayDicesState;
    int numOfThrows = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_yamb);

        initLayout();
        initListeners();
        initData();
        initText();
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

        down_sum1 = (TextView) findViewById(R.id.down_sum1);
        down_sum2 = (TextView) findViewById(R.id.down_sum2);
        down_sum3 = (TextView) findViewById(R.id.down_sum3);
        up_sum1 = (TextView) findViewById(R.id.up_sum1);
        up_sum2 = (TextView) findViewById(R.id.up_sum2);
        up_sum3 = (TextView) findViewById(R.id.up_sum3);
        free_sum1 = (TextView) findViewById(R.id.free_sum1);
        free_sum2 = (TextView) findViewById(R.id.free_sum2);
        free_sum3 = (TextView) findViewById(R.id.free_sum3);
        hand_sum1 = (TextView) findViewById(R.id.hand_sum1);
        hand_sum2 = (TextView) findViewById(R.id.hand_sum2);
        hand_sum3 = (TextView) findViewById(R.id.hand_sum3);
        yamb_sum1 = (TextView) findViewById(R.id.yamb_sum1);
        yamb_sum2 = (TextView) findViewById(R.id.yamb_sum2);
        yamb_sum3 = (TextView) findViewById(R.id.yamb_sum3);
        yamb_sumtotal = (TextView) findViewById(R.id.yamb_sumtotal);

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

        dice1.setOnClickListener(this);
        dice2.setOnClickListener(this);
        dice3.setOnClickListener(this);
        dice4.setOnClickListener(this);
        dice5.setOnClickListener(this);
        dice6.setOnClickListener(this);


        play.setOnClickListener(this);
        profile.setOnClickListener(this);
    }
    private void initText(){
        down_sum2.addTextChangedListener(this);
        down_sum1.addTextChangedListener(this);
        down_sum3.addTextChangedListener(this);
        up_sum1.addTextChangedListener(this);
        up_sum2.addTextChangedListener(this);
        up_sum3.addTextChangedListener(this);
        free_sum1.addTextChangedListener(this);
        free_sum2.addTextChangedListener(this);
        free_sum3.addTextChangedListener(this);
        hand_sum1.addTextChangedListener(this);
        hand_sum2.addTextChangedListener(this);
        hand_sum3.addTextChangedListener(this);
        yamb_sum1.addTextChangedListener(this);
        yamb_sum2.addTextChangedListener(this);
        yamb_sum3.addTextChangedListener(this);
    }

    private void initData()
    {
        arrayDown = new int[count];
        arrayUp = new int[count];
        arrayFree = new int[count];
        arrayHand = new int[count];

        for (int i = 0; i < count; i++) {
            arrayHand[i] = -1;
            arrayFree[i] = -1;
            arrayUp[i] = -1;
            arrayDown[i] = -1;
        }

        arrayDicesValue = new int[6];
        arrayDicesState = new boolean[6];
        played();

    }

    public void down(int i, TextView textView) {
        if(i == 0){
            arrayDown[0] = write(i);
            textView.setText(String.valueOf(arrayDown[0]));
            played();
            yamb_sumtotal.setText(String.valueOf(oneToSixSum() + MaxMinSum()));
        }
        else if(arrayDown[i-1] != -1){
            arrayDown[i] = write(i);
            textView.setText(String.valueOf(arrayDown[i]));
            played();
            yamb_sumtotal.setText(String.valueOf(oneToSixSum() + MaxMinSum()));
        }
    }

    public void up(int i, TextView textView) {
        if (i == 12) {
            arrayUp[12] = write(i);
            textView.setText(String.valueOf(arrayUp[12]));
            played();
            yamb_sumtotal.setText(String.valueOf(oneToSixSum()));
        }
        else if (arrayUp[i + 1] != -1) {
            arrayUp[i] = write(i);
            textView.setText(String.valueOf(arrayUp[i]));
            played();
            yamb_sumtotal.setText(String.valueOf(oneToSixSum()));
        }

    }

    public void free(int i, TextView textView) {
        arrayFree[i] = write(i);
        textView.setText(String.valueOf(arrayFree[i]));
        played();
        yamb_sumtotal.setText(String.valueOf(oneToSixSum() + MaxMinSum()));
    }

    public void hand(int i, TextView textView) {
        if (numOfThrows == 1) {
            arrayHand[i] = write(i);
            textView.setText(String.valueOf(arrayHand[i]));
            played();
            yamb_sumtotal.setText(String.valueOf(oneToSixSum()));
        }
    }

    //reset values after writing in field and sets dices
    public void played() {
        numOfThrows = 0;
        for(int i=0; i<6; i++)
        {
            arrayDicesState[i]=true;
            arrayDicesValue[i]=0;
        }
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice1);
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice2);
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice3);
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice4);
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice5);
        GlideApp.with(MiniYamb.this).load(R.drawable.unknown).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(dice6);
        GlideApp.with(MiniYamb.this).load(R.drawable.play).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(play);
        firstTurn = false;
        play.setClickable(true);
    }

    public void random(ImageView imageView, int i) {
        Random rand = new Random();
        int n = rand.nextInt(6)+1;

        try {
            if (arrayDicesState[i] && imageView != null) {
                switch (n) {
                    case 1: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 2: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 3: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 4: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 5: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                .skipMemoryCache(true).into(imageView);
                    }
                    break;
                    case 6: {
                        GlideApp.with(MiniYamb.this).load(R.drawable.orange6).diskCacheStrategy(DiskCacheStrategy.NONE)
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

    public void swapDice(ImageView imageView, int i) {
        try
        {
            if(firstTurn) {
                if (!arrayDicesState[i]) {
                    arrayDicesState[i] = true;
                    switch (arrayDicesValue[i]) {
                        case 1:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 2:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 3:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 4:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 5:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 6:
                            GlideApp.with(MiniYamb.this).load(R.drawable.orange6).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                    }

                } else {
                    arrayDicesState[i] = false;
                    switch (arrayDicesValue[i]) {

                        case 1:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red1).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 2:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red2).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 3:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red3).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 4:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red4).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 5:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red5).diskCacheStrategy(DiskCacheStrategy.NONE)
                                    .skipMemoryCache(true).into(imageView);
                            break;
                        case 6:
                            GlideApp.with(MiniYamb.this).load(R.drawable.red6).diskCacheStrategy(DiskCacheStrategy.NONE)
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

    public void swapPlay(ImageView imageView) {
        numOfThrows++;
        try
        {
            if(numOfThrows == 1)
            {
                GlideApp.with(MiniYamb.this).load(R.drawable.play1).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
                firstTurn = true;
            }
            if(numOfThrows == 2)
            {
                GlideApp.with(MiniYamb.this).load(R.drawable.play2).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
            }
            if(numOfThrows == 3)
            {
                GlideApp.with(MiniYamb.this).load(R.drawable.play3).diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true).into(imageView);
                play.setClickable(false);

            }

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

    public int write (int i) {
        int sum = 0;
        int brFalse = 0;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            for (int j = 0; j < 6; j++) {
                if (!arrayDicesState[j]) {
                    if (arrayDicesValue[j] == i + 1)
                        brFalse++;
                }
            }
            if (brFalse == 6) {
                brFalse = 5;
                sum += (i + 1) * brFalse;
            }
            else
                sum += (i + 1) * brFalse;

        }
        else if (i == 6 || i == 7) {
            List<Integer> list = Arrays.asList(arrayDicesValue[0], arrayDicesValue[1], arrayDicesValue[2], arrayDicesValue[3], arrayDicesValue[4], arrayDicesValue[5]);
            int min = Collections.min(list);
            int max = Collections.max(list);
            if (i == 6) {
                for (int j = 0; j < 6; j++)
                    sum += arrayDicesValue[j];
                sum -= min;
            } else {
                for (int j = 0; j < 6; j++)
                    sum += arrayDicesValue[j];
                sum -= max;
            }
        } /*else if (i == 8) {
            int n;
            for (int j = 0; j < 6; j++)
                if (!arrayDicesState[j]) {
                    for (int k = 0; k < 5; k++) {
                        if (arrayDicesValue[k] == k + 1 || arrayDicesValue[k] == k + 2 || arrayDicesValue[k] == k + 3 || arrayDicesValue[k] == k + 4 || arrayDicesValue[k] == k + 5)


                    }
                }
        }*/
        else if(i == 9 || i == 12 || i == 11 || i ==10)
        {
            int x;
            int n;
            int sf = 0;
            if (i == 9 || i == 10){
                x = 3;
                n = 20;
            }
            else if (i == 11) {
                x = 4;
                n = 40;
            }
            else{
                x = 5;
                n = 50;
            }
            for(int m = 0; m < 6; m++){
                    int count;
                    for (int k = 1; k < 7; k++) {
                        if (!arrayDicesState[m] && k == arrayDicesValue[m])
                            continue;
                        count = 0;
                        for (int j = 0; j < 6; j++) {
                            if (!arrayDicesState[j] && arrayDicesValue[j] == k)
                                count++;
                        }
                        if (count >= x) {
                            sum = k * x + n;
                            sf = k;
                        }
                    }
                if ( i == 10 && sum != 0 ) {
                        int sum1 = 0;
                        for(int a = 0; a < 6; a++) {
                        int count1;
                        for (int k = 1; k < 7; k++) {
                            if (!arrayDicesState[a] && k == arrayDicesValue[a] && k != sf)
                                continue;
                            count1 = 0;
                            for (int j = 0; j < 6; j++) {
                                if (!arrayDicesState[j] && arrayDicesValue[j] == k && k != sf)
                                    count1++;
                            }
                            if (count1 >= 2)
                                sum1 = sf * x + 2 * k + 30;
                            else if (sum1 == 0)
                                sum = 0;
                            else sum = sum1;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public void oneToSfixSum(int j){
        int sum = 0;
        if ( j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
            for (int i = 0; i < 6; i++) {
                if (arrayDown[i] == -1)
                    sum++;
                sum += arrayDown[i];
            }
            if (sum >= 60)
                sum += 30;
            down_sum1.setText(String.valueOf(sum));
        }
        else if ( j == 7) {
            if (arrayDown[0] != -1 && arrayDown[6] != -1 && arrayDown[7] != -1)
                down_sum2.setText(String.valueOf((arrayDown[6] - arrayDown[7]) * arrayDown[0]));
        }
        else if ( j == 8 || j == 9 || j == 10 || j ==11 || j == 12) {
            for (int i = 8; i < 13; i++) {
                if (arrayDown[i] == -1)
                    sum++;
                sum += arrayDown[i];
            }
            down_sum3.setText(String.valueOf(sum));
        }
    }

    public void upSum(int j){
        int sum = 0;
        if ( j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
            for (int i = 0; i < 6; i++) {
                if (arrayUp[i] == -1)
                    sum++;
                sum += arrayUp[i];
            }
            if (sum >= 60)
                sum += 30;
            up_sum1.setText(String.valueOf(sum));
        }
        else if ( j == 0) {
            if (arrayUp[0] != -1 && arrayUp[6] != -1 && arrayUp[7] != -1)
                down_sum2.setText(String.valueOf((arrayUp[6] - arrayUp[7]) * arrayUp[0]));
        }
        else if ( j == 8 || j == 9 || j == 10 || j ==11 || j == 12) {
            for (int i = 8; i < 13; i++) {
                if (arrayUp[i] == -1)
                    sum++;
                sum += arrayUp[i];
            }
            up_sum3.setText(String.valueOf(sum));
        }
    }

    public void freeSum(int j){
        int sum = 0;
        if ( j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
            for (int i = 0; i < 6; i++) {
                if (arrayFree[i] == -1)
                    sum++;
                sum += arrayFree[i];
            }
            if (sum >= 60)
                sum += 30;
            free_sum1.setText(String.valueOf(sum));
        }
        else if ((j == 7 || j == 6 || j == 0) && (arrayFree[6] != -1 && arrayFree[7] != -1 && arrayFree[0] != -1)) {
            if (arrayFree[0] != -1 && arrayFree[6] != -1 && arrayFree[7] != -1)
                free_sum2.setText(String.valueOf((arrayFree[6] - arrayFree[7]) * arrayFree[0]));
        }
        else if ( j == 8 || j == 9 || j == 10 || j ==11 || j == 12) {
            for (int i = 8; i < 13; i++) {
                if (arrayFree[i] == -1)
                    sum++;
                sum += arrayFree[i];
            }
            free_sum3.setText(String.valueOf(sum));
        }
    }

    public void handSum(int j){
        int sum = 0;
        if ( j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
            for (int i = 0; i < 6; i++) {
                if (arrayHand[i] == -1)
                    sum++;
                sum += arrayHand[i];
            }
            if (sum >= 60)
                sum += 30;
            hand_sum1.setText(String.valueOf(sum));
        }
        else if ((j == 7 || j == 6 || j == 0) && (arrayHand[6] != -1 && arrayHand[7] != -1 && arrayHand[0] != -1)) {
            if (arrayHand[0] != -1 && arrayHand[6] != -1 && arrayHand[7] != -1)
                hand_sum2.setText(String.valueOf((arrayHand[6] - arrayHand[7]) * arrayHand[0]));
        }
        else if ( j == 8 || j == 9 || j == 10 || j ==11 || j == 12) {
            for (int i = 8; i < 13; i++) {
                if (arrayHand[i] == -1)
                    sum++;
                sum += arrayHand[i];
            }
            hand_sum3.setText(String.valueOf(sum));
        }
    }

    public int oneToSixSum() {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum4 = 0;
        int sum3 = 0;
        for (int i = 0; i < 6; i++) {
            if (arrayDown[i] == -1)
                sum1++;
            sum1 += arrayDown[i];
            if (arrayUp[i] == -1)
                sum2++;
            sum2 += arrayUp[i];
            if (arrayFree[i] == -1)
                sum3++;
            sum3 += arrayFree[i];
            if (arrayHand[i] == -1)
                sum4++;
            sum4 += arrayHand[i];
        }
        if (sum1 >= 60)
            sum1 += 30;
        if (sum2 >= 60)
            sum2 += 30;
        if (sum3 >= 60)
            sum3 += 30;
        if (sum4 >= 60)
            sum4 += 30;
        sum = sum1+sum2+sum3+sum4;
        if(sum1 != 0)
            down_sum1.setText(String.valueOf(sum1));
        if(sum2 != 0)
            up_sum1.setText(String.valueOf(sum2));
        if(sum3 != 0)
            free_sum1.setText(String.valueOf(sum3));
        if(sum4 != 0)
            hand_sum1.setText(String.valueOf(sum4));
        yamb_sum1.setText(String.valueOf(sum));
        return sum;
    }

    public int MaxMinSum(){
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        if (arrayDown[7] != -1)
            sum1 = (arrayDown[6] - arrayDown[7]) * arrayDown[0];
        if (arrayUp[0] != -1)
            sum2 = (arrayUp[6] - arrayUp[7]) * arrayUp[0];
        if (arrayFree[0] != -1 && arrayFree[6] != -1 && arrayFree[7] != -1)
            sum3 = (arrayFree[6] - arrayFree[7]) * arrayFree[0];
        if (arrayHand[0] != -1 && arrayHand[6] != -1 && arrayHand[7] != -1)
            sum3 = (arrayHand[6] - arrayHand[7]) * arrayHand[0];
        sum = sum1+sum2+sum3+sum4;
        if(sum1 != 0)
            down_sum2.setText(String.valueOf(sum1));
        if(sum2 != 0)
            up_sum2.setText(String.valueOf(sum2));
        if(sum3 != 0)
            free_sum2.setText(String.valueOf(sum3));
        if(sum4 != 0)
            hand_sum2.setText(String.valueOf(sum4));
        yamb_sum2.setText(String.valueOf(sum));
        return sum;

    }





    @Override
    public void onClick(View v) {
        if(numOfThrows != 0) {
            switch (v.getId()) {
                // 2. column - down
                case R.id.down_1:
                    if (arrayDown[0] == -1)
                        down(0, down_1);
                    break;
                case R.id.down_2:
                    if (arrayDown[1] == -1)
                        down(1, down_2);
                    break;
                case R.id.down_3:
                    if (arrayDown[2] == -1)
                        down(2, down_3);
                    break;
                case R.id.down_4:
                    if (arrayDown[3] == -1)
                        down(3, down_4);
                    break;
                case R.id.down_5:
                    if (arrayDown[4] == -1)
                        down(4, down_5);
                    break;
                case R.id.down_6:
                    if (arrayDown[5] == -1)
                        down(5, down_6);
                    break;

                case R.id.down_max:
                    if (arrayDown[6] == -1)
                        down(6, down_max);
                    break;
                case R.id.down_min:
                    if (arrayDown[7] == -1)
                        down(7, down_min);
                    break;

                case R.id.down_straight:
                    if (arrayDown[8] == -1)
                        down(8, down_straight);
                    break;
                case R.id.down_three:
                    if (arrayDown[9] == -1)
                        down(9, down_three);
                    break;
                case R.id.down_full:
                    if (arrayDown[10] == -1)
                        down(10, down_full);
                    break;
                case R.id.down_poker:
                    if (arrayDown[11] == -1)
                        down(11, down_poker);
                    break;
                case R.id.down_yamb:
                    if (arrayDown[12] == -1)
                        down(12, down_yamb);
                    break;

                // 3. column - up
                case R.id.up_1:
                    if (arrayUp[0] == -1)
                        up(0, up_1);
                    break;

                case R.id.up_2:
                    if (arrayUp[1] == -1)
                        up(1, up_2);
                    break;

                case R.id.up_3:
                    if (arrayUp[2] == -1)
                        up(2, up_3);
                    break;

                case R.id.up_4:
                    if (arrayUp[3] == -1)
                        up(3, up_4);
                    break;

                case R.id.up_5:
                    if (arrayUp[4] == -1)
                        up(4, up_5);
                    break;

                case R.id.up_6:
                    if (arrayUp[5] == -1)
                        up(5, up_6);
                    break;

                case R.id.up_max:
                    if (arrayUp[6] == -1)
                        up(6, up_max);
                    break;

                case R.id.up_min:
                    if (arrayUp[7] == -1)
                        up(7, up_min);
                    break;

                case R.id.up_straight:
                    if (arrayUp[8] == -1)
                        up(8, up_straight);
                    break;

                case R.id.up_three:
                    if (arrayUp[9] == -1)
                        up(9, up_three);
                    break;

                case R.id.up_full:
                    if (arrayUp[10] == -1)
                        up(10, up_full);
                    break;

                case R.id.up_poker:
                    if (arrayUp[11] == -1)
                        up(11, up_poker);
                    break;

                case R.id.up_yamb:
                    if (arrayUp[12] == -1)
                        up(12, up_yamb);
                    break;

                // 3. column - free
                case R.id.free_1:
                    if (arrayFree[0] == -1)
                        free(0, free_1);
                    break;

                case R.id.free_2:
                    if (arrayFree[1] == -1)
                        free(1, free_2);
                    break;

                case R.id.free_3:
                    if (arrayFree[2] == -1)
                        free(2, free_3);
                    break;

                case R.id.free_4:
                    if (arrayFree[3] == -1)
                        free(3, free_4);
                    break;

                case R.id.free_5:
                    if (arrayFree[4] == -1)
                        free(4, free_5);
                    break;

                case R.id.free_6:
                    if (arrayFree[5] == -1)
                        free(5, free_6);
                    break;

                case R.id.free_max:
                    if (arrayFree[6] == -1)
                        free(6, free_max);
                    break;

                case R.id.free_min:
                    if (arrayFree[7] == -1)
                        free(7, free_min);
                    break;

                case R.id.free_straight:
                    if (arrayFree[8] == -1)
                        free(8, free_straight);
                    break;

                case R.id.free_three:
                    if (arrayFree[9] == -1)
                        free(9, free_three);
                    break;

                case R.id.free_full:
                    if (arrayFree[10] == -1)
                        free(10, free_full);
                    break;

                case R.id.free_poker:
                    if (arrayFree[11] == -1)
                        free(11, free_poker);
                    break;

                case R.id.free_yamb:
                    if (arrayFree[12] == -1)
                        free(12, free_yamb);
                    break;

                // 4. column - hand
                case R.id.hand_1:
                    if (arrayHand[0] == -1)
                        hand(0, hand_1);
                    break;

                case R.id.hand_2:
                    if (arrayHand[1] == -1)
                        hand(1, hand_2);
                    break;

                case R.id.hand_3:
                    if (arrayHand[2] == -1)
                        hand(2, hand_3);
                    break;

                case R.id.hand_4:
                    if (arrayHand[3] == -1)
                        hand(3, hand_4);
                    break;

                case R.id.hand_5:
                    if (arrayHand[4] == -1)
                        hand(4, hand_5);
                    break;

                case R.id.hand_6:
                    if (arrayHand[5] == -1)
                        hand(5, hand_6);
                    break;

                case R.id.hand_max:
                    if (arrayHand[6] == -1)
                        hand(6, hand_max);
                    break;

                case R.id.hand_min:
                    if (arrayHand[7] == -1)
                        hand(7, hand_min);
                    break;

                case R.id.hand_straight:
                    if (arrayHand[8] == -1)
                        hand(8, hand_straight);
                    break;

                case R.id.hand_three:
                    if (arrayHand[9] == -1)
                        hand(9, hand_three);
                    break;

                case R.id.hand_full:
                    if (arrayHand[10] == -1)
                        hand(10, hand_full);
                    break;

                case R.id.hand_poker:
                    if (arrayHand[11] == -1)
                        hand(11, hand_poker);
                    break;

                case R.id.hand_yamb:
                    if (arrayHand[12] == -1)
                        hand(12, hand_yamb);
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
            }
        }
        switch (v.getId()) {
            case R.id.play:
                swapPlay(play);
                break;

            case R.id.profile:
                Intent i;
                i = new Intent(MiniYamb.this, MiniYambOpponent.class);
                startActivity(i);
                break;
        }
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
   //     String text = editable.toString();
     //   switch (p.getId()){
       //     case R.id.down_sum1:
         //   yamb_sum1.setText(String.valueOf(7));
           // break;

    }
    }

