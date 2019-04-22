package com.cedrus.movies.Movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Movie {
    @Id
    private long id;
    private String title;
    private String releaseDate;
    private double voteAverage;
    private String posterPath;
    private String overview;

    public Movie() { }

}
