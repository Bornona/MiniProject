package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third1Activity extends AppCompatActivity {

    public Button but3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);

        but3= (Button) findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent logoutIntent = new Intent(Third1Activity.this, SecondActivity.class);

                startActivity(logoutIntent);
            }
        });
    }
}
