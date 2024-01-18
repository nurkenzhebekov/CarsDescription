package com.example.carsdescription;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CarsDescriptionViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCarsDescription;
    public CarsDescriptionViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCarsDescription = itemView.findViewById(R.id.tv_cars_description);
    }

    public void onBind(String carsDescription) {
        if (carsDescription.equals("Nissan: Skyline GTR")) {
            Context context = tvCarsDescription.getContext();
            tvCarsDescription.setTextColor(ContextCompat.getColor(context, R.color.red));
        }
        tvCarsDescription.setText(carsDescription);
    }
}
