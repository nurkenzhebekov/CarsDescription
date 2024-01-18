package com.example.carsdescription;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsDescriptionAdapter extends RecyclerView.Adapter<CarsDescriptionViewHolder> {

    private ArrayList<String> carsDescriptionList;

    public CarsDescriptionAdapter(ArrayList<String> carsDescriptionList) {
        this.carsDescriptionList = carsDescriptionList;
    }

    @NonNull
    @Override
    public CarsDescriptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsDescriptionViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cars_description, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsDescriptionViewHolder holder, int position) {
        holder.onBind(carsDescriptionList.get(position));
    }

    @Override
    public int getItemCount() {
        return carsDescriptionList.size();
    }
}
