package org.example;

public class Movie {
    private int movieId;
    private String movieName;
    private String movieDirector;
    private float movieRating;

    public Movie(int movieId, String movieName, String movieDirector, float movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDirector='" + movieDirector + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }
}
