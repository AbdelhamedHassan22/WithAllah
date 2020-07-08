package com.example.withallah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class sebhaFragment extends Fragment  {
   Button plus;
   Button minus;
   Button reset;
   TextView textView;
private int anInt=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.fragment_sebha, container, false);
       plus=v.findViewById(R.id.plus);
       minus=v.findViewById(R.id.minus);
       reset=v.findViewById(R.id.reset);
       textView=v.findViewById(R.id.counter);
       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               anInt=0;
               textView.setText(Integer.toString(anInt));
           }//end onclickreset
       });
       minus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               anInt--;
               textView.setText(Integer.toString(anInt));

           }//end onclickminus
       });
       plus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               anInt++;
               textView.setText(Integer.toString(anInt));
           }//end onclickplus
       });


       return v;



    }//end On Create view
}//end class
