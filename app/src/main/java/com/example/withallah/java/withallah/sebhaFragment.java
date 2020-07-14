package com.example.withallah.java.withallah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.withallah.R;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class sebhaFragment extends Fragment  {
     ImageView plus;
     TextView textView;
     private int anInt=0;
     FloatingActionButton reset;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_sebha, container, false);
    }//end On Create view

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        reset=view.findViewById(R.id.reset);
        plus=view.findViewById(R.id.plus);
        textView=view.findViewById(R.id.counter);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anInt++;
                textView.setText(Integer.toString(anInt));
            }//end onclickplus
        });

      reset.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        anInt=0;
        textView.setText(Integer.toString(anInt));


           }
      });
    }
}//end class
