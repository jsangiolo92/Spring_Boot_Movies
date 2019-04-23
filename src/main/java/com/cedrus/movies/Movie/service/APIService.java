package com.cedrus.movies.Movie.service;

import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.model.internal.Config;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APIService {

    public Categories getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        String key = new Config().getApiKey();
        String url = "https://api.themoviedb.org/3/genre/movie/list?api_key=" + key + "&language=en-US";
        Categories categories = restTemplate.getForObject(url, Categories.class);
        return categories;
    }

    public Object getMoviesByGenre(int genreId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.themoviedb.org/3/discover/movie?api_key=e0fef5117db0c8a76a608500a570fa26&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_genres=" + genreId;
        Object movieResults = restTemplate.getForObject(url, Object.class);
        return movieResults;
    }
}
