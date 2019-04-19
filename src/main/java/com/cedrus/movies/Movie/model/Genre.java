package com.cedrus.movies.Movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Genre {
    public int id;
    public String name;

    public Genre() { }
}
