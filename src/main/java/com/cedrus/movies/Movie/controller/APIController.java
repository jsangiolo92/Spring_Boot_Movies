package com.cedrus.movies.Movie.controller;

import com.cedrus.movies.Movie.model.external.APIResponse;
import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @Autowired
    APIService apiService;
    @Autowired
    ResponseService responseService;

    @CrossOrigin
    @RequestMapping("/api")
    public ResponseEntity<APIResponse> api() {
        Categories categories = apiService.getCategories();
        return responseService.marshallResponse(categories, 200, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "api/genre/{id}", method = RequestMethod.GET)
    public ResponseEntity<APIResponse> getMoviesByGenre(@PathVariable int id) {
        Object apiResults = apiService.getMoviesByGenre(id);
        return responseService.marshallResponse(apiResults, 200, HttpStatus.OK);
    }
}
