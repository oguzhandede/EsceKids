package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PaymentActivity extends AppCompatActivity {

    ImageButton homeButton4;
    ImageButton shopButton4;
    ImageButton filterButton4;
    ImageButton favoriButton4;
    ImageButton accountButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        homeButton4=findViewById(R.id.homeButton4);
        shopButton4=findViewById(R.id.shopButton4);
        filterButton4=findViewById(R.id.filterButton4);
        favoriButton4=findViewById(R.id.favoriButton4);
        accountButton7=findViewById(R.id.accountButton7);



        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton4=new Intent(PaymentActivity.this,HomeActivity.class);
                startActivity(homeButton4);
            }
        });
        shopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton4=new Intent(PaymentActivity.this,BasketActivity.class);
                startActivity(shopButton4);
            }
        });
        filterButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton4=new Intent(PaymentActivity.this,FilterActivity.class);
                startActivity(filterButton4);
            }
        });
        favoriButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton4=new Intent(PaymentActivity.this,FavoriteActivity.class);
                startActivity(favoriButton4);
            }
        });
        accountButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton7=new Intent(PaymentActivity.this,LoginActivity.class);
                startActivity(accountButton7);
            }
        });
    }
}