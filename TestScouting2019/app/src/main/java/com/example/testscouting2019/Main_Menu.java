package com.example.testscouting2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Menu extends AppCompatActivity {
    private Button logoutButton;
    private Button matchScoutingButton;
    private Button pitScoutingButton;
    private Button setupButton;
    public TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);

        Intent intent = getIntent();
        Bundle myIntentBundle = intent.getExtras();

        String userName = myIntentBundle.getString("USER-NAME");
        String userID = myIntentBundle.getString("USER-ID");

        //set the text to the TextView Control

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Welcome, " + userName);

        logoutButton = (Button) findViewById(R.id.button2);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginScreen();
            }

        });

        matchScoutingButton = (Button) findViewById(R.id.matchscouting);
        matchScoutingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openMatchScouting();
            }

        });

        pitScoutingButton = (Button) findViewById(R.id.pitscouting);

        setupButton = (Button) findViewById(R.id.button2);
        setupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginScreen();
            }

        });

        pitScoutingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openPitScouting();
            }

        });
    }
    public void openLoginScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openMatchScouting(){
        Intent intent = new Intent(this, Match_Scouting.class);
        startActivity(intent);
    }
    public void openPitScouting(){
        Intent intent = new Intent(this, Pit_Scouting.class);
        startActivity(intent);
    }
    public void openSetupMain(){
        Intent intent = new Intent(this, Setup_Main.class);
        startActivity(intent);
    }
}
