package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {


    ImageButton btnkayitgit;
    ImageButton btngirisyap2;
    ImageButton HomeButton;
    ImageButton FilterButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton accountButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnkayitgit=findViewById(R.id.btnkayitol);
        btngirisyap2=findViewById(R.id.btngirisyap2);
        HomeButton=findViewById(R.id.HomeButton);
        FilterButton=findViewById(R.id.FilterButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        ShopButton=findViewById(R.id.ShopButton);
        accountButton6=findViewById(R.id.accountButton6);

        btnkayitgit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kayitgit =new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(kayitgit);
            }
        });

        btngirisyap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngirisyap2 =new Intent(LoginActivity.this,AccountActivity.class);
                startActivity(btngirisyap2);
            }
        });
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(HomeButton);
            }
        });
        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(LoginActivity.this,FilterActivity.class);
                startActivity(FilterButton);
            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(LoginActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });
        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  ShopButton=new Intent(LoginActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
        accountButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton6=new Intent(LoginActivity.this,LoginActivity.class);
                startActivity(accountButton6);
            }
        });
    }
}