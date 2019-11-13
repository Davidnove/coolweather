package com.example.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this, WeatherActivity1.class);
            startActivity(intent);
            finish();

        }
    }

}
