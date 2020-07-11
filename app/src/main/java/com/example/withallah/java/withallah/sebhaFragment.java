package com.example.withallah.java.withallah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.withallah.R;

public class sebhaFragment extends Fragment  {
    ImageView plus;
    ImageView reset;
    TextView textView;
    private int anInt=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.fragment_sebha, container, false);
       plus=v.findViewById(R.id.plus);

       reset=v.findViewById(R.id.reset);
       textView=v.findViewById(R.id.counter);
       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               anInt=0;
               textView.setText(Integer.toString(anInt));
           }//end onclickreset
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
