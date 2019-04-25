package com.cedrus.movies.Movie.model.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

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
    @Lob
    @Column(name="OVERVIEW", length=1000)
    private String overview;

    public Movie() { }

}
