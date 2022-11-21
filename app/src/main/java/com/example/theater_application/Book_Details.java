package com.example.theater_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Book_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        actionBar.setTitle("Click Ticket");
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);
    }

    public void next(View view) {
        Intent i = new Intent(Book_Details.this,
                Payment.class);
        startActivity(i);
    }
}
