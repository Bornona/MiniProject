package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    public Button but2;
    public RadioButton radio1,radio2,radio3,radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        but2 = (Button) findViewById(R.id.but3);
        but2.setOnClickListener(this);

        radio1= (RadioButton) findViewById(R.id.radio1);
       radio1.setOnClickListener(this);

        radio2= (RadioButton) findViewById(R.id.radio2);
        radio2.setOnClickListener(this);

        radio3= (RadioButton) findViewById(R.id.radio3);
        radio3.setOnClickListener(this);

        radio4= (RadioButton) findViewById(R.id.radio4);
        radio4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.but3) {
            Intent logoutIntent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(logoutIntent);
        }
        else if(v.getId()==R.id.radio1) {
            Intent nextPageIntent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(nextPageIntent);
        }
        else if(v.getId()==R.id.radio2) {
            Intent next2PageIntent = new Intent(SecondActivity.this, Third1Activity.class);
            startActivity(next2PageIntent);
        }
        else if(v.getId()==R.id.radio3) {
            Intent next3PageIntent = new Intent(SecondActivity.this, Third2Activity.class);
            startActivity(next3PageIntent);
        }
        else if(v.getId()==R.id.radio4) {
            Intent next4PageIntent = new Intent(SecondActivity.this, Third3Activity.class);
            startActivity(next4PageIntent);
        }

    }
}
