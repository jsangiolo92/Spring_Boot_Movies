package com.cedrus.movies.Movie.model.external;

import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.model.internal.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class APIResponse {
    private ResponseStatus responseStatus;
    private Categories categories;
    private Object moviesOfGenre;

    public APIResponse() { }

    public APIResponse(Categories categories, int statusCode) {
        this.responseStatus = new ResponseStatus(statusCode);
        this.categories = categories;
    }

    public APIResponse(Object apiResults, int statusCode) {
        this.responseStatus = new ResponseStatus(statusCode);
        this.moviesOfGenre = apiResults;
    }
}
