package com.cedrus.movies.Movie.controller;

import com.cedrus.movies.Movie.model.external.APIResponse;
import com.cedrus.movies.Movie.model.external.MovieResponse;
import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.model.internal.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    public ResponseEntity<APIResponse> marshallResponse(Categories categories, int statusCode, HttpStatus httpStatus) {
        APIResponse response = new APIResponse(categories, statusCode);
        return new ResponseEntity<>(response, httpStatus);
    }

    public ResponseEntity<APIResponse> marshallResponse(Object apiResults, int statusCode, HttpStatus httpStatus) {
        APIResponse response = new APIResponse(apiResults, statusCode);
        return new ResponseEntity<>(response, httpStatus);
    }

    public ResponseEntity<MovieResponse> marshallResponse(List<Movie> movies, int statusCode, HttpStatus httpStatus) {
        MovieResponse response = new MovieResponse(movies, statusCode);
        return new ResponseEntity<>(response, httpStatus);
    }

    public ResponseEntity<MovieResponse> marshallResponse(boolean isSuccessful, int statusCode, String statusMessage, HttpStatus httpStatus) {
        MovieResponse response = new MovieResponse(isSuccessful, statusCode, statusMessage);
        return new ResponseEntity<>(response, httpStatus);
    }
}
