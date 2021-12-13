package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRVA extends RecyclerView.Adapter<myRVA.MyViewHolder> {
    List<friends> friendsList;



    public myRVA(List<friends> friendsList) {
        this.friendsList = friendsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
