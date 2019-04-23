package com.cedrus.movies.Movie.controller;

import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @Autowired
    APIService apiService;

    @RequestMapping("/api")
    public Categories api() {
        return apiService.getCategories();
    }

    @RequestMapping(value = "api/genre/{id}", method = RequestMethod.GET)
    public Object getMoviesByGenre(@PathVariable int id) {
        return apiService.getMoviesByGenre(id);
    }
}
