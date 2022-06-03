package com.example.escekids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.widget.ImageButton;

public class PaymentActivity extends AppCompatActivity {

    ImageButton homeButton4;
    ImageButton shopButton4;
    ImageButton filterButton4;
    ImageButton favoriButton4;
    ImageButton accountButton7;
    ImageButton imageButton2;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        homeButton4=findViewById(R.id.homeButton4);
        shopButton4=findViewById(R.id.shopButton4);
        imageButton2=findViewById(R.id.imageButton2);



        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesajver();
            }


        });


        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton4=new Intent(PaymentActivity.this,HomeActivity.class);
                startActivity(homeButton4);
            }
        });
        shopButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopButton4=new Intent(PaymentActivity.this,BasketActivity.class);
                startActivity(shopButton4);
            }
        });

    }
    private void mesajver() {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);
        alert.setTitle("Tebrikler").setCancelable(false).setMessage("Siparişiniz Başarıyla alınmıştır.En kısa sürede teslim edilcektir.").setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

finish();
            }
        }).show();
    }
}