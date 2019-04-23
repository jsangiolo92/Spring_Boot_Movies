package com.cedrus.movies.Movie.model.external;

import com.cedrus.movies.Movie.model.internal.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
public class MovieResponse {
    private ResponseStatus responseStatus;
    private List<Movie> favoriteMovies;

    public MovieResponse() { }

    public MovieResponse(List<Movie> movieList, int statusCode) {
        this.responseStatus = new ResponseStatus(statusCode);
        this.favoriteMovies = movieList;
    }

    public MovieResponse(boolean isSuccessful, int statusCode, String statusMessage) {
        this.responseStatus = new ResponseStatus(isSuccessful, statusCode, statusMessage);
    }
}
