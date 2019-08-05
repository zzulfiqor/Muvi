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

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder>{

    private ArrayList<MovieModel> listMovie;

    public CardViewMovieAdapter(ArrayList<MovieModel> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_each, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final MovieModel movie = listMovie.get(i);
        Picasso.get().load(movie.getPoster()).into(cardViewViewHolder.img_poster);
        cardViewViewHolder.str_description.setText(movie.getDescription());
        cardViewViewHolder.str_duration.setText(movie.getDuration()+" Minutes");
        cardViewViewHolder.str_title.setText(movie.getTitle());

        cardViewViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = cardViewViewHolder.itemView.getContext();

                Toast.makeText(cardViewViewHolder.itemView.getContext(), "Kamu memilih " + listMovie.get(cardViewViewHolder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
                MovieModel movies = new MovieModel();

                movie.setTitle(listMovie.get(cardViewViewHolder.getAdapterPosition()).getTitle());
                movie.setRelease(listMovie.get(cardViewViewHolder.getAdapterPosition()).getRelease());
                movie.setDescription(listMovie.get(cardViewViewHolder.getAdapterPosition()).getDescription());
                movie.setDuration(listMovie.get(cardViewViewHolder.getAdapterPosition()).getDuration());
                movie.setCast(listMovie.get(cardViewViewHolder.getAdapterPosition()).getCast());
                movie.setPoster(listMovie.get(cardViewViewHolder.getAdapterPosition()).getPoster());

                Intent idataMovie = new Intent(context, DetailMovie.class);
                idataMovie.putExtra(DetailMovie.EXTRA_MOVIE, movie);
                context.startActivity(idataMovie);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
            ImageView img_poster;
            TextView str_duration, str_description, str_title;

        public CardViewViewHolder(@NonNull View itemView) {
                super(itemView);
                img_poster = itemView.findViewById(R.id.movie_poster);
                str_description = itemView.findViewById(R.id.movie_description);
                str_duration = itemView.findViewById(R.id.movie_duration);
                str_title = itemView.findViewById(R.id.movie_title);
            }
        }

    }