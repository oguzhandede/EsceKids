package com.example.escekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class  MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Thread timerThread = new Thread(){ //timer kullanarak ekranın 5 saniye sonra diğer ekrana geçmesini söyliyorum
            public void run(){
                try{
                    sleep(3000);//3sn olduğunu belirtiyorum
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);//ekran1'e geçmesini söylüyorum
                    startActivity(intent);
                }
                finish();
            }
        };
        timerThread.start();


    }
}