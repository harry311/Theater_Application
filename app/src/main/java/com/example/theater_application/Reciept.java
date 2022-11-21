package com.example.theater_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Reciept extends AppCompatActivity {
    Button gth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciept);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        actionBar.setTitle("Reciept");
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);
        gth = findViewById(R.id.gth);
        gth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Reciept.this, Home.class);
                startActivity(i);
            }
        });
    }

    public boolean onCreateOptionsMenu( Menu menu ) {
        getMenuInflater().inflate(R.menu.reciept, menu);
        return super.onCreateOptionsMenu(menu);
    }

}