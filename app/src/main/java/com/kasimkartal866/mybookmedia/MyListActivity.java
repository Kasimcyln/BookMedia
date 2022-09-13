package com.kasimkartal866.mybookmedia;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

public class MyListActivity extends AppCompatActivity {
    Adapter adapter;
    ArrayList<Book> bookArrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        adapter = new Adapter();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onResume() {
        List<Book> books = RoomExecutor.getInstance(this).getBooks();
        adapter.submitList(books);
        recyclerView.setAdapter(adapter);
        super.onResume();
    }
}