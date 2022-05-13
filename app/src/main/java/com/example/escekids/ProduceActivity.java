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
        filterButton5=findViewById(R.id.filterButton5);
        favoriButton5=findViewById(R.id.favoriButton5);
        shopButton5=findViewById(R.id.shopButton5);
        accountButton8=findViewById(R.id.accountButton8);

        homeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton5=new Intent(ProduceActivity.this,HomeActivity.class);
                startActivity(homeButton5);
            }
        });

        filterButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton5=new Intent(ProduceActivity.this,FilterActivity.class);
                startActivity(filterButton5);
            }
        });
        favoriButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton5=new Intent(ProduceActivity.this,FavoriteActivity.class);
                startActivity(favoriButton5);
            }
        });
        shopButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton5=new Intent(ProduceActivity.this,BasketActivity.class);
                startActivity(shopButton5);
            }
        });
        accountButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton8=new Intent(ProduceActivity.this,AccountActivity.class);
                startActivity(accountButton8);
            }
        });


    }
}