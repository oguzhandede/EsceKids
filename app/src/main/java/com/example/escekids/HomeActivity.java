package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    ImageButton accountButton4;
    ImageButton filterButton2;
    ImageButton favoriButton2;
    ImageButton shopButton2;

    ImageButton homeButton2;
    ImageButton imageButton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        accountButton4=findViewById(R.id.accountButton4);
        filterButton2=findViewById(R.id.filterButton2);
        favoriButton2=findViewById(R.id.favoriButton2);
        shopButton2=findViewById(R.id.shopButton2);

        homeButton2=findViewById(R.id.homeButton2);
        //marka logoları
        imageButton10=findViewById(R.id.imageButton10);
        //marka logoları

        accountButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton4=new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(accountButton4);
            }
        });

        filterButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton2=new Intent(HomeActivity.this,FilterActivity.class);
                startActivity(filterButton2);
            }
        });

        favoriButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton2= new Intent(HomeActivity.this,FavoriteActivity.class);
                startActivity(favoriButton2);
            }
        });

        shopButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton2=new Intent(HomeActivity.this,BasketActivity.class);
                startActivity(shopButton2);
            }
        });


        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton2=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(homeButton2);
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton10=new Intent(HomeActivity.this,BrandaActivity.class);
            }
        });


    }

}