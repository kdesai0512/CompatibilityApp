package com.example.compatibilityapp;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context mContext;
    private Integer[] mImage;
    private String[] mTitle;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imgView;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.title = (TextView) itemView.findViewById(R.id.title);
            this.imgView = (ImageView) itemView.findViewById(R.id.imgcar);


        }
    }

        public CustomAdapter(Context mContext, Integer[] image,String[] title) {
            this.mContext = mContext;
            this.mImage = image;
            this.mTitle = title;
        }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int i) {


        holder.title.setText(mTitle[i]);
        Picasso.with(mContext).load(mImage[i]).into(holder.imgView);

    

        Intent intent = new Intent(mContext, DetailsActivity.class);


    }

    @Override
    public int getItemCount() {
        return mTitle.length;
    }
}