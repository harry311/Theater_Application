package com.example.theater_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Seat extends AppCompatActivity implements View.OnClickListener{
    Button t1,t2,t3;
    RadioGroup times;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        times = findViewById(R.id.times);

    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        getMenuInflater().inflate(R.menu.seat, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onClick(View view) {
        int selected_id = times.getCheckedRadioButtonId();
        RadioButton radio_b = (RadioButton) findViewById(selected_id);
        radio_b.setBackgroundColor(getResources().getColor(R.color.white));
        /*switch(view.getId()) {
            case R.id.t1:
                //if (t1.isClickable())
                    t1.setBackgroundColor(getResources().getColor(R.color.white));
                    //t2.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                    //t3.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                break;
            case R.id.t2:
                //if (t2.isClickable())
                    //t1.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                    t2.setBackgroundColor(getResources().getColor(R.color.white));
                    //t3.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                break;
            case R.id.t3:
                //if (t3.isClickable())
                    //t1.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                    //t2.setBackgroundColor(getResources().getColor(R.color.masterYellow));
                    t3.setBackgroundColor(getResources().getColor(R.color.white));
                break;
        }*/
    }

    public void next(View view) {
        Intent i  = new Intent(Seat.this,
                Contact.class);
        startActivity(i);
    }
}