package com.example.withallah.java.withallah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import com.example.withallah.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

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
                Intent myintent=new Intent(MainActivity.this, HomePage.class);
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