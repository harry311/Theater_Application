package com.example.theater_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Movie_Details extends AppCompatActivity {

    private Button book_tickets;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray)));
        actionBar.setTitle("Jurassic World");
        // methods to display the icon in the ActionBar
        actionBar.setDisplayShowHomeEnabled(true);


       /* MediaController mediaController = new MediaController(this);
        videoView = findViewById(R.id.jt);
        videoView.setVideoPath("res/raw/jurassic.mp4");

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
            }
        });*/




        book_tickets = findViewById(R.id.book_tickets);
        book_tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Movie_Details.this, Seat.class);
                startActivity(i);
            }
        });

    }
}