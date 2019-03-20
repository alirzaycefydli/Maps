package com.example.maps.ViewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.maps.Interfaces.IRecyclerItemClickListener;
import com.example.maps.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    IRecyclerItemClickListener listener;
   public TextView user_mail;

    public void setListener(IRecyclerItemClickListener listener) {
        this.listener = listener;
    }

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        user_mail = itemView.findViewById(R.id.single_user_name);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onItemClickListener(v, getAdapterPosition());
    }
}
