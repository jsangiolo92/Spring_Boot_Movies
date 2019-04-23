package com.cedrus.movies.Movie.model.external;

import com.cedrus.movies.Movie.model.internal.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class MovieResponse {
    private ResponseStatus responseStatus;
    private Movie[] movieList;

    public MovieResponse() { }

    public MovieResponse(Movie[] movieList, int statusCode) {
        this.responseStatus = new ResponseStatus(statusCode);
        this.movieList = movieList;
    }

    public MovieResponse(boolean isSuccessful, int statusCode, String statusMessage) {
        this.responseStatus = new ResponseStatus(isSuccessful, statusCode, statusMessage);
    }
}
