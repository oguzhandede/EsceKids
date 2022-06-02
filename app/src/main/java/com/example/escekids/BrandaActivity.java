package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BrandaActivity extends AppCompatActivity {
    ImageButton homeButton3;
    ImageButton filterButton3;
    ImageButton favoriButton3;
    ImageButton shopButton3;
    ImageButton accountButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branda);

        homeButton3=findViewById(R.id.homeButton3);
        filterButton3=findViewById(R.id.filterButton3);
        favoriButton3=findViewById(R.id.favoriButton3);
        shopButton3=findViewById(R.id.shopButton3);
        accountButton5=findViewById(R.id.accountButton5);

        homeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton3=new Intent(BrandaActivity.this,HomeActivity.class);
                startActivity(homeButton3);
            }
        });
        filterButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterButton3=new Intent(BrandaActivity.this,FilterActivity.class);
                startActivity(filterButton3);
            }
        });
        favoriButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriButton3=new Intent(BrandaActivity.this,FavoriteActivity.class);
                startActivity(favoriButton3);
            }
        });
        shopButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton3=new Intent(BrandaActivity.this,BasketActivity.class);
                startActivity(shopButton3);
            }
        });
        accountButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountButton5=new Intent(BrandaActivity.this,LoginActivity.class);
                startActivity(accountButton5);
            }
        });

        ArrayList<productinfo> products=new ArrayList<productinfo>();

        products.add(new productinfo("urun1",R.drawable.urun1 ,250));
        products.add(new productinfo("urun2",R.drawable.urun2 ,350));
        products.add(new productinfo("urun3",R.drawable.urun3 ,150));
        products.add(new productinfo("urun4",R.drawable.urun4 ,150));
        RecyclerView list1=findViewById(R.id.list1);
        productAdaptor adaptor=new productAdaptor(products,this);
        list1.setAdapter(adaptor);
        list1.setLayoutManager(new LinearLayoutManager(this));
        adaptor.setOnClickListiner(new productAdaptor.MyOnClickListener() {
            @Override
            public void MyOnClick(productinfo productinfo, int position, ArrayList<productinfo> sepet) {
                Toast.makeText(BrandaActivity.this,"Sepete Eklendi:"+sepet.size(),Toast.LENGTH_SHORT).show();
            }
        });

    }}