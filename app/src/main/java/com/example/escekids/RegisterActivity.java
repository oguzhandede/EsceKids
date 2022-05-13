package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RegisterActivity extends AppCompatActivity {

    ImageButton HomeButton;
    ImageButton FilterButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton accountButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        HomeButton=findViewById(R.id.HomeButton);
        FilterButton=findViewById(R.id.FilterButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        ShopButton=findViewById(R.id.ShopButton);
        accountButton2=findViewById(R.id.accountButton2);


        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(RegisterActivity.this,HomeActivity.class);
                startActivity(HomeButton);
            }
        });

        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(RegisterActivity.this,FilterActivity.class);
                startActivity(FilterButton);
            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(RegisterActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });
        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(RegisterActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
        accountButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton2=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(accountButton2);
            }
        });

    }
}