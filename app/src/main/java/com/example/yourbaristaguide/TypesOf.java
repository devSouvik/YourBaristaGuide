package com.example.yourbaristaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypesOf extends AppCompatActivity {

    private Button b9, b10, b11, b12, b13, b14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of);

        b9  = findViewById(R.id.button);
        b10 = findViewById(R.id.button2);
        b11 = findViewById(R.id.button3);
        b12 = findViewById(R.id.button4);
        b13 = findViewById(R.id.button5);
        b14 = findViewById(R.id.button6);


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Espresso.class);
                startActivity(intent);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Americano.class);
                startActivity(intent);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Capuccino.class);
                startActivity(intent);
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Latte.class);
                startActivity(intent);
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Mocha.class);
                startActivity(intent);
            }
        });


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypesOf.this, Macciato.class);
                startActivity(intent);
            }
        });

    }

}

