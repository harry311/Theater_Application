package com.example.theater_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Paytm extends AppCompatActivity {
    Button proceed ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytm);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        actionBar.setTitle("PAYTM");
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);

        proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Paytm.this, Reciept.class);
                startActivity(i);
            }
        });

    }

    public boolean onCreateOptionsMenu( Menu menu ) {
        getMenuInflater().inflate(R.menu.payment, menu);
        return super.onCreateOptionsMenu(menu);
    }
}