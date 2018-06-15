package com.vikinzi.vikingsyambdventure.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

import com.vikinzi.vikingsyambdventure.R;


public class RangListActivity extends AppCompatActivity
{
    private TextView mRangList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rang_list);
        mRangList = (TextView) findViewById(R.id.text);
        Typeface enchantedLandFont = Typeface.createFromAsset(getAssets(), "fonts/enchanted_land.ttf");
        mRangList.setTypeface(enchantedLandFont);
    }
}
