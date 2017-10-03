package com.theironyard.springmovies;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MovieController {

    static final String API_URL = "https://api.themoviedb.org/3/movie/now_playing" +
            "?api_key=be2a38521a7859c95e2d73c48786e4bb";

    private static RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping("/now-playing")
    public String nowPlaying(Model model) {
        model.addAttribute("movies", getMovies(API_URL));
        return "now-playing";
    }

    @RequestMapping("/medium-popular-long-name")
    public String mediumPopularLongName(Model model) {
        model.addAttribute("movies", getMovies(API_URL)
        .stream()
        .filter(movie -> movie.getTitle().length()>9)
        .filter(movie -> movie.getPopularity()>29 && movie.getPopularity()<81)
        .collect(Collectors.toList()));
        return "medium-popular-long-name";
    }

    public static List<Movie> getMovies(String route) {
        ResultsPage resultsPage = restTemplate.getForObject(route, ResultsPage.class);
        return resultsPage.getResults();
    }

}



