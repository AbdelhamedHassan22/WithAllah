package com.example.withallah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout aa;
private static  int page1 =1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aa=findViewById(R.id.mainscreen);
        aa.setOnClickListener(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                Intent myintent=new Intent(MainActivity.this,HomePage.class);
                startActivity(myintent);


            }//end run
        },page1);



    }//end onCreate


         @Override
    public void onClick(View view) {
        Intent myintent=new Intent(MainActivity.this,HomePage.class);
        startActivity(myintent);

    }//end onClick
}//end class