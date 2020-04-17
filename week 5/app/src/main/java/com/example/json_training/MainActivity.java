package com.example.json_training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements TokenFragment.OnFragmentInteractionListener {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
    }

    @Override
    public void onFragmentInteraction(String token) {
        tv.setText(token);
    //new JSONTask().execute(token);


    }

    private class JSONTask extends AsyncTask<String,Void,String> {
                    @Override
                    protected String doInBackground(String... strings) {
                        URL url=null;
                        String s=null;
                        try {
                            url= new URL("https://api.fhict.nl/schedule/me");
                            HttpURLConnection connection = null;
                            connection = (HttpURLConnection)url.openConnection();
                            connection.setRequestProperty("Accept","application/json");
                            connection.setRequestProperty("Authorization","Bearer " +strings[0]);
                            connection.connect();

                            InputStream is=connection.getInputStream();
                            Scanner scn = new Scanner(is);
                            s = scn.useDelimiter("\\Z").next();




            }catch(IOException e)
            {
                e.printStackTrace();
            }
            return s;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            tv.setText(s);
        }
    }
}
