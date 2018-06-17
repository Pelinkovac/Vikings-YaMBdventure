package com.vikinzi.vikingsyambdventure.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.widget.TextView;

import com.vikinzi.vikingsyambdventure.R;


public class GameRulesActivity extends AppCompatActivity {

    TextView gameRules;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_rules);
        gameRules = (TextView)findViewById(R.id.gamerules);

        Typeface vikingsFont= Typeface.createFromAsset(getAssets(), "fonts/enchanted_land.ttf");
        gameRules.setTypeface(vikingsFont);


    }
}
