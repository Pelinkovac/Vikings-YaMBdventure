package com.vikinzi.vikingsyambdventure.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.vikinzi.vikingsyambdventure.R;
import com.vikinzi.vikingsyambdventure.models.Down;
import com.vikinzi.vikingsyambdventure.models.Free;
import com.vikinzi.vikingsyambdventure.models.Hand;
import com.vikinzi.vikingsyambdventure.models.Kolona;
import com.vikinzi.vikingsyambdventure.models.Up;

import java.util.Random;

public class MiniYambProba extends AppCompatActivity {

    Down down = new Down();
    Up up = new Up();
    Free free = new Free();
    Hand hand = new Hand();
    Kolona[] tabela = {up, down, free, hand};

    TextView[] kockice = new TextView[6];

    TextView play;
    ImageView profile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_yamb_proba);
        initLayout();
        initData();
    }
    private void initLayout()
    {
        TextView niz[] = new TextView[13];

        niz[0] = (TextView) findViewById(R.id.down_1);
        niz[1] = (TextView) findViewById(R.id.down_2);
        niz[2] = (TextView) findViewById(R.id.down_3);
        niz[3] = (TextView) findViewById(R.id.down_4);
        niz[4] = (TextView) findViewById(R.id.down_5);
        niz[5] = (TextView) findViewById(R.id.down_6);
        niz[6] = (TextView) findViewById(R.id.down_max);
        niz[7] = (TextView) findViewById(R.id.down_min);
        niz[8] = (TextView) findViewById(R.id.down_straight);
        niz[9] = (TextView) findViewById(R.id.down_three);
        niz[10] = (TextView) findViewById(R.id.down_full);
        niz[11] = (TextView) findViewById(R.id.down_poker);
        niz[12] = (TextView) findViewById(R.id.down_yamb);
        down.setKolona(niz);

        niz[0] = (TextView) findViewById(R.id.up_1);
        niz[1] = (TextView) findViewById(R.id.up_2);
        niz[2] = (TextView) findViewById(R.id.up_3);
        niz[3] = (TextView) findViewById(R.id.up_4);
        niz[4] = (TextView) findViewById(R.id.up_5);
        niz[5] = (TextView) findViewById(R.id.up_6);
        niz[6] = (TextView) findViewById(R.id.up_max);
        niz[7] = (TextView) findViewById(R.id.up_min);
        niz[8] = (TextView) findViewById(R.id.up_straight);
        niz[9] = (TextView) findViewById(R.id.up_three);
        niz[10] = (TextView) findViewById(R.id.up_full);
        niz[11] = (TextView) findViewById(R.id.up_poker);
        niz[12] = (TextView) findViewById(R.id.up_yamb);
        up.setKolona(niz);

        niz[0] = (TextView) findViewById(R.id.free_1);
        niz[1] = (TextView) findViewById(R.id.free_2);
        niz[2] = (TextView) findViewById(R.id.free_3);
        niz[3] = (TextView) findViewById(R.id.free_4);
        niz[4] = (TextView) findViewById(R.id.free_5);
        niz[5] = (TextView) findViewById(R.id.free_6);
        niz[6] = (TextView) findViewById(R.id.free_max);
        niz[7] = (TextView) findViewById(R.id.free_min);
        niz[8] = (TextView) findViewById(R.id.free_straight);
        niz[9] = (TextView) findViewById(R.id.free_three);
        niz[10] = (TextView) findViewById(R.id.free_full);
        niz[11] = (TextView) findViewById(R.id.free_poker);
        niz[12] = (TextView) findViewById(R.id.free_yamb);
        free.setKolona(niz);

        niz[0] = (TextView) findViewById(R.id.hand_1);
        niz[1] = (TextView) findViewById(R.id.hand_2);
        niz[2] = (TextView) findViewById(R.id.hand_3);
        niz[3] = (TextView) findViewById(R.id.hand_4);
        niz[4] = (TextView) findViewById(R.id.hand_5);
        niz[5] = (TextView) findViewById(R.id.hand_6);
        niz[6] = (TextView) findViewById(R.id.hand_max);
        niz[7] = (TextView) findViewById(R.id.hand_min);
        niz[8] = (TextView) findViewById(R.id.hand_straight);
        niz[9] = (TextView) findViewById(R.id.hand_three);
        niz[10] = (TextView) findViewById(R.id.hand_full);
        niz[11] = (TextView) findViewById(R.id.hand_poker);
        niz[12] = (TextView) findViewById(R.id.hand_yamb);
        hand.setKolona(niz);

        kockice[0] = (TextView) findViewById(R.id.dice1);
        kockice[1] = (TextView) findViewById(R.id.dice2);
        kockice[2] = (TextView) findViewById(R.id.dice3);
        kockice[3] = (TextView) findViewById(R.id.dice4);
        kockice[4] = (TextView) findViewById(R.id.dice5);
        kockice[5] = (TextView) findViewById(R.id.dice6);

        play = (TextView) findViewById(R.id.play);
        profile = (ImageView) findViewById(R.id.profile);


    }
    private void initData(){
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 12; j++){
                tabela[i].kolona[j].setText("");
            }
        }
        resetDice();
    }
    private void resetDice(){
        for(int i = 0; i < 6; i++) {
            kockice[i].setSelected(false);
            kockice[i].setClickable(false);
            kockice[i].setBackgroundResource(R.drawable.unknown);
        }
        play.setBackgroundResource(R.drawable.play1);
        play.setText("0");
        play.setClickable(true);
    }

    //postavlja random na sve otkljucane kockice
    public void random() {
        Random rand = new Random();
        for(int i = 0; i < 6; i++) {
            int n = rand.nextInt(6)+1;
            if (!kockice[i].isSelected()) {
                switch (n) {
                    case 1: {
                        kockice[i].setBackgroundResource(R.drawable.orange1);
                    }
                    break;
                    case 2: {
                        kockice[i].setBackgroundResource(R.drawable.orange2);
                    }
                    break;
                    case 3: {
                        kockice[i].setBackgroundResource(R.drawable.orange3);
                    }
                    break;
                    case 4: {
                        kockice[i].setBackgroundResource(R.drawable.orange4);
                    }
                    break;
                    case 5: {
                        kockice[i].setBackgroundResource(R.drawable.orange5);
                    }
                    break;
                    case 6: {
                        kockice[i].setBackgroundResource(R.drawable.orange6);
                    }
                    break;
                }
                kockice[i].setText(n + "");
            }
        }
    }

    //zamenjuje sliku i-te kockice iz crvene u narandzastu i nazad
    public void swapDice(int i) {
        if (kockice[i].isSelected()) {
            kockice[i].setSelected(false);
            switch ( kockice[i].getText().toString() ) {
                case "1":
                    kockice[i].setBackgroundResource(R.drawable.orange1);
                    break;
                case "2":
                    kockice[i].setBackgroundResource(R.drawable.orange2);
                    break;
                case "3":
                    kockice[i].setBackgroundResource(R.drawable.orange3);
                    break;
                case "4":
                    kockice[i].setBackgroundResource(R.drawable.orange4);
                    break;
                case "5":
                    kockice[i].setBackgroundResource(R.drawable.orange5);
                    break;
                case "6":
                    kockice[i].setBackgroundResource(R.drawable.orange6);
                    break;
            }

        } else {
            kockice[i].setSelected(true);
            switch ( (kockice[i].getText().toString()) ) {
                case "1":
                    kockice[i].setBackgroundResource(R.drawable.red1);
                    break;
                case "2":
                    kockice[i].setBackgroundResource(R.drawable.red2);
                    break;
                case "3":
                    kockice[i].setBackgroundResource(R.drawable.red3);
                    break;
                case "4":
                    kockice[i].setBackgroundResource(R.drawable.red4);
                    break;
                case "5":
                    kockice[i].setBackgroundResource(R.drawable.red5);
                    break;
                case "6":
                    kockice[i].setBackgroundResource(R.drawable.red6);
                    break;
            }
        }
    }

    public void swapPlay() {
        if ( play.getText().toString().equals("0") ) {
            play.setText("1");
            play.setBackgroundResource(R.drawable.play2);
        } else if ( play.getText().toString().equals("1") ) {
            play.setText("2");
            play.setBackgroundResource(R.drawable.play3);
        } else if ( play.getText().toString().equals("2") ) {
            play.setBackgroundResource(R.drawable.play);
            play.setClickable(false);
        }
        random();
    }

    public int imaLiXBezBr(int x, int br){
        int[] niz = {6,6,6,2,1,6};
        int count;
        for (int i = 6; i > 0; i--){
            if(i == br)
                continue;
            count = 0;
            for(int j = 0; j < 6; j++){
                if(niz[j]==i)
                    count++;
            }
            if (count >= x)
                return i;
        }
        return 0;
    }
}
