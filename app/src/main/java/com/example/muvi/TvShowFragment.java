package com.example.muvi;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
    RecyclerView rvShow;
    private ArrayList<TvShowModel> list = new ArrayList<>();

    public TvShowFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        rvShow = view.findViewById(R.id.rv_show);
        rvShow.setHasFixedSize(true);

        list.addAll(TvShowData.getListData());
        showRecyclerCardView();
    }


    private void showRecyclerCardView() {
        rvShow.setLayoutManager(linearLayoutManager);
        CardViewTvShowAdapter cardViewShowAdapter = new CardViewTvShowAdapter(list);
        rvShow.setAdapter(cardViewShowAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

}
