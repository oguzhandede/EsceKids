package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OrdersActivity extends AppCompatActivity {
    ImageButton accountButton;
    ImageButton HomeButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton FilterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        FilterButton=findViewById(R.id.FilterButton);
        ShopButton=findViewById(R.id.ShopButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        HomeButton=findViewById(R.id.HomeButton);
        accountButton=findViewById(R.id.accountButton);


        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton=new Intent(OrdersActivity.this,LoginActivity.class);
                startActivity(accountButton);
            }
        });
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(OrdersActivity.this,HomeActivity.class);
                startActivity(HomeButton);
            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(OrdersActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });
        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(OrdersActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(OrdersActivity.this,FilterActivity.class);
                startActivity(FilterButton);
            }
        });


    }
}