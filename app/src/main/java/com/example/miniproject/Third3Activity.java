package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Third3Activity extends AppCompatActivity {

    public Button but4;
    public ImageView totalcase1,totalcase2,deathcase1,deathcase2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);

        but4=(Button) findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent logoutIntent = new Intent(Third3Activity.this, SecondActivity.class);

                startActivity(logoutIntent);
            }
        });

        totalcase1= (ImageView) findViewById(R.id.image1);
        totalcase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.image1)
                {
                    totalcase1.setVisibility(View.GONE);
                    totalcase2.setVisibility(View.VISIBLE);
                }
            }
        });
        totalcase2= (ImageView) findViewById(R.id.image2);
        totalcase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.image2)
                {

                    totalcase2.setVisibility(View.GONE);
                    totalcase1.setVisibility(View.VISIBLE);
                }
            }
        });

        deathcase1=(ImageView) findViewById(R.id.image3);
        deathcase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.image3)
                {

                    deathcase1.setVisibility(View.GONE);
                    deathcase2.setVisibility(View.VISIBLE);
                }
            }
        });
        deathcase2=(ImageView) findViewById(R.id.image4);
        deathcase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.image4)
                {

                    deathcase2.setVisibility(View.GONE);
                    deathcase1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
