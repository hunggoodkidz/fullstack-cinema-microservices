package com.topsquad.ninzy.movieservice.controller;


import com.topsquad.ninzy.movieservice.service.abstracts.MovieSaloonTimeService;
import com.topsquad.ninzy.movieservice.entity.MovieSaloonTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie/movieSaloonTimes/")
@RequiredArgsConstructor
//@CrossOrigin
public class MovieSaloonTimeController {

    private final MovieSaloonTimeService movieSaloonTimeService;

    @GetMapping("getMovieSaloonTimeSaloonAndMovieId/{saloonId}/{movieId}")
    public List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(@PathVariable int saloonId,
                                                                    @PathVariable int movieId) {
       return movieSaloonTimeService.getMovieSaloonTimeSaloonAndMovieId(saloonId, movieId);
    }
}
