package com.example.escekids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AccountInfoActivity extends AppCompatActivity {

    ImageButton accountButton;
    ImageButton HomeButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton FilterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info);

        accountButton=findViewById(R.id.accountButton);
        HomeButton=findViewById(R.id.HomeButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        ShopButton=findViewById(R.id.ShopButton);
        FilterButton=findViewById(R.id.FilterButton);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton=new Intent(AccountInfoActivity.this,LoginActivity.class);
                startActivity(accountButton);
            }
        });
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(AccountInfoActivity.this,HomeActivity.class);
                startActivity(HomeButton);
            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(AccountInfoActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });
        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(AccountInfoActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(AccountInfoActivity.this,FilterActivity.class);
                startActivity(FilterButton);
            }
        });






    }
}