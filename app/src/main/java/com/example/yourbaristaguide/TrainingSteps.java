package com.example.yourbaristaguide;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrainingSteps extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_steps);

        b1 = findViewById(R.id.beanButton);
        b2 = findViewById(R.id.grindButton);
        b3 = findViewById(R.id.machineButton);
        b4 = findViewById(R.id.milkButton);
        b5 = findViewById(R.id.roastButton);
        b6 = findViewById(R.id.shotButton);
        b7 = findViewById(R.id.tempButton);
        b8 = findViewById(R.id.typesOfButton);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Bean.class);
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Grind.class);
                startActivity(intent);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Machine.class);
                startActivity(intent);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Milk.class);
                startActivity(intent);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Roast.class);
                startActivity(intent);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Shot.class);
                startActivity(intent);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, Temp.class);
                startActivity(intent);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TrainingSteps.this, TypesOf.class);
                startActivity(intent);
            }
        });


    }

}