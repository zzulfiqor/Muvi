package com.example.muvi;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShowModel implements Parcelable {
    private String title;
    private String episode;
    private String release;
    private String poster;
    private String cast;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.episode);
        dest.writeString(this.release);
        dest.writeString(this.poster);
        dest.writeString(this.cast);
        dest.writeString(this.description);
    }

    public TvShowModel() {
    }

    protected TvShowModel(Parcel in) {
        this.title = in.readString();
        this.episode = in.readString();
        this.release = in.readString();
        this.poster = in.readString();
        this.cast = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<TvShowModel> CREATOR = new Parcelable.Creator<TvShowModel>() {
        @Override
        public TvShowModel createFromParcel(Parcel source) {
            return new TvShowModel(source);
        }

        @Override
        public TvShowModel[] newArray(int size) {
            return new TvShowModel[size];
        }
    };
}
