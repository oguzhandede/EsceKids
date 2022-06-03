package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class urun_item extends AppCompatActivity {


    TextView txturunad;
    TextView txturunfiyat;
    Button btn_sepeteekle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urun_item);

        txturunad=findViewById(R.id.txturunad);
        txturunfiyat=findViewById(R.id.txturunfiyat);
        btn_sepeteekle=findViewById(R.id.btn_sepeteekle);



        btn_sepeteekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad1=txturunad.getText().toString();
                String fiyat1=txturunfiyat.getText().toString();
                Intent ekle = new Intent(urun_item.this,BasketActivity.class);
                ekle.putExtra("ad1",ad1);
                ekle.putExtra("fiyat1",fiyat1);

                startActivity(ekle);
            }
        });

    }
}