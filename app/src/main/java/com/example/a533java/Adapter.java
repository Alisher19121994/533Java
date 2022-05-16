package com.example.a533java;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHorizontalView> {
    ArrayList<Integer> list;

    public Adapter(ArrayList<Integer> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Adapter.MyHorizontalView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_view, parent, false);
        return new MyHorizontalView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyHorizontalView holder, int position) {
        holder.lottieAnimationView.setAnimation(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHorizontalView extends RecyclerView.ViewHolder {
        LottieAnimationView lottieAnimationView;

        public MyHorizontalView(@NonNull View itemView) {
            super(itemView);
            lottieAnimationView = itemView.findViewById(R.id.lotti_id);
        }
    }
}
