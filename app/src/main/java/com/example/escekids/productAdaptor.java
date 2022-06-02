package com.example.escekids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class productAdaptor extends RecyclerView.Adapter<productAdaptor.ViewHolder> {
    ArrayList<productinfo>products;
    Context context;
    MyOnClickListener listiner;
    ArrayList<productinfo> sepet;
    public productAdaptor(ArrayList<productinfo> products, Context context) {
        this.products = products;
        this.context = context;
        sepet=new ArrayList<productinfo>();
    }

    @NonNull
    @Override
    @NotNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.urun_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position ) {
        holder.imgurunfoto.setImageResource(products.get(position).id );
        holder.txturunad.setText(products.get(position).isim );
        holder.txturunfiyat.setText(""+products.get(position).fiyat);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(context.getApplicationContext(),products.get(position).isim+" "+products.get(position).fiyat, Toast.LENGTH_SHORT).show();
           if (listiner!=null&&position!=RecyclerView.NO_POSITION)
           {
               listiner.MyOnClick(products.get(position),position,sepet );
           }
            }
        });
        holder.sepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sepet.add(products.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public  class ViewHolder  extends RecyclerView.ViewHolder {
        ImageView imgurunfoto;
        TextView txturunad ,txturunfiyat;
        Button sepet;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgurunfoto=itemView.findViewById(R.id.imgurunfoto);
            txturunad=itemView.findViewById(R.id.txturunad);
            txturunfiyat=itemView.findViewById(R.id.txturunfiyat);
            sepet=itemView.findViewById(R.id.btn_sepeteekle);
        }
    }
    public interface MyOnClickListener{
        void MyOnClick(productinfo productinfo,int position,ArrayList<productinfo>sepet);
    }
    public void setOnClickListiner(MyOnClickListener listiner){
        this.listiner=listiner ;
    }
}
