package com.example.muvi;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
    RecyclerView rvMovie;
    private ArrayList<MovieModel> list = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerCardView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    private void showRecyclerCardView(){
        rvMovie.setLayoutManager(linearLayoutManager);
        CardViewMovieAdapter cardViewHeroAdapter = new CardViewMovieAdapter(list);
        rvMovie.setAdapter(cardViewHeroAdapter);
    }

}
