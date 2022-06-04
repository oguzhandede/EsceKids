package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class BasketActivity extends AppCompatActivity {

    ImageButton homeButton4;
    ImageButton filterButton4;
    ImageButton favoriButton4;
    ImageButton shopButton4;
    ImageButton accountButton7;

    ImageButton paybtn;
TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView toplamtutar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);


        homeButton4=findViewById(R.id.homeButton4);

        shopButton4=findViewById(R.id.shopButton4);

        paybtn=findViewById(R.id.paybtn);

        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        toplamtutar=findViewById(R.id.toplamtutar);

        Intent verial=getIntent();
        String alinanisim=verial.getStringExtra("ad1");
        String alinanfiyat=verial.getStringExtra("fiyat1");
        String alinanfiyat2=verial.getStringExtra("fiyat2");


        textView7.setText(alinanisim);
        textView8.setText(alinanfiyat);
        textView9.setText(alinanfiyat);
        toplamtutar.setText(alinanfiyat2);



        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton4=new Intent(BasketActivity.this,HomeActivity.class);
                startActivity(homeButton4);
            }
        });


        shopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton4=new Intent(BasketActivity.this,BasketActivity.class);
                startActivity(shopButton4);
            }
        });

        paybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paybtn=new Intent(BasketActivity.this,PaymentActivity.class);
                startActivity(paybtn);
            }
        });

    }
}