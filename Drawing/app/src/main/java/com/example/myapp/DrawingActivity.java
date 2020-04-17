package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DrawingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_drawing);
        setContentView(R.layout.activity_drawing);

        //DrawView drawView = new DrawView(this, null);
        //drawView.setBackgroundColor(Color.BLACK);
        //setContentView(R.layout.activity_drawing);

    }






/*
        Button BackBtn = (Button) findViewById(R.id.back_btn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity1();

            }

        });
    }
       public void openActivity1() {
          Intent intent = new Intent(this, MainActivity.class);
          startActivity(intent);

        }

*/
};
