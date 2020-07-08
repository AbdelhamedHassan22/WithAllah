package com.example.withallah;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }//end onCreateOptinmenu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.time_prayers:
                Intent m = new Intent(HomePage.this, TimePrayers.class);
                startActivity(m);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }//onCreateOptionsMenu




    }//onOptionsItemSelected
}//end class


