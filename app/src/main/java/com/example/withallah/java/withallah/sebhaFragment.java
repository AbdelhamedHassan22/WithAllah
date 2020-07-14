package com.example.withallah.java.withallah;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.withallah.R;
import com.getbase.floatingactionbutton.FloatingActionButton;

public class sebhaFragment extends Fragment  {
     ImageView plus;
     TextView textView;
     private int anInt=0;
     FloatingActionButton reset;
     FloatingActionButton add;
     String[] listitems;
     TextView mtextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_sebha, container, false);
    }//end On Create view

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        reset=view.findViewById(R.id.reset);
        plus=view.findViewById(R.id.plus);
         add=view.findViewById(R.id.addSelectedChoice);
        textView=view.findViewById(R.id.counter);
       mtextView=view.findViewById(R.id.text1);




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
      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              listitems=new String[]{"سُبْحَانَ ذِي الْجَبَرُوتِ وَالْمَلَكُوتِ وَالْكِبْرِيَاءِ وَالْعَظَمَةِ","  سُبْحَانَ اللَّهِ الْعَظِيمِ وَبِحَمْدِهِ","سُبْحَانَ الْمَلِكِ الْقُدُّوسِ","للهم صلي وسلم علي سيدنا محمد"};
              AlertDialog.Builder mBuilder =new AlertDialog.Builder(getActivity());
              mBuilder.setTitle("choose an item");
              mBuilder.setSingleChoiceItems(listitems, -1, new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      mtextView.setText(listitems[i]);
                      dialogInterface.dismiss();
                  }
              });
              mBuilder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {

                  }
              });
              AlertDialog mdialog =mBuilder.create();
              mdialog.show();

          }
      });
    }
}//end class
