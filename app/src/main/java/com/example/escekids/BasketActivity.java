package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BasketActivity extends AppCompatActivity {

    ImageButton homeButton4;
    ImageButton filterButton4;
    ImageButton favoriButton4;
    ImageButton shopButton4;
    ImageButton accountButton7;
    ImageButton imageButton2;
    ImageButton paybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);


        homeButton4=findViewById(R.id.homeButton4);
        filterButton4=findViewById(R.id.filterButton4);
        favoriButton4=findViewById(R.id.favoriButton4);
        shopButton4=findViewById(R.id.shopButton4);
        accountButton7=findViewById(R.id.accountButton7);
        paybtn=findViewById(R.id.paybtn);

        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton4=new Intent(BasketActivity.this,HomeActivity.class);
                startActivity(homeButton4);
            }
        });

        filterButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton4=new Intent(BasketActivity.this,FilterActivity.class);
                startActivity(filterButton4);
            }
        });
        favoriButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton4=new Intent(BasketActivity.this,FavoriteActivity.class);
                startActivity(favoriButton4);
            }
        });
        shopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton4=new Intent(BasketActivity.this,BasketActivity.class);
                startActivity(shopButton4);
            }
        });
        accountButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton7=new Intent(BasketActivity.this,LoginActivity.class);
                startActivity(accountButton7);
            }
        });
        paybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paybtn=new Intent(BasketActivity.this,PaymentActivity.class);
                startActivity(paybtn);
            }
        });

    }
}