package com.sematecjavaproject.cloudyweatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapterActivity extends RecyclerView.Adapter<ItemAdapterActivity.ItemAdapterViewHolder> {

    @NonNull
    @Override
    public ItemAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.acitvity_item, parent, false);
        ItemAdapterViewHolder itemAdapterViewHolder = new ItemAdapterViewHolder(view);
        return itemAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class ItemAdapterViewHolder extends RecyclerView.ViewHolder {

        public ItemAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
