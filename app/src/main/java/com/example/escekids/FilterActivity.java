package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FilterActivity extends AppCompatActivity {
    ImageButton homeButton;
    ImageButton filterButton;
    ImageButton favoriButton;
    ImageButton shopButton;
    ImageButton accountButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        homeButton=findViewById(R.id.homeButton);
        filterButton=findViewById(R.id.filterButton);
        favoriButton=findViewById(R.id.favoriButton);
        shopButton=findViewById(R.id.shopButton);
        accountButton3=findViewById(R.id.accountButton3);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton=new Intent(FilterActivity.this,HomeActivity.class);
                startActivity(homeButton);
            }
        });
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton=new Intent(FilterActivity.this,FilterActivity.class);
                startActivity(filterButton);
            }
        });
        favoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton=new Intent(FilterActivity.this,FavoriteActivity.class);
                startActivity(favoriButton);
            }
        });
        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton=new Intent(FilterActivity.this,BasketActivity.class);
                startActivity(shopButton);
            }
        });
        accountButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton3=new Intent(FilterActivity.this,LoginActivity.class);
                startActivity(accountButton3);
            }
        });
    }
}