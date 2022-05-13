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
    ImageButton urun1;
    ImageButton homeButton2;
    ImageButton imageButton20;
    ImageButton imageButton19;
    ImageButton imageButton21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        accountButton4=findViewById(R.id.accountButton4);
        filterButton2=findViewById(R.id.filterButton2);
        favoriButton2=findViewById(R.id.favoriButton2);
        shopButton2=findViewById(R.id.shopButton2);
        urun1=findViewById(R.id.urun1);
        homeButton2=findViewById(R.id.homeButton2);
        //marka logoları
        imageButton20=findViewById(R.id.imageButton20);
        imageButton19=findViewById(R.id.imageButton19);
        imageButton21=findViewById(R.id.imageButton21);
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

        urun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urun1=new Intent(HomeActivity.this,ProduceActivity.class);
                startActivity(urun1);
            }
        });
        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton2=new Intent(HomeActivity.this,HomeActivity.class);
                startActivity(homeButton2);
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton20=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(imageButton20);
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton19=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(imageButton19);
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton21=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(imageButton21);
            }
        });

    }

}