package com.example.withallah.java.withallah;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.example.withallah.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class HomePage extends AppCompatActivity

{
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;




    @Override

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);
      Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nav=findViewById(R.id.navmenu);
        drawerLayout=findViewById(R.id.drawer);
         toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
         drawerLayout.addDrawerListener(toggle);
         toggle.syncState();
         nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item)
             {
                 switch (item.getItemId()){
                     case R.id.asmaa:
                         Intent q=new Intent(HomePage.this, AsmaaActivity.class);
                         startActivity(q);
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.settings:
                         Toast.makeText(getApplicationContext(),"settings",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;
                     case R.id.about:
                         Toast.makeText(getApplicationContext(),"about",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;


                 }

                 return true;

             }
         });

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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){

           return true;
        }






       return onOptionsItemSelected(item);
    }//onOptionItemSelected
}//class

