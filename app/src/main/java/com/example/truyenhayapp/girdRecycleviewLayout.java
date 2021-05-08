package com.example.truyenhayapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class girdRecycleviewLayout extends RecyclerView.Adapter<girdRecycleviewLayout.myViewHolder> {


        private ArrayList<ComicRecycleViewClass> myArraylist;

        public static class myViewHolder extends RecyclerView.ViewHolder {

            TextView tvType;
            TextView tvName;
            ImageView ivImage;

            public myViewHolder(@NonNull View itemView) {
                super(itemView);

                tvType = itemView.findViewById(R.id.typeComic);
                tvName= itemView.findViewById(R.id.comicname);
                ivImage=itemView.findViewById(R.id.comicImage);

            }
        }

        public girdRecycleviewLayout(ArrayList<ComicRecycleViewClass> myArraylist) {
            this.myArraylist = myArraylist;
        }

        @NonNull
        @Override
        public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.small_comic_layout, parent, false);
            myViewHolder myViewHolder = new myViewHolder(v);
            return myViewHolder;
        }



    @Override
        public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        ComicRecycleViewClass currentClassview = myArraylist.get(position);
            String comicType = currentClassview.getComicType();
            String comicName= currentClassview.getComicName();



/*      set image resource here
              holder.ivImage.setImageResource("");
        holder.ivImage.setImageDrawable("");*/


            holder.tvType.setText(comicType);
            holder.tvName.setText(comicName);
        }




        @Override
        public int getItemCount() {
            return myArraylist.size();
        }

    }

