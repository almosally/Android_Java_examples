package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragMgr = getSupportFragmentManager();
                FragmentTransaction fragTrans = fragMgr.beginTransaction();
                BlankFragment hello = new BlankFragment();
                fragTrans.add(R.id.fragmentContainer, hello, "HELLO");
                fragTrans.commit();

            }
        });
    }
}
