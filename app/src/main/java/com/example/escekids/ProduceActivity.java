package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProduceActivity extends AppCompatActivity {

    ImageButton accountButton8;
    ImageButton homeButton5;
    ImageButton filterButton5;
    ImageButton favoriButton5;
    ImageButton shopButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce);


        homeButton5=findViewById(R.id.homeButton5);

        shopButton5=findViewById(R.id.shopButton5);


        homeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton5=new Intent(ProduceActivity.this,HomeActivity.class);
                startActivity(homeButton5);
            }
        });


        shopButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton5=new Intent(ProduceActivity.this,BasketActivity.class);
                startActivity(shopButton5);
            }
        });



    }
}