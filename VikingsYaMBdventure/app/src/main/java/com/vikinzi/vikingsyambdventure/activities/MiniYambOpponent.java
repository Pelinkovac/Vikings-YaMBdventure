package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vikinzi.vikingsyambdventure.R;

public class MiniYambOpponent extends AppCompatActivity implements View.OnClickListener
{
    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_yamb_opponent);
        profile = (ImageView) findViewById(R.id.profile);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId()) {

            case R.id.profile:
                i = new Intent(MiniYambOpponent.this, MiniYamb.class);
                startActivity(i);
                break;
        }
    }
}