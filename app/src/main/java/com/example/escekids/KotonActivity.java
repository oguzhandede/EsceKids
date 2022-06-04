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

public class KotonActivity extends AppCompatActivity {



    ImageButton homeButton4;
    ImageButton shopButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koton);


        homeButton4=findViewById(R.id.homeButton4);
        shopButton4=findViewById(R.id.shopButton4);

        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton4=new Intent(KotonActivity.this,HomeActivity.class);
                startActivity(homeButton4);
            }
        });


        shopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton4=new Intent(KotonActivity.this, HomeActivity.class);
                startActivity(shopButton4);
            }
        });










        ////////////////////////////////////////////////////////////////////////////////
        ArrayList<productinfo> products=new ArrayList<productinfo>();

        products.add(new productinfo("urun1",R.drawable.urun5 ,250));
        products.add(new productinfo("urun2",R.drawable.urun6 ,350));
        products.add(new productinfo("urun3",R.drawable.urun7 ,150));
        products.add(new productinfo("urun4",R.drawable.urun8 ,150));
        RecyclerView list1=findViewById(R.id.list1);
        productAdaptor adaptor=new productAdaptor(products,this);
        list1.setAdapter(adaptor);
        list1.setLayoutManager(new LinearLayoutManager(this));
        adaptor.setOnClickListiner(new productAdaptor.MyOnClickListener() {
            @Override
            public void MyOnClick(productinfo productinfo, int position, ArrayList<productinfo> sepet) {
                Toast.makeText(KotonActivity.this,"Sepete Eklendi:"+sepet.size(),Toast.LENGTH_SHORT).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////

    }
}