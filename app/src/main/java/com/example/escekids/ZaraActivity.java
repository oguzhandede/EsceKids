package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class ZaraActivity extends AppCompatActivity {

    ImageButton homeButton5;
    ImageButton shopButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zara);

        homeButton5=findViewById(R.id.homeButton5);
        shopButton5=findViewById(R.id.shopButton5);


        ArrayList<productinfo> products=new ArrayList<productinfo>();

        products.add(new productinfo("urun1",R.drawable.urun1 ,250));
        products.add(new productinfo("urun2",R.drawable.urun5 ,350));
        products.add(new productinfo("urun3",R.drawable.urun9 ,150));
        products.add(new productinfo("urun4",R.drawable.urun2 ,150));
        RecyclerView list1=findViewById(R.id.list1);
        productAdaptor adaptor=new productAdaptor(products,this);
        list1.setAdapter(adaptor);
        list1.setLayoutManager(new LinearLayoutManager(this));
        adaptor.setOnClickListiner(new productAdaptor.MyOnClickListener() {
            @Override
            public void MyOnClick(productinfo productinfo, int position, ArrayList<productinfo> sepet) {
                Toast.makeText(ZaraActivity.this,"Sepete Eklendi:"+sepet.size(),Toast.LENGTH_SHORT).show();
            }
        });


        shopButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton5=new Intent(ZaraActivity.this,BasketActivity.class);
                startActivity(shopButton5);
            }
        });

        homeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton5=new Intent(ZaraActivity.this,HomeActivity.class);
                startActivity(homeButton5);
            }
        });
    }
}