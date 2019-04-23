package com.cedrus.movies.Movie.service;

import com.cedrus.movies.Movie.model.internal.Categories;
import com.cedrus.movies.Movie.model.internal.Config;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APIService {

//    @RequestMapping(value= "https://api.themoviedb.org/3/genre/movie/list?api_key=e0fef5117db0c8a76a608500a570fa26&language=en-US", method = RequestMethod.GET)
    public Categories getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        String key = new Config().getApiKey();
        String url = "https://api.themoviedb.org/3/genre/movie/list?api_key=" + key + "&language=en-US";
        Categories categories = restTemplate.getForObject(url, Categories.class);
        return categories;
    }

}
