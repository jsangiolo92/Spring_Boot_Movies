package com.cedrus.movies.Movie.repository;

import com.cedrus.movies.Movie.model.internal.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
