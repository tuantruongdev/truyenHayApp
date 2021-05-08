package com.example.truyenhayapp.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.truyenhayapp.ComicRecycleViewClass;
import com.example.truyenhayapp.R;
import com.example.truyenhayapp.girdRecycleviewLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public static int calculateNoOfColumns(Context context, float columnWidthDp) { // For example columnWidthdp=180
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float screenWidthDp = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (screenWidthDp / columnWidthDp + 0.5); // +0.5 for correct rounding to int.
        return noOfColumns;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.girdRecycleview);
        ArrayList<ComicRecycleViewClass> arrayList = new ArrayList<ComicRecycleViewClass>();

        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling1"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling2"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling3"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling4"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling5"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling6"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling1"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling2"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling3"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling4"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling5"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling6"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling1"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling2"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling3"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling4"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling5"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling6"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling1"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling2"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling3"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling4"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling5"));
        arrayList.add(new ComicRecycleViewClass("Hành động","Solo leveling6"));
        int mNoOfColumns = calculateNoOfColumns(getContext(),100);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), mNoOfColumns));

        RecyclerView.Adapter mAdapter;


        mAdapter = new girdRecycleviewLayout(arrayList);

        recyclerView.setAdapter(mAdapter);



        return root;
    }
}