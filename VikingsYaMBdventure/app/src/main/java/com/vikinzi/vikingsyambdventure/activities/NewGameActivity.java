package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vikinzi.vikingsyambdventure.R;

public class NewGameActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        Typeface enchantedLandFont = Typeface.createFromAsset(getAssets(), "fonts/enchanted_land.ttf");

        TextView mini = (TextView) findViewById(R.id.miniyamb);
        mini.setTypeface(enchantedLandFont);

        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMini = new Intent(NewGameActivity.this, MiniYamb.class);
                startActivity(goToMini);
            }
        });
        TextView maxi = (TextView) findViewById(R.id.maxiyamb);
        maxi.setTypeface(enchantedLandFont);
        maxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMaxi = new Intent(NewGameActivity.this, MaxiYamb.class);
                startActivity(goToMaxi);
            }
        });


    }


}
