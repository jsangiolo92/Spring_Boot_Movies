package com.cedrus.movies.Movie.repository;

import com.cedrus.movies.Movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
