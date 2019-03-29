package com.example.mecconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profileIMG = findViewById(R.id.profile_img);
        profileIMG.setImageDrawable(getResources().getDrawable(R.drawable.students));

        Intent intent = getIntent();
        String txt = intent.getStringExtra("db");
        Toast.makeText(this,txt,Toast.LENGTH_LONG).show();
    }
}
