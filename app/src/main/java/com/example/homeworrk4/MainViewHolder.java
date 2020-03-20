package com.example.homeworrk4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView name, secondName, patronymic, number;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        secondName = itemView.findViewById(R.id.secondName);
        patronymic = itemView.findViewById(R.id.patronymic);
        number = itemView.findViewById(R.id.number);
    }
}
