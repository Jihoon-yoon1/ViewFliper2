package com.example.viewflipper_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ViewFlipper vf;
//    boolean viState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        vf = (ViewFlipper) findViewById(R.id.viewFlipper);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                vf.showPrevious();
//                if(!viState){
//                    vf.startFlipping();
//                    viState=true;
//                    vf.setFlipInterval(500); //0.5초, 1000이면 1초
//                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               vf.showNext();
//               if(viState){
//                   vf.stopFlipping();
//                   viState=false;
//               }
           }
        });
    }
}