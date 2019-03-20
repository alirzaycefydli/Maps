package com.example.maps.ViewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maps.R;

public class FriendRequestViewHolder extends RecyclerView.ViewHolder {


     public TextView user_mail;
     public ImageView btn_accept,btn_delete;

    public FriendRequestViewHolder(@NonNull View itemView) {
        super(itemView);
        user_mail = itemView.findViewById(R.id.single_request_user_name);
        btn_accept=itemView.findViewById(R.id.single_request_accept);
        btn_delete=itemView.findViewById(R.id.single_request_delete);
    }
}

