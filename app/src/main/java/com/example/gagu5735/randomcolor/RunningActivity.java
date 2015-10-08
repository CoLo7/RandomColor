package com.example.gagu5735.randomcolor;

/**
 * Created by gagu5735 on 9/29/15.
 */

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class RunningActivity
{
    private Button homeButton;

    @Override
    protected void onCreate(Bund savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activy_running);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_running, menu);
        return true;
    }
    private voidetupListeners()
    {
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent();
                setResult(RESULT_OK, myIntent);
            }

        });


    }
}
