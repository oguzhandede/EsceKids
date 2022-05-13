package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AccountActivity extends AppCompatActivity {

    ImageButton HomeButton;
    ImageButton imageButton6;
    ImageButton imageButton12;
    ImageButton imageButton9;
    ImageButton FilterButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton accountButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        imageButton6=findViewById(R.id.imageButton6);
        imageButton12=findViewById(R.id.imageButton12);
        imageButton9=findViewById(R.id.imageButton9);
        HomeButton=findViewById(R.id.HomeButton);
        FilterButton=findViewById(R.id.FilterButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        ShopButton=findViewById(R.id.ShopButton);
        accountButton=findViewById(R.id.accountButton);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton6=new Intent(AccountActivity.this,AccountInfoActivity.class);
                startActivity(imageButton6);
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton12=new Intent(AccountActivity.this,OrdersActivity.class);
                startActivity(imageButton12);
            }
        });

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton9=new Intent(AccountActivity.this,CommunicationActivity.class);
                startActivity(imageButton9);
            }
        });
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(AccountActivity.this,HomeActivity.class);
                startActivity(HomeButton);
            }
        });
        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(AccountActivity.this,FilterActivity.class);
                startActivity(FilterButton);

            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(AccountActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });

        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(AccountActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton=new Intent(AccountActivity.this,LoginActivity.class);
                startActivity(accountButton);
            }
        });






    }
}