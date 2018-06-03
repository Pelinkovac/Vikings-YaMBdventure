package com.vikinzi.vikingsyambdventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class NewGame extends AppCompatActivity implements
        View.OnClickListener
{

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.miniyamb:
                // code for button when user clicks buttonOne.
                break;

            case R.id.maxiyamb:
                // do your code
                break;
        }
    }
    ImageButton mini, maxi;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        ImageButton mini = (ImageButton) findViewById(R.id.miniyamb);
        mini.setOnClickListener(this); // calling onClick() method
        ImageButton maxi = (ImageButton) findViewById(R.id.maxiyamb);
        maxi.setOnClickListener(this);
    }
}
