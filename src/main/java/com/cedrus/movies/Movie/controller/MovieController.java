package com.cedrus.movies.Movie.controller;

import com.cedrus.movies.Movie.model.internal.Movie;
import com.cedrus.movies.Movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "favorites", method = RequestMethod.GET)
    public List<Movie> getFavorites() {
        return movieService.getMovies();
    }

    @RequestMapping(value = "favorites", method = RequestMethod.POST)
    public void addToFavorites(@RequestBody String fullMovie) {
        movieService.addMovie(fullMovie);
    }

    @RequestMapping(value = "favorites", method = RequestMethod.DELETE)
    public void removeFromFavorites(@RequestBody Movie movie) {
        movieService.deleteMovie(movie);
    }
}
