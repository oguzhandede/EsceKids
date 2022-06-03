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


        HomeButton=findViewById(R.id.HomeButton);

        ShopButton=findViewById(R.id.ShopButton);



        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ShopButton=new Intent(CommunicationActivity.this,BasketActivity.class);
                startActivity(ShopButton);
            }
        });
    }
}