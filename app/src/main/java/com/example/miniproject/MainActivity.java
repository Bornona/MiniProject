package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    public Button but1;
    public EditText edit1,edit2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();

       but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {


            Intent loginIntent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(loginIntent);


    }
}
