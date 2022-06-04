package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    ImageButton shopButton2;

    ImageButton homeButton2;

    ImageButton imageButton;
    ImageButton imageButton14;

    TextView textView2,textView5;
    TextView textView;

    ImageButton imageButton3;
    TextView textView3;

    ImageButton imageButton4;
    TextView textView4;
    ImageButton imageButton5;
    TextView toplamtutar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toplamtutar=findViewById(R.id.toplamtutar);
        imageButton5=findViewById(R.id.imageButton5);

        shopButton2=findViewById(R.id.shopButton2);

        homeButton2=findViewById(R.id.homeButton2);
        //marka logoları
        imageButton=findViewById(R.id.imageButton);
        //marka logoları
        imageButton14=findViewById(R.id.imageButton14);
        textView2=findViewById(R.id.textView2);
        textView5=findViewById(R.id.textView5);

        imageButton4=findViewById(R.id.imageButton4);


        imageButton3=findViewById(R.id.imageButton3);
        textView3=findViewById(R.id.textView3);


        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton5=new Intent(HomeActivity.this,ProduceActivity.class);
                startActivity(imageButton5);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton3=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(imageButton3);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton4=new Intent(HomeActivity.this,ZaraActivity.class);
                startActivity(imageButton4);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageButton=new Intent( HomeActivity.this,KotonActivity.class);
                startActivity(imageButton);
            }
        });





        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim1=textView2.getText().toString();
                String fiyat1=textView5.getText().toString();
                String fiyat2=toplamtutar.getText().toString();

                Intent ekle = new Intent(HomeActivity.this,BasketActivity.class);
                ekle.putExtra("ad1",isim1);
                ekle.putExtra("fiyat1",fiyat1);
                ekle.putExtra("fiyat2",fiyat2);

                startActivity(ekle);
            }
        });







        ArrayList<productinfo> products=new ArrayList<productinfo>();


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

            }

        });





/////////////////////////////////////////////////////////////////////////////////////////////
        shopButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton2=new Intent(HomeActivity.this,BasketActivity.class);
                startActivity(shopButton2);
            }
        });


        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton2=new Intent(HomeActivity.this,BrandaActivity.class);
                startActivity(homeButton2);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////

    }

}