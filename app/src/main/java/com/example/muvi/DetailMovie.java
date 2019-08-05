package com.example.muvi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMovie extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailRelease = findViewById(R.id.detail_release);
        TextView detailDuration = findViewById(R.id.detail_duration);
        TextView detailCast = findViewById(R.id.detail_cast);
        TextView detailDescription = findViewById(R.id.detail_sinopsis);
        ImageView detailPoster = findViewById(R.id.detail_poster);

        MovieModel movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        detailTitle.setText(movie.getTitle());
        detailRelease.setText(movie.getRelease());
        detailDuration.setText(movie.getDuration()+" Minutes");
        detailCast.setText(movie.getCast());
        detailDescription.setText(movie.getDescription());
        Picasso.get().load(movie.getPoster()).into(detailPoster);


    }
}
