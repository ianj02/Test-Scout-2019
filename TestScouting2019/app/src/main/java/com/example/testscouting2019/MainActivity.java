package com.example.testscouting2019;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    // Object Declarations
    private Button button;
    private EditText loginPrompt;
    private TextView textView2;

    // ID Array Declaration

    String[][] idArray = {
            {"1", "'We left this here because it made the code work.'"},            // 0
            {"35", "Brandon"},          // 1
            {"8", "Britney"},           // 2
            {"2", "Bryce"},             // 3
            {"3", "Cade"},              // 4
            {"9", "Cameron"},           // 5
            {"4", "Reed"},              // 6
            {"13", "Grayson 'Thottie'"},// 7
            {"20", "Ian"},              // 8
            {"14", "Joe"},              // 9
            {"21", "Kaitlyn"},          // 10
            {"5", "Kenrick"},           // 11
            {"15", "Macey"},            // 12
            {"7", "Mason"},             // 13
            {"23", "Nick"},             // 14
            {"16", "Reece"},            // 15
            {"12", "Rhealyn"},          // 16
            {"17", "Tucker"},           // 17
            {"18", "Zack"},             // 18
            {"6", "Ashlyn"},            // 0
            // Edit these in the same format to add/remove/update members
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.button);
        loginPrompt = (EditText) findViewById(R.id.loginPrompt);
        textView2 = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                    doLogin(Integer.parseInt(loginPrompt.getText().toString()));

            }

        });



    }

    public void openMainMenu(String ID, String name){
        Intent intent = new Intent(this, Main_Menu.class);
        intent.putExtra("USER-ID", ID);
        intent.putExtra("USER-NAME", name);
        startActivity(intent);
    }

    public void doLogin(int ID){

        if(ID > 0 && ID < 40) {



            int tempInt = SequentialSearch(idArray, ID);

            if(tempInt > 0) {
                openMainMenu(idArray[tempInt][0], idArray[tempInt][1]);
            }else{
                textView2.setText("'"+ID + "' is not 22222a valid ID, please check your ID and try again.");
            }

        }else{
            textView2.setText("'"+ID + "' is not a valid ID, please check your ID and try again.");

        }


    }

    public static int SequentialSearch(String[][] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i][0].equals(Integer.toString(target))){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
