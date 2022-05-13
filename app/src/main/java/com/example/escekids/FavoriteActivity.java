package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FavoriteActivity extends AppCompatActivity {
    ImageButton homeButton3;
    ImageButton filterButton3;
    ImageButton favoriButton3;
    ImageButton shopButton3;
    ImageButton accountButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        homeButton3=findViewById(R.id.homeButton3);
        filterButton3=findViewById(R.id.filterButton3);
        favoriButton3=findViewById(R.id.favoriButton3);
        shopButton3=findViewById(R.id.shopButton3);
        accountButton5=findViewById(R.id.accountButton5);


        homeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton3=new Intent(FavoriteActivity.this,HomeActivity.class);
                startActivity(homeButton3);
            }
        });
        filterButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton3=new Intent(FavoriteActivity.this,FilterActivity.class);
                startActivity(filterButton3);
            }
        });
        favoriButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton3=new Intent(FavoriteActivity.this,FavoriteActivity.class);
                startActivity(favoriButton3);
            }
        });
        shopButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton3=new Intent(FavoriteActivity.this,BasketActivity.class);
                startActivity(shopButton3);
            }
        });
        accountButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton5=new Intent(FavoriteActivity.this,LoginActivity.class);
                startActivity(accountButton5);
            }
        });


    }
}