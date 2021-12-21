package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRVA extends RecyclerView.Adapter<myRVA.MyViewHolder> {
    List<friends> friendsList;
    Activity mAct;


    public myRVA(List<friends> friendsList, Activity mAct) {
        this.friendsList = friendsList;
        this.mAct = mAct;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friends, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override

    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data=friendsList.get(position);
        holder.textViewFriendName.setText(holder.data.getName());
        holder.textViewdateFriend.setText(String.valueOf(holder.data.getDob()));
        //holder.imageViewFriend.setImageResource(holder.data.getId());
        holder.textViewCityFriend.setText(holder.data.getCity());
        int a;
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewFriend;
        TextView textViewFriendName;
        TextView textViewdateFriend;
        TextView textViewCityFriend;
        friends data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFriend = itemView.findViewById(R.id.imageView);
            textViewFriendName = itemView.findViewById(R.id.textView);
            textViewdateFriend = itemView.findViewById(R.id.textView2);
            textViewCityFriend = itemView.findViewById(R.id.textView3);
        }

    }
}
