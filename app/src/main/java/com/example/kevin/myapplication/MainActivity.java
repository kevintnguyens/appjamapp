package com.example.kevin.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View;
import android.content.Context;

//import
//static String wolf_string;
public class MainActivity extends AppCompatActivity {
    public  String wolf_string;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wolf_string= "wolf_1";
        setContentView(R.layout.activity_main);
        ImageButton button_1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton button_2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton button_3  = (ImageButton)findViewById(R.id.imageButton3);
        final Button next_button = (Button)findViewById(R.id.button);

        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                i.putExtra("wolf",wolf_string);
                startActivity(i);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wolf_string="wolf_1";
                next_button.setVisibility(1);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wolf_string = "wolf_2";
                next_button.setVisibility(1);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wolf_string = "wolf_3";
                next_button.setVisibility(1);
            }
        });
    }



}
