package com.vikinzi.vikingsyambdventure;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

//import com.example.nevenamladenovic.vikingsyambdventure.R;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener
{

    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId()) {

            case R.id.learnmode:
                i = new Intent(MainActivity.this, LearnMode.class);
                startActivity(i);
                break;

            case R.id.gamerules:
                i = new Intent(MainActivity.this, GameRules.class);
                startActivity(i);
                break;

            case R.id.ranglist:
                i = new Intent(MainActivity.this, RangList.class);
                startActivity(i);
                break;

            case R.id.properties:
                i = new Intent(MainActivity.this, Properties.class);
                startActivity(i);
                break;

            case R.id.newgame:

                i = new Intent(MainActivity.this, NewGame.class);
                startActivity(i);
                break;

            case R.id.profile:

                i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);
                break;
        }
    }
    ImageButton lm, gr, rl, p, ng, prof;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
     //   requestWindowFeature(Window.FEATURE_NO_TITLE);
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton lm = (ImageButton) findViewById(R.id.learnmode);
        lm.setOnClickListener(this); // calling onClick() method
        ImageButton gr = (ImageButton) findViewById(R.id.gamerules);
        gr.setOnClickListener(this);
        ImageButton rl= (ImageButton) findViewById(R.id.ranglist);
        rl.setOnClickListener(this);
        ImageButton p= (ImageButton) findViewById(R.id.properties);
        p.setOnClickListener(this);
        ImageButton ng= (ImageButton) findViewById(R.id.newgame);
        ng.setOnClickListener(this);
        ImageButton prof= (ImageButton) findViewById(R.id.profile);
        prof.setOnClickListener(this);


    }
}

