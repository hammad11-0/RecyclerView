package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView r;
    private RecyclerView.Adapter a;
    private RecyclerView.LayoutManager l1,l2;

    List<friends> friendsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friends f0 = new friends(1,"Asad", 1980, "Giglgit");
        friends f1 = new friends(2,"Zubair", 1981, "Lahore");
        friends f2 = new friends(3,"Musa", 1980, "Quetta");
        friends f3 = new friends(4,"Nadeem",1987,"Peshawar");
        friends f4 = new friends(5,"Shahid", 1980, "Karachi");
        friends f5 = new friends(6,"Zia",1987,"Faisalabad ");
        friends f6 = new friends(7,"Badar", 1980, "Rawalpindi");
        friends f7 = new friends(8,"Hashim",1987,"Lahore");


        friendsList.addAll(Arrays.asList(new friends[]{f0,f1,f2,f3,f4,f5,f6,f7,}));
        r = findViewById(R.id.recyclerView);
        l1 = new LinearLayoutManager(this);
        r.setLayoutManager(l1);

        a= new myRVA(friendsList,MainActivity.this);
        r.setAdapter(a);
    }
}