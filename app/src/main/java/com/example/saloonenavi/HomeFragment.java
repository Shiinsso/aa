package com.example.saloonenavi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.saloonenavi.Fragments.BookingStep1Fragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    Activity context;

    Button gobs1;
    private ArrayList<salons> newsArrayList;
    private String[] newsHeading;
    private int[] imageResourceID;
    private RecyclerView recyclerview;

    @Nullable
        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                 Bundle savedInstanceState){
        context = getActivity();
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;

        }
        public void onStart(){
        super.onStart();
        Button btn = (Button) context.findViewById(R.id.bs1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SetDateS1.class);
                startActivity(intent);
            }
        });
        }
    private void setContentView(DrawerLayout root) {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        
        recyclerview = view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        MyAdapter myAdapter = new MyAdapter(getContext(), newsArrayList);
        recyclerview.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

        
    }

    private void dataInitialize() {

        newsArrayList = new ArrayList<>();
        newsHeading = new String[]{
                getString(R.string.pastaIngredients),
                getString(R.string.maggiIngredients),
                getString(R.string.cakeIngredients),
                getString(R.string.pancakeIngredients),
                getString(R.string.burgerIngredients),
                getString(R.string.friesIngredients)
        };
        imageResourceID = new int[]{
                R.drawable.s5,
                R.drawable.s6,
                R.drawable.s7,
                R.drawable.s8,
                R.drawable.s9,
                R.drawable.s10
        };

        for (int i = 0; i < newsHeading.length; i++){
            salons news = new salons(newsHeading[i],imageResourceID[i]);
            newsArrayList.add(news);
        }

    }

}
