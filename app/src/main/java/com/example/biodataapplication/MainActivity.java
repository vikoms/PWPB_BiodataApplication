package com.example.biodataapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView naufal,viko,firman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        naufal = (CardView) findViewById(R.id.cardview_naufal);
        naufal.setOnClickListener(this);

        viko = (CardView) findViewById(R.id.cardview_viko);
        viko.setOnClickListener(this);

        firman = (CardView) findViewById(R.id.cardview_firman);
        firman.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardview_naufal:


                break;
            case R.id.cardview_firman:


                break;
            case R.id.cardview_viko:
                Intent viko = new Intent(MainActivity.this, VikoActivity.class);
                startActivity(viko);
                break;
        }
    }
}
