package com.cedrus.movies.Movie.service;

import com.cedrus.movies.Movie.model.internal.Movie;
import com.cedrus.movies.Movie.repository.MovieRepo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepo movieRepo;

    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    public void addMovie(Movie newMovie) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
        try {
//            JsonNode root = mapper.readTree(fullMovie);
//
//            long id = root.get("id").asLong();
//            String title = root.get("title").asText();
//            String releaseDate = root.get("release_date").asText();
//            double voteAverage = root.get("vote_average").asDouble();
//            String posterPath = root.get("poster_path").asText();
//            String overview = root.get("overview").asText();
//
//            Movie newMovie = new Movie(id, title, releaseDate, voteAverage, posterPath, overview);
            movieRepo.save(newMovie);
        } catch (Exception e) {
            throw e;
        }
    }

    public void deleteMovie(Movie movie) {
        long id = movie.getId();
        movieRepo.deleteById(id);
    }
}
