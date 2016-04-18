package com.example.kevin.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        //extras.putParcelable("imagebitmap",image);
        ImageView wolf = (ImageView)findViewById(R.id.imageView);
        wolf.setImageResource(getResources().getIdentifier(extras.getString("wolf"),"drawable","com.example.kevin.myapplication"));
        //wolf.setImageURI(Uri.parse(extras.getString("wolf")));
    }




}
