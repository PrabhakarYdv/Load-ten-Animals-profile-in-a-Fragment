package com.prabhakar.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView animalName;
    private ImageView animalImage;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        intiViews(itemView);
    }

    private void intiViews(View itemView) {
        animalName = itemView.findViewById(R.id.name);
        animalImage = itemView.findViewById(R.id.image);
    }

    public void setAnimalData(AnimalModel animal) {
        animalName.setText(animal.getName());
        animalImage.setImageResource(animal.getImageId());
    }
}
