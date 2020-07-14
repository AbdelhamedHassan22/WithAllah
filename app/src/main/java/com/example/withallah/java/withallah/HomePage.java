package com.example.withallah.java.withallah;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.withallah.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);
        BottomNavigationView bottomNav =findViewById(R.id.botoom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new DoaaFragment()).commit();
    }//end onCreate
    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                   Fragment selectedfragment = null;

                   switch (menuItem.getItemId()){
                       case R.id.nav_home:
                           selectedfragment =new DoaaFragment();
                           break;

                       case R.id.nav_favourite:
                           selectedfragment =new AzkarFragment();
                           break;


                       case R.id.nav_search:
                           selectedfragment =new QuranFragment();
                           break;

                       case R.id.nav_sebha:
                           selectedfragment =new sebhaFragment();
                           break;

                       case R.id.Kaaba_nav:
                           selectedfragment =new KaabaFragment();
                           break;
                   }//en switch
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedfragment).commit();
                   return  true;
                }// onNavigationItemSelected
            };






    }//class




