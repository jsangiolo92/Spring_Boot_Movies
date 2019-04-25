package com.cedrus.movies.Movie.controller;

import com.cedrus.movies.Movie.model.external.MovieResponse;
import com.cedrus.movies.Movie.model.internal.Movie;
import com.cedrus.movies.Movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;
    @Autowired
    ResponseService responseService;

    @CrossOrigin
    @RequestMapping(value = "favorites", method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> getFavorites() {
        List<Movie> movies = movieService.getMovies();
        return responseService.marshallResponse(movies, 200, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "favorites", method = RequestMethod.POST)
    public ResponseEntity<MovieResponse> addToFavorites(@RequestBody Movie newMovie) {
        try {
            movieService.addMovie(newMovie);
            return responseService.marshallResponse(true, 201, "Movie added to favorites", HttpStatus.CREATED);
        }
        catch(Exception error) {
            return responseService.marshallResponse(false, 500, error.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "favorites", method = RequestMethod.DELETE)
    public ResponseEntity<MovieResponse> removeFromFavorites(@RequestBody Movie movie) {
        try {
            movieService.deleteMovie(movie);
            return responseService.marshallResponse(true, 202, "Movie removed from favorites", HttpStatus.ACCEPTED);
        }
        catch (Exception error) {
            return responseService.marshallResponse(false, 500, error.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
