package com.example.gagu5735.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

public class AboutMe extends AppCompatActivity {

    private Button Family
    private Button Friends
    private Button Soccer
    private Button Music
    private Button Journey
    private RelativeLayout Background




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Family = (Button) findViewById(R.id.familyButton);
        Friends = (Button) findViewById(R.id.friendsButton);
        Soccer = (Button) findViewById(R.id.soccerButton);
        Music = (Button) findViewById(R.id.musicButton);
        Journey = (Button) findViewById(R.id.journeyButton);
        Background = (RelativeLayout) findViewById(R.id.backgroundLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
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
