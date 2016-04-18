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

public class MainActivity extends AppCompatActivity {
    public String wolf_string;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button_1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton button_2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton button_3  = (ImageButton)findViewById(R.id.imageButton3);
        Button next_button = (Button)findViewById(R.id.button);
        final String[] wolf_string = new String[1];
        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                i.putExtra("wolf","wolf_1");
                startActivity(i);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                this.wolf_string = "wolf_2";

            }
        });
    }



}
