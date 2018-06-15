package com.vikinzi.vikingsyambdventure.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent gotoLogIn  = new Intent(LoadingScreen.this, LoginActivity.class);
        startActivity(gotoLogIn);
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException ex) {
            android.util.Log.d("YourApplicationName", ex.toString());
        }
        finish();
    }
}
