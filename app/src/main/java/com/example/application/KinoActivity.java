package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class KinoActivity extends AppCompatActivity
{
    private final static String PHOTO_URL = "http://cinema.areas.su/up/images/";
    TextView textView;
    ImageView preview;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino);
        textView = findViewById(R.id.kinoNameText);
        description = findViewById(R.id.description);
        preview = findViewById(R.id.preview);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("name"));
        description.setText(intent.getStringExtra("description"));
        String photo = intent.getStringExtra("image");
        Picasso.with(this).load(PHOTO_URL + photo).into(preview);
    }
}