package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProduceActivity extends AppCompatActivity {


    ImageButton homeButton5;
    ImageButton filterButton5;
    ImageButton imageButton8;
    ImageButton shopButton5;
    TextView textView5;
    TextView textView3;
    TextView toplamtutar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce);

        imageButton8=findViewById(R.id.imageButton8);
        homeButton5=findViewById(R.id.homeButton5);
        textView5=findViewById(R.id.textView5);
        shopButton5=findViewById(R.id.shopButton5);
        textView3=findViewById(R.id.textView3);
        toplamtutar=findViewById(R.id.toplamtutar);



        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad1=textView3.getText().toString();

                String fiyat1=textView5.getText().toString();
                String fiyat2=toplamtutar.getText().toString();

                Intent ekle = new Intent(ProduceActivity.this,BasketActivity.class);
                ekle.putExtra("ad1",ad1);

                ekle.putExtra("fiyat1",fiyat1);
                ekle.putExtra("fiyat2",fiyat2);

                startActivity(ekle);
            }
        });
        homeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton5=new Intent(ProduceActivity.this,HomeActivity.class);
                startActivity(homeButton5);
            }
        });


        shopButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton5=new Intent(ProduceActivity.this,BasketActivity.class);
                startActivity(shopButton5);
            }
        });



    }
}