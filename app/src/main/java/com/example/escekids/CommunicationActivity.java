package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CommunicationActivity extends AppCompatActivity {

    ImageButton accountButton;
    ImageButton HomeButton;
    ImageButton FavoriButton;
    ImageButton ShopButton;
    ImageButton FilterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        FilterButton=findViewById(R.id.FilterButton);
        HomeButton=findViewById(R.id.HomeButton);
        FavoriButton=findViewById(R.id.FavoriButton);
        accountButton=findViewById(R.id.accountButton);
        ShopButton=findViewById(R.id.ShopButton);


        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilterButton=new Intent(CommunicationActivity.this,FilterActivity.class);
                startActivity(FilterButton);
            }
        });
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeButton=new Intent(CommunicationActivity.this,HomeActivity.class);
                startActivity(HomeButton);
            }
        });
        FavoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FavoriButton=new Intent(CommunicationActivity.this,FavoriteActivity.class);
                startActivity(FavoriButton);
            }
        });
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton=new Intent(CommunicationActivity.this,LoginActivity.class);
                startActivity(accountButton);
            }
        });
        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(CommunicationActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
    }
}