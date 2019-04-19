package com.cedrus.movies.Movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Categories {
    private Genre[] genres;

    public Categories() { }

    public Genre[] getGenres() {
        return this.genres;
    }
}
