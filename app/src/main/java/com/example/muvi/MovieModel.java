package com.example.muvi;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {
    private String title;
    private String duration;
    private String release;
    private String cast;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String poster;
    private String description;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.duration);
        dest.writeString(this.release);
        dest.writeString(this.cast);
        dest.writeString(this.poster);
        dest.writeString(this.description);
    }

    public MovieModel() {
    }

    protected MovieModel(Parcel in) {
        this.title = in.readString();
        this.duration = in.readString();
        this.release = in.readString();
        this.cast = in.readString();
        this.poster = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<MovieModel> CREATOR = new Parcelable.Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel source) {
            return new MovieModel(source);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };
}
