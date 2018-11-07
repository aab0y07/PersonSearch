package com.example.abdulhay.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button button1;
    static DB_departments dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton button2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1){
            dp= new DB_compSc();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imageButton2){
            dp= new DB_electEng();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imageButton3){
            dp= new DB_mathNat();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imageButton4){
            dp= new DB_mechAndAutEng();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imageButton5){
            dp= new DB_prodEngAndEcon();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imageButton6){
            dp= new DB_mechAndMedEng();
            Intent intent = new Intent(getApplicationContext(),Staff2Activity.class);
            startActivity(intent);

        }

    }

}
