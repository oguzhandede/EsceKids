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
    ImageView imageView58;
    TextView textView2,textView5;
    TextView textView;

    ImageButton imageButton3;
    TextView textView3;

    ImageButton imageButton4;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        shopButton2=findViewById(R.id.shopButton2);

        homeButton2=findViewById(R.id.homeButton2);
        //marka logoları

        //marka logoları
        imageButton14=findViewById(R.id.imageButton14);
        textView2=findViewById(R.id.textView2);
        textView5=findViewById(R.id.textView5);


        imageButton=findViewById(R.id.imageButton);
        textView=findViewById(R.id.textView);

        imageButton3=findViewById(R.id.imageButton3);
        textView3=findViewById(R.id.textView3);

        imageButton4=findViewById(R.id .imageButton4);
        textView4=findViewById(R.id.textView4);

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String koton=textView.getText().toString();


                    Intent markakoton = new Intent(HomeActivity.this,BrandaActivity.class);
                    markakoton.putExtra("koton",koton);


                    startActivity(markakoton);
                }
            });




        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lcw=textView3.getText().toString();


                Intent markalwc = new Intent(HomeActivity.this,BrandaActivity.class);
                markalwc.putExtra("lcw",lcw);


                startActivity(markalwc);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String zara=textView4.getText().toString();


                Intent markazara = new Intent(HomeActivity.this,BrandaActivity.class);
                markazara.putExtra("zara",zara);


                startActivity(markazara);
            }
        });





        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim1=textView2.getText().toString();
                String fiyat1=textView5.getText().toString();

                Intent ekle = new Intent(HomeActivity.this,BasketActivity.class);
                ekle.putExtra("ad1",isim1);
                ekle.putExtra("fiyat1",fiyat1);

                startActivity(ekle);
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