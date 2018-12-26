package com.example.toktam.aramiaapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

public class SleepActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    RecyclerView recyclerView;
    DataAdapterItem dataAdapterItem;
    /******************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        setBottomNavigationView();

        /****************/
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        dataAdapterItem=new DataAdapterItem(this,DataFakeGenerator.getData(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(dataAdapterItem);
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