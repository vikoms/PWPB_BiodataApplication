package com.example.biodataapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Homework_2 extends AppCompatActivity {

    Animation animate;
    Button buttonGuide;
    TextView txtGuide,txtGuide1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_2);

        txtGuide = findViewById(R.id.textGuide);
        txtGuide1 = findViewById(R.id.textGuide1);
        buttonGuide = findViewById(R.id.btnGuide);
        animate = AnimationUtils.loadAnimation(this,R.anim.atg);

        txtGuide.startAnimation(animate);
        txtGuide1.startAnimation(animate);
        buttonGuide.startAnimation(animate);
    }
}
