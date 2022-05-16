package com.example.a533java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
    }

    public void open() {
        recyclerView = findViewById(R.id.horizontal_main_recyclerview_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.raw.c_2);
        list.add(R.raw.delivering);
        list.add(R.raw.c_2);
        list.add(R.raw.cycling);
        list.add(R.raw.c_2);
        list.add(R.raw.c_2);
        list.add(R.raw.delivering);
        list.add(R.raw.cycling);
        list.add(R.raw.delivering);
        list.add(R.raw.c_2);
        list.add(R.raw.cycling);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        Adapter adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }
}