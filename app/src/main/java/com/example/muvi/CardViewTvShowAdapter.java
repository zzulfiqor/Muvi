package com.example.muvi;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CardViewTvShowAdapter extends RecyclerView.Adapter<CardViewTvShowAdapter.CardViewViewHolder> {

    private ArrayList<TvShowModel> list;

    public CardViewTvShowAdapter(ArrayList<TvShowModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_each, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final TvShowModel show = list.get(i);
        Picasso.get().load(show.getPoster()).into(cardViewViewHolder.img_poster);
        cardViewViewHolder.str_description.setText(show.getDescription());
        cardViewViewHolder.str_episode.setText(show.getEpisode()+" Episodes");
        cardViewViewHolder.str_title.setText(show.getTitle());

        cardViewViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = cardViewViewHolder.itemView.getContext();

                Toast.makeText(cardViewViewHolder.itemView.getContext(), "Kamu memilih " + list.get(cardViewViewHolder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
                TvShowModel tvshow = new TvShowModel();

                tvshow.setTitle(list.get(cardViewViewHolder.getAdapterPosition()).getTitle());
                tvshow.setRelease(list.get(cardViewViewHolder.getAdapterPosition()).getRelease());
                tvshow.setDescription(list.get(cardViewViewHolder.getAdapterPosition()).getDescription());
                tvshow.setEpisode(list.get(cardViewViewHolder.getAdapterPosition()).getEpisode());
                tvshow.setCast(list.get(cardViewViewHolder.getAdapterPosition()).getCast());
                tvshow.setPoster(list.get(cardViewViewHolder.getAdapterPosition()).getPoster());

                Intent idataShow = new Intent(context, DetailTvShow.class);
                idataShow.putExtra(DetailTvShow.EXTRA_SHOW, tvshow);
                context.startActivity(idataShow);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
            ImageView img_poster;
            TextView str_episode, str_description, str_title;

        public CardViewViewHolder(@NonNull View itemView) {
                super(itemView);
                img_poster = itemView.findViewById(R.id.movie_poster);
                str_description = itemView.findViewById(R.id.movie_description);
                str_episode = itemView.findViewById(R.id.movie_duration);
                str_title = itemView.findViewById(R.id.movie_title);
        }
    }
}
