package com.vikinzi.vikingsyambdventure.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vikinzi.vikingsyambdventure.R;

import java.util.Random;

public class MiniYamb extends AppCompatActivity  implements
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
    int[] arrayDown, arrayUp, arrayFree, arrayHand, arrayDicesValue;
    boolean[] arrayDicesState;
    int brojBacanja = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_yamb);

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

    private void initData() {
        arrayDown = new int[count];
        for (int i = 0; i < count; i++)
            arrayDown[i] = -1;

        arrayUp = new int[count];
        for (int i = 0; i < count; i++)
            arrayUp[i] = -1;

        arrayFree = new int[count];
        for (int i = 0; i < count; i++)
            arrayFree[i] = -1;

        arrayHand = new int[count];
        for (int i = 0; i < count; i++)
            arrayHand[i] = -1;

        arrayDicesValue = new int[6];
        for (int i = 0; i < 6; i++)
            arrayDicesValue[i] = 0;

        arrayDicesState = new boolean[6];
        for(int i = 0; i < 6; i++)
            arrayDicesState[i] = true;

    }

    public void down(int i, TextView textView) {
        if(i == 0 && arrayDown[0] == -1){
            arrayDown[0] = returnSumOfDices();
            textView.setText(String.valueOf(arrayDown[0]));
            textView.setClickable(false);
        }
        else if(arrayDown[i-1] != -1 && arrayDown[i] == -1){
            arrayDown[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayDown[i]));
        }
    }

    public void up(int i, TextView textView) {
        if (i == 12 && arrayUp[12] == -1) {
            arrayUp[12] = returnSumOfDices();
            textView.setText(String.valueOf(arrayUp[12]));
            textView.setClickable(false);
        }
        else if (arrayUp[i + 1] != -1 && arrayUp[i] == -1) {
            arrayUp[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayUp[i]));
        }

    }

    public void free(int i, TextView textView) {
        if (arrayFree[i] == -1) {
            arrayFree[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayFree[i]));
        }
    }

    public void hand(int i, TextView textView) {
        if ((arrayHand[i] == -1) && (brojBacanja == 1)) {
            arrayHand[i] = returnSumOfDices();
            textView.setText(String.valueOf(arrayHand[i]));
        }
    }

    public void random(ImageView imageView, int i) {
        Random rand = new Random();
        int n = rand.nextInt(6)+1;

        if(arrayDicesState[i]) {
            switch (n) {
                case 1: {
                    imageView.setImageResource(R.drawable.orange1);
                }
                break;
                case 2: {
                    imageView.setImageResource(R.drawable.orange2);
                }
                break;
                case 3: {
                    imageView.setImageResource(R.drawable.orange3);
                }
                break;
                case 4: {
                    imageView.setImageResource(R.drawable.orange4);
                }
                break;
                case 5: {
                    imageView.setImageResource(R.drawable.orange5);
                }
                break;
                case 6: {
                    imageView.setImageResource(R.drawable.orange6);
                }
                break;
            }
            arrayDicesValue[i] = n;
        }
    }


    public int returnSumOfDices() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return n;
    }


    public void swapDice(ImageView imageView, int i) {
        if (!arrayDicesState[i]) {
            arrayDicesState[i] = true;
            switch (arrayDicesValue[i]) {
                case 1:
                    imageView.setImageResource(R.drawable.orange1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.orange2);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.orange3);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.orange4);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.orange5);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.orange6);
                    break;
            }

        } else {
            arrayDicesState[i] = false;
            switch (arrayDicesValue[i]) {

                case 1:
                    imageView.setImageResource(R.drawable.red1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.red2);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.red3);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.red4);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.red5);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.red6);
                    break;
            }
        }
    }

    public void swapPlay(ImageView imageView) {
        if (brojBacanja == 2) {
            brojBacanja = 0;
            imageView.setImageResource(R.drawable.play1);
        } else if (brojBacanja == 1) {
            brojBacanja++;
            imageView.setImageResource(R.drawable.play3);
        } else if (brojBacanja == 0) {
            brojBacanja++;
            imageView.setImageResource(R.drawable.play2);
        }
        random(dice1,0);
        random(dice2,1);
        random(dice3,2);
        random(dice4,3);
        random(dice5,4);
        random(dice6,5);
        }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            // 2. column - down
            case R.id.down_1:
                down( 0, down_1);
                break;

            case R.id.down_2:
                down( 1, down_2);
                break;

            case R.id.down_3:
                down( 2, down_3);
                break;

            case R.id.down_4:
                down( 3, down_4);
                break;

            case R.id.down_5:
                down( 4, down_5);
                break;

            case R.id.down_6:
                down( 5, down_6);
                break;

            case R.id.down_max:
                down( 6, down_max);
                break;

            case R.id.down_min:
                down( 7, down_min);
                break;
            case R.id.down_straight:
                down( 8, down_straight);
                break;

            case R.id.down_three:
                down( 9, down_three);
                break;

            case R.id.down_full:
                down( 10, down_full);
                break;

            case R.id.down_poker:
                down( 11, down_poker);
                break;

            case R.id.down_yamb:
                down( 12, down_yamb);
                break;

            // 3. column - up
            case R.id.up_1:
                up( 0, up_1);
                break;

            case R.id.up_2:
                up( 1, up_2);
                break;

            case R.id.up_3:
                up( 2, up_3);
                break;

            case R.id.up_4:
                up( 3, up_4);
                break;

            case R.id.up_5:
                up( 4, up_5);
                break;

            case R.id.up_6:
                up( 5, up_6);
                break;

            case R.id.up_max:
                up( 6, up_max);
                break;

            case R.id.up_min:
                up( 7, up_min);
                break;
            case R.id.up_straight:
                up( 8, up_straight);
                break;

            case R.id.up_three:
                up( 9, up_three);
                break;

            case R.id.up_full:
                up( 10, up_full);
                break;

            case R.id.up_poker:
                up( 11, up_poker);
                break;

            case R.id.up_yamb:
                up( 12, up_yamb);
                break;

            // 3. column - free
            case R.id.free_1:
                free( 0, free_1);
                break;

            case R.id.free_2:
                free( 1, free_2);
                break;

            case R.id.free_3:
                free( 2, free_3);
                break;

            case R.id.free_4:
                free( 3, free_4);
                break;

            case R.id.free_5:
                free( 4, free_5);
                break;

            case R.id.free_6:
                free( 5, free_6);
                break;

            case R.id.free_max:
                free( 6, free_max);
                break;

            case R.id.free_min:
                free( 7, free_min);
                break;

            case R.id.free_straight:
                free( 8, free_straight);
                break;

            case R.id.free_three:
                free( 9, free_three);
                break;

            case R.id.free_full:
                free( 10, free_full);
                break;

            case R.id.free_poker:
                free( 11, free_poker);
                break;

            case R.id.free_yamb:
                free( 12, free_yamb);
                break;

            // 4. column - hand
            case R.id.hand_1:
                hand( 0, hand_1);
                break;

            case R.id.hand_2:
                hand( 1, hand_2);
                break;

            case R.id.hand_3:
                hand( 2, hand_3);
                break;

            case R.id.hand_4:
                hand( 3, hand_4);
                break;

            case R.id.hand_5:
                hand( 4, hand_5);
                break;

            case R.id.hand_6:
                hand( 5, hand_6);
                break;

            case R.id.hand_max:
                hand( 6, hand_max);
                break;

            case R.id.hand_min:
                hand( 7, hand_min);
                break;

            case R.id.hand_straight:
                hand( 8, hand_straight);
                break;

            case R.id.hand_three:
                hand( 9, hand_three);
                break;

            case R.id.hand_full:
                hand( 10, hand_full);
                break;

            case R.id.hand_poker:
                hand( 11, hand_poker);
                break;

            case R.id.hand_yamb:
                hand( 12, hand_yamb);
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
                break;
        }
    }
}
