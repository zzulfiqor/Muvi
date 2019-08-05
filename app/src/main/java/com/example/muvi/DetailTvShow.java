package com.example.muvi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailTvShow extends AppCompatActivity {
    public static final String EXTRA_SHOW = "extra_show";

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

        TvShowModel show = getIntent().getParcelableExtra(EXTRA_SHOW);

        detailTitle.setText(show.getTitle());
        detailRelease.setText(show.getRelease());
        detailDuration.setText(show.getEpisode()+" Episodes");
        detailCast.setText(show.getCast());
        detailDescription.setText(show.getDescription());
        Picasso.get().load(show.getPoster()).into(detailPoster);


    }
}
