package com.vikinzi.vikingsyambdventure.activities;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vikinzi.vikingsyambdventure.R;
import com.vikinzi.vikingsyambdventure.models.User;

import in.goodiebag.carouselpicker.CarouselPicker;

public class ProfileActivity extends AppCompatActivity {
    Dialog popupDialog;
    CarouselPicker carouselPicker1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        popupDialog = new Dialog(this);

        final FirebaseAuth auth = FirebaseAuth.getInstance();
        final TextView txtime = (TextView) findViewById(R.id.editTextIme);
        final TextView txtprezime = (TextView) findViewById(R.id.editTextPrezime);
        final TextView txtnick = (TextView) findViewById(R.id.editTextNickname);
        Button savedata = (Button) findViewById(R.id.save);

        savedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference parRef = database.getReference("users");
                DatabaseReference Ref = parRef.child(auth.getUid());
                User user = new User(txtprezime.getText().toString().trim(), txtime.getText().toString().trim(),
                        txtnick.getText().toString().trim());
                Ref.setValue(user);
            }
        });
    }

    public void ShowPopup(View v) {
        TextView txtclose;
        popupDialog.setContentView(R.layout.popup_profile_pic);
        txtclose = (TextView) popupDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupDialog.dismiss();
            }
        });
        popupDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupDialog.show();
    }

}

