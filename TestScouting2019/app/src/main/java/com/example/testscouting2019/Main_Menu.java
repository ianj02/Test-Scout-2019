package com.example.testscouting2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {
    private Button logoutButton;
    private Button matchScoutingButton;
    private Button pitScoutingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);

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
}
