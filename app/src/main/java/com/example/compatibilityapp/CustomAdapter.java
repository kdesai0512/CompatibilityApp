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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context mContext;
    private Integer[] mImage;
    private String[] mTitle;
    private String[] mPercent;
    private String[] mTitleLast;
    private String[] mDescriptions;





    public CustomAdapter(Context mContext, Integer[] image,String[] title, String[] percent, String[] title2, String[] desc) {
            this.mContext = mContext;
            this.mImage = image;
            this.mTitle = title;
            this.mPercent = percent;
            this.mTitleLast = title2;
            this.mDescriptions = desc;


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
        holder.titleLast.setText(mTitleLast[i]);
        holder.descs.setText(mDescriptions[i]);
        Picasso.with(mContext).load(mImage[i]).into(holder.imgView);



        holder.mView.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                Toast.makeText(mContext.getApplicationContext(),
                        "You are " + mPercent[i] + "% compatible with " + mTitle[i] + ". ", Toast.LENGTH_SHORT).show();

            }
        });





    }

    @Override
    public int getItemCount() {
        return mTitle.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView titleLast;
        TextView descs;
        ImageView imgView;
        View mView;



        public MyViewHolder(View itemView) {
            super(itemView);

            this.title = (TextView) itemView.findViewById(R.id.title);
            this.titleLast = (TextView) itemView.findViewById(R.id.titleLast);
            this.descs = (TextView) itemView.findViewById(R.id.descrip);
            this.imgView = (ImageView) itemView.findViewById(R.id.imgcar);
            mView = itemView;









        }
    }
}