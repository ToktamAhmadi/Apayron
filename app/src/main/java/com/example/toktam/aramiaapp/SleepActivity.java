package com.example.toktam.aramiaapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SleepActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    /******************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        setBottomNavigationView();
        /****************/
    }//onCreat

    /*******************************/
    private void setBottomNavigationView() {
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(SleepActivity.this, MainActivity.class));
                        break;
                    case R.id.sleep:
                        break;
                    case R.id.meditation:
                        startActivity(new Intent(SleepActivity.this, MeditationActivity.class));
                        break;
                    case R.id.music:
                        startActivity(new Intent(SleepActivity.this, MusicActivity.class));
                        break;
                }
                return false;
            }
        });
    }
/******************/
}//class