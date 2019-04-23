package com.cedrus.movies.Movie.model.external;

import com.cedrus.movies.Movie.model.internal.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class APIResponse {
    private ResponseStatus responseStatus;
    private Genre[] genreList;

    public APIResponse() { }

    public APIResponse(Genre[] genreList, int statusCode) {
        this.responseStatus = new ResponseStatus(statusCode);
        this.genreList = genreList;
    }
}
