package com.example.homeworrk4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<String> name, secondName, patronymic;

    public MainAdapter(){
        name = new ArrayList<>();
        secondName = new ArrayList<>();
        patronymic = new ArrayList<>();
    }
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.name.setText(name.get(position));
        holder.secondName.setText(secondName.get(position));
        holder.patronymic.setText(patronymic.get(position));
        holder.number.setText(" ");// Выдает фатальную ошибку когда пишу внутри position...
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
}
