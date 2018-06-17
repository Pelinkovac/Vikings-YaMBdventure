package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.vikinzi.vikingsyambdventure.R;

public class NewGameActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        ImageButton mini = (ImageButton) findViewById(R.id.miniyamb);
        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMini = new Intent(NewGameActivity.this, MiniYamb.class);
                startActivity(goToMini);
            }
        });
        ImageButton maxi = (ImageButton) findViewById(R.id.maxiyamb);
        maxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMaxi = new Intent(NewGameActivity.this, MaxiYamb.class);
                startActivity(goToMaxi);
            }
        });


    }
}
