package com.example.my_application1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //change bg color


        //add
        Button addBtn = (Button) findViewById(R.id.add_button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNum);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNum);
                TextView results_view = (TextView) findViewById(R.id.results_view);

                try {
                    int num1 = Integer.parseInt(FirstNumEditText.getText().toString());
                    int num2 = Integer.parseInt(SecondNumEditText.getText().toString());


                    int results = num1 + num2;
                    results_view.setText(results + "");
                } catch (Exception e) {
                    results_view.setText("Error entry");
                }
                ;

            }

        });

        //Subs button
        Button sub_Btn = (Button) findViewById(R.id.sub_button);
        sub_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNum);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNum);
                TextView results_view = (TextView) findViewById(R.id.results_view);
                try {
                    int num1 = Integer.parseInt(FirstNumEditText.getText().toString());
                    int num2 = Integer.parseInt(SecondNumEditText.getText().toString());


                    int results = num1 - num2;
                    results_view.setText(results + "");
                } catch (Exception e) {
                    results_view.setText("Error entry");
                }
                ;

            }

        });
        //long press clear results
        addBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView results_view = (TextView) findViewById(R.id.results_view);
                results_view.setText("");

                return true;
            }
        });



        //long press clear results
        sub_Btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView results_view = (TextView) findViewById(R.id.results_view);
                results_view.setText("");

                return true;
            }
        });





    }





}
