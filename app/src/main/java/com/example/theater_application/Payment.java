package com.example.theater_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

public class Payment extends AppCompatActivity {
    RelativeLayout paytm,upi,manual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        actionBar.setTitle("Payment");
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);

        paytm = findViewById(R.id.paytm);
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Payment.this,
                        Paytm.class);
                startActivity(i);
            }
        });

        upi = findViewById(R.id.upi);
        upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Payment.this,
                        Upi.class);
                startActivity(i);
            }
        });

        manual = findViewById(R.id.manual);
        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Payment.this,
                        Reciept.class);
                startActivity(i);
            }
        });

    }
}
